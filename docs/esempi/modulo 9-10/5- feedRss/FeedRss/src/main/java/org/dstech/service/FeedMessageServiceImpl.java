package org.dstech.service;

import java.util.List;

import org.dstech.dao.FeedMessageDaoImpl;

import org.dstech.model.FeedMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("service")
@Transactional
public class FeedMessageServiceImpl implements FeedMessageService {

	@Autowired
	private FeedMessageDaoImpl dao;

	public void saveFeedMessage(FeedMessage feedMessage) {
		dao.saveFeedMessage(feedMessage);
	}

	public List<FeedMessage> findAllFeedMessage() {
		return dao.findAllFeedMessage();
	}

}
