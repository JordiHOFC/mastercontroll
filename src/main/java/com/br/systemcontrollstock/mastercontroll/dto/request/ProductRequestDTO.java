package com.br.systemcontrollstock.mastercontroll.dto.request;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductRequestDTO {

    @NotBlank(message = "product name should be not blank")
    private String name;

    @NotBlank(message = "barcode product should be not blank")
    private String barcode;

    @NotBlank(message = "barcode product should be not blank")
    private String description;

    @NotNull(message = "maximum quantity product should be not blank")
    private Long maximumQuanty;

    @NotNull(message = "minimum quantity product should be not blank")
    private Long minimumQuanty;

    @NotNull(message = "safety quantity product should be not blank")
    private Long safetyQuanty;
    
}
