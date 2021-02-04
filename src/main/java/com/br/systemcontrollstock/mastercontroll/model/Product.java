package com.br.systemcontrollstock.mastercontroll.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @Column
    private String name;

    @Column(nullable = false, unique = true)
    private String barcode;

    @Column(name ="description")
    private String description;

    @Column(name="minimum_quanty",nullable = false)
    private Long minimumQuanty;

    @Column(name="maximum_quanty",nullable = false)
    private Long maximumQuanty;

    @Column(name="safety_quanty",nullable = false)
    private Long safetyQuanty;

    @Transient
    private Integer quantity;




}
