package com.br.systemcontrollstock.mastercontroll.dto.request;

import com.br.systemcontrollstock.mastercontroll.dto.data.ProductDataDTO;
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

public class InventoryExitsRequestDTO {

    @NotBlank(message = "product should be not blank")
    private ProductDataDTO product;

    @NotBlank(message = "quantity exits product should be not blank")
    private Long quantity;

    @NotBlank(message = "responsible exits product should be not blank")
    private String responsible;

    @NotBlank(message = "date exits product should be not blank")
    private LocalDate dateExits;
}
