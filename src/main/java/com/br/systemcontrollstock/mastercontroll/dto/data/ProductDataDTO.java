package com.br.systemcontrollstock.mastercontroll.dto.data;

import javax.validation.constraints.NotBlank;

public class ProductDataDTO {
    @NotBlank
    private Long id;
    private String name;
}
