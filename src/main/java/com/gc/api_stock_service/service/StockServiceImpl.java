package com.gc.api_stock_service.service;

import com.gc.api_stock_service.controller.response.StockResponse;
import com.gc.api_stock_service.domain.Stock;
import com.gc.api_stock_service.repository.StockRepository;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService{

    private final StockRepository stockRepository;

    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
    @Override
    public StockResponse getStockByProductId(Long productId) {
        Stock stock= stockRepository.getStockByIdProduct(productId);
        return new StockResponse(stock.getId(),stock.getIdProduct(),stock.getQuantity());
    }
}
