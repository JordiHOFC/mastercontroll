package com.br.systemcontrollstock.mastercontroll.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class InventoryEntries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @ManyToOne( fetch=FetchType.EAGER, targetEntity = Product.class)
    @JoinColumn(name="product_id", nullable = false)
    private Product product;

    @Column(unique = true,nullable = false)
    private String numberInvoice;

    @Column(nullable = false)
    private Long quantity;

    @Column(nullable = false)
    private Double unitaryValue;

    @Column(nullable = false)
    private String supplier;

    @Column(nullable = false)
    private LocalDate dateEntries;


}
