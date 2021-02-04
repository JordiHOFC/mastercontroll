package com.br.systemcontrollstock.mastercontroll.dto.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDataDTO {
    @NotNull
    private Long product_id;
    private String name;
}
