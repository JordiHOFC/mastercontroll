package com.br.systemcontrollstock.mastercontroll.dto.request;

import com.br.systemcontrollstock.mastercontroll.dto.data.ProductDataDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class InventoryEntriesRequestDTO {

    @NotBlank(message = "product should be not blank")
    private ProductDataDTO product;

    @NotBlank(message = "Invoice entries product should be not blank")
    private String numberInvoice;

    @NotBlank(message = "quantity entries product should be not blank")
    private Integer quantity;

    @NotBlank(message = "value unitary entries product should be not blank")
    private Double unitaryValue;

    @NotBlank(message = "supplier entries product should be not blank")
    private String supplier;

    @NotBlank(message = "date entries product should be not blank")
    private LocalDate dateEntries;
}
