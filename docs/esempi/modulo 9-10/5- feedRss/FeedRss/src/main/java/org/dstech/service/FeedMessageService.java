package org.dstech.service;

import java.util.List;

import org.dstech.model.FeedMessage;

public interface FeedMessageService {

	public void saveFeedMessage(FeedMessage feedMessage);

	List<FeedMessage> findAllFeedMessage();

}
