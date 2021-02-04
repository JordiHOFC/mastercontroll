package com.br.systemcontrollstock.mastercontroll.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDTO {

    private Long product_id;

    private String name;

    private String barcode;

    private Long maximumQuanty;

    private Long minimumQuanty;

    private Long safetyQuanty;

    private Long quantity;
}
