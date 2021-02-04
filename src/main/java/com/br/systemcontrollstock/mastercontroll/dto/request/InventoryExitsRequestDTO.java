package com.br.systemcontrollstock.mastercontroll.dto.request;

import com.br.systemcontrollstock.mastercontroll.dto.data.ProductDataDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class InventoryExitsRequestDTO {

    @NotNull(message = "product should be not blank")
    private ProductDataDTO product;

    @NotNull(message = "quantity exits product should be not blank")
    private Long quantity;

    @NotBlank(message = "responsible exits product should be not blank")
    private String responsible;

    @NotNull(message = "date exits product should be not blank")
    private String dateExits;
}
