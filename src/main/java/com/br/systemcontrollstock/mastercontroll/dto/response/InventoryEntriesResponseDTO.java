package com.br.systemcontrollstock.mastercontroll.dto.response;

import com.br.systemcontrollstock.mastercontroll.dto.data.ProductDataDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class InventoryEntriesResponseDTO {

    private Long id;

    private ProductDataDTO product;

    private String numberInvoice;


    private Long quantity;


    private Double unitaryValue;


    private String supplier;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateEntries;
}