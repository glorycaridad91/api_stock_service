package com.gc.api_stock_service.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "stock")
public class Stock {
    @Id
    private Long id;
    private Long idProduct;
    private int quantity;
}
