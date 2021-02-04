package com.br.systemcontrollstock.mastercontroll.dto.request;

import com.br.systemcontrollstock.mastercontroll.dto.data.ProductDataDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class InventoryEntriesRequestDTO {

    @NotNull(message = "product should be not blank")
    private ProductDataDTO product;

    @NotBlank(message = "Invoice entries product should be not blank")
    private String numberInvoice;

    @NotNull(message = "quantity entries product should be not blank")
    private Long quantity;

    @NotNull(message = "value unitary entries product should be not blank")
    private Double unitaryValue;

    @NotBlank(message = "supplier entries product should be not blank")
    private String supplier;

    @NotNull(message = "date entries product should be not blank")
    private String dateEntries;
}
