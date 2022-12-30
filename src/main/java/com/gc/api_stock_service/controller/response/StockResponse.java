package com.gc.api_stock_service.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StockResponse {
    private Long id;
    private Long idProduct;
    private int quantity;
}
