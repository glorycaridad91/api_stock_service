package com.gc.api_stock_service.service;

import com.gc.api_stock_service.controller.response.StockResponse;

public interface StockService {
    StockResponse getStockByProductId(Long productId);
}
