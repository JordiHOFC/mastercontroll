package com.br.systemcontrollstock.mastercontroll.repository;

import com.br.systemcontrollstock.mastercontroll.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Optional<Product> findByBarcode(String barcode);

    @Query(
            value = "SELECT sum(e.quantity) - ( select sum(s.quantity) from inventory_exits as s where s.product_id=?1) "+
                    "from inventory_entries as e "+
                    "where e.product_id= ?1", nativeQuery = true
    )
    Integer findQuantityByProduct(Long id);
}
