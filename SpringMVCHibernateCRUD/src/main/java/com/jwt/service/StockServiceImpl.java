package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




import com.jwt.dao.StockDAO;
import com.jwt.model.Stock;


@Service
@Transactional

public class StockServiceImpl implements StockService {

	@Autowired
	private StockDAO stockDAO;
	
	
	@Transactional
	public void addStock(Stock stock) {
		stockDAO.addStock(stock);
		
	}

	
	@Transactional
	public List<Stock> getAllStocks() {
		return stockDAO.getAllStocks();
	}

	
	@Transactional
	public void deleteStock(Integer stockId) {
		stockDAO.deleteStock(stockId);
		
	}

	
	public Stock getStock(int stockid) {
		return stockDAO.getStock(stockid);
	}

	
	public Stock updateStock(Stock stock) {
		return stockDAO.updateStock(stock);
	}
	
	@Override
	public Stock updateName(Stock stock) {
		return stockDAO.updateName(stock);
	}
	
	
	@Override
	public Stock getName(String stockid) {
		return stockDAO.getName(stockid);
	}
	
	public void setStockDAO(StockDAO stockDAO) {
		this.stockDAO = stockDAO;
	}


	


	
}
