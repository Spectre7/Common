package com.mkyong;

import java.util.Date;

import org.hibernate.Session;

import com.mkyong.stock.Stock;
import com.mkyong.stock.StockDailyRecord;
import com.mkyong.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Hibernate one-to-many (Annotation)");
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();
        stock.setStockCode("7052");
        stock.setStockName("PADINI");
        
        session.persist(stock);
        
        StockDailyRecord stockDailyRecords = new StockDailyRecord();
        stockDailyRecords.setPriceOpen(new Float("1.2"));
        stockDailyRecords.setPriceClose(new Float("1.1"));
        stockDailyRecords.setPriceChange(new Float("10.0"));
        stockDailyRecords.setVolume(3000000L);
        stockDailyRecords.setDate(new Date());
        
        stockDailyRecords.setStock(stock);        
        stock.getStockDailyRecords().add(stockDailyRecords);

        session.persist(stockDailyRecords);
        
        Stock stock2 = new Stock();
        stock2.setStockCode("8751");
        stock2.setStockName("TOXY");
        
        session.persist(stock2);
        
        StockDailyRecord stockDailyRecords2 = new StockDailyRecord();
        stockDailyRecords2.setPriceOpen(new Float("2.6"));
        stockDailyRecords2.setPriceClose(new Float("5.4"));
        stockDailyRecords2.setPriceChange(new Float("12.0"));
        stockDailyRecords2.setVolume(4000000L);
        stockDailyRecords2.setDate(new Date());
        
        stockDailyRecords2.setStock(stock2);        
        stock2.getStockDailyRecords().add(stockDailyRecords2);

        session.persist(stockDailyRecords2);

        
        StockDailyRecord stockDailyRecords3 = new StockDailyRecord();
        stockDailyRecords3.setPriceOpen(new Float("2.4"));
        stockDailyRecords3.setPriceClose(new Float("4.9"));
        stockDailyRecords3.setPriceChange(new Float("9.0"));
        stockDailyRecords3.setVolume(4000000L);
        stockDailyRecords3.setDate(new Date());
        
        stockDailyRecords3.setStock(stock2);        
        stock2.getStockDailyRecords().add(stockDailyRecords3);

        session.persist(stockDailyRecords3);
		session.getTransaction().commit();
		
		System.out.println("Done");
	}
}
