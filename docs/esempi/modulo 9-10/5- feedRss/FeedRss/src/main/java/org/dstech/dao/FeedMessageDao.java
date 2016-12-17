package org.dstech.dao;

import java.util.List;

import org.dstech.model.FeedMessage;;

public interface FeedMessageDao {

	void saveFeedMessage(FeedMessage feedMessage);

	List<FeedMessage> findAllFeedMessage();

}
