package com.br.systemcontrollstock.mastercontroll.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDTO {

    @NotBlank(message = "product name should be not blank")
    private String name;
    @NotBlank(message = "barcode product should be not blank")
    private String barcode;
    @NotBlank(message = "maximum quantity product should be not blank")
    private int maximumQuanty;
    @NotBlank(message = "minimum quantity product should be not blank")
    private int minimumQuanty;
    @NotBlank(message = "safety quantity product should be not blank")
    private int safetyQuanty;
    
}
