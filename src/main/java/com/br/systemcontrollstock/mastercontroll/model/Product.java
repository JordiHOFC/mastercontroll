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
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String barcode;

    @Column(nullable = false)
    private String description;

    @Column(name="minimum_quanty", nullable = false)
    private int minimumQuanty;

    @Column(name="maximum_quanty", nullable = false)
    private int maximumQuanty;

    @Column(name="safety_quanty",nullable = false)
    private int safetyQuanty;




}
