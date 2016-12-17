package org.dstech.controller;

import java.util.List;

import org.dstech.model.FeedMessage;
import org.dstech.model.RSSFeedParser;
import org.dstech.service.FeedMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {

	@Autowired
	FeedMessageService service;

	@RequestMapping(value = { "/", "/news" }, method = RequestMethod.GET)
	public String listaNews(ModelMap model) {
		
		System.out.println("chiamata /list");
		String feedUrl = "http://xml.corriereobjects.it/rss/homepage.xml";
		RSSFeedParser parser = new RSSFeedParser(feedUrl);
		List<FeedMessage> feed = parser.readFeedMessage();
		List<FeedMessage> feedMessage = service.findAllFeedMessage();
		for (FeedMessage message : feed) {
			if (!feedMessage.contains(message)) {
				service.saveFeedMessage(message);
			}
		}
		return "news";
	}

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

	public List<FeedMessage> listFeedMessage(ModelMap model) {
		List<FeedMessage> feedMessage = service.findAllFeedMessage();
		model.addAttribute("feedMessage", feedMessage);
		return feedMessage;
	}
}
