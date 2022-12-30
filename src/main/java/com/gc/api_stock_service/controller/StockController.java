package com.gc.api_stock_service.controller;

import com.gc.api_stock_service.controller.response.StockResponse;
import com.gc.api_stock_service.service.StockService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/api-stock-service/v1")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping(value = "/stock/{idProduct}")
    public ResponseEntity<StockResponse> getStockByProductId(@PathVariable(value = "idProduct") Long productId){
        return new ResponseEntity<>(stockService.getStockByProductId(productId), HttpStatus.OK);
    }

}
