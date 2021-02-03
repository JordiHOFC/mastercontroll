package com.br.systemcontrollstock.mastercontroll.dto.response;

import com.br.systemcontrollstock.mastercontroll.dto.data.ProductDataDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class InventoryExitsResponseDTO {

    private Long id;

    private ProductDataDTO product;

    private String responsible;

    private Integer quantity;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateExits;
}