package com.gc.api_stock_service.repository;

import com.gc.api_stock_service.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

    @Query("SELECT s FROM Stock s WHERE s.idProduct= ?1")
    Stock getStockByIdProduct(Long idProduct);
}
