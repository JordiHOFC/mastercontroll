package com.br.systemcontrollstock.mastercontroll.dto.response;

import javax.validation.constraints.NotBlank;

public class ProductResponseDTO {

    private Long id;

    private String name;

    private String barcode;

    private Integer maximumQuanty;

    private Integer minimumQuanty;

    private Integer safetyQuanty;

    private Integer quantity;
}
