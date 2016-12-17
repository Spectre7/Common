package org.dstech.dao;

import java.io.Serializable;

import java.util.List;

import org.dstech.model.FeedMessage;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("feedMessageDao")
public class FeedMessageDaoImpl extends AbstractDao<Serializable, FeedMessage> {

	public void saveFeedMessage(FeedMessage feedMessage) {
		saveOrUpdate(feedMessage);
	}

	@SuppressWarnings("unchecked")
	public List<FeedMessage> findAllFeedMessage() {
		Criteria criteria = createEntityCriteria();
		return (List<FeedMessage>) criteria.list();
	}
}
