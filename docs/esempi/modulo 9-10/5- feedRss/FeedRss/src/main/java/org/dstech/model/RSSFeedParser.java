package org.dstech.model;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;
import org.dstech.model.FeedMessage;

public class RSSFeedParser {

	static final String TITLE = "title";
	static final String CREATOR = "creator";
	static final String SUBTITLE = "subTitle";
	static final String IMAGE = "image";
	static final String ITEM = "item";
	static final String PUBDATE = "pubDate";

	final URL url;

	public RSSFeedParser(String feedUrl) {
		try {
			this.url = new URL(feedUrl);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<FeedMessage> readFeedMessage() {
		List<FeedMessage> feed = new ArrayList<FeedMessage>();
		try {
			boolean isFeedHeader = true;
			String subTitle = "";
			String title = "";
			String creator = "";
			String pubDate = "";

			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			InputStream in = read();
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();
				if (event.isStartElement()) {
					String localPart = event.asStartElement().getName().getLocalPart();
					switch (localPart) {
					case ITEM:
						if (isFeedHeader) {
							isFeedHeader = false;
							feed.add(new FeedMessage(title, creator, subTitle, pubDate));
						}
						event = eventReader.nextEvent();
						break;
					case TITLE:
						title = getCharacterData(event, eventReader);
						break;

					case CREATOR:
						creator = getCharacterData(event, eventReader);
						break;

					case PUBDATE:
						pubDate = getCharacterData(event, eventReader);
						break;

					}
				} else if (event.isEndElement()) {
					if (event.asEndElement().getName().getLocalPart() == (ITEM)) {
						FeedMessage message = new FeedMessage(title, subTitle, creator, pubDate);
						message.setCreator(creator);
						message.setTitle(title);
						message.setSubTitle(subTitle);
						message.setPubDate(pubDate);
						event = eventReader.nextEvent();
						feed.add(message);

						continue;
					}
				}
			}
		} catch (XMLStreamException e) {
			throw new RuntimeException(e);
		}
		return feed;
	}

	private String getCharacterData(XMLEvent event, XMLEventReader eventReader) throws XMLStreamException {
		String result = "";
		event = eventReader.nextEvent();
		if (event instanceof Characters) {
			result = event.asCharacters().getData();
		}
		return result;
	}

	private InputStream read() {
		try {
			return url.openStream();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}