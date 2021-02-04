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
public class InventoryExits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name="product_id", nullable = false)
    @ManyToOne( fetch=FetchType.EAGER, targetEntity = Product.class)
    private Product product;

    @Column(nullable = false)
    private Long quantity;


    @Column(nullable = false)
    private String responsible;

    @Column(nullable = false)
    private LocalDate dateExits;


}
