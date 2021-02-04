package com.br.systemcontrollstock.mastercontroll.mapper;

import com.br.systemcontrollstock.mastercontroll.dto.data.ProductDataDTO;
import com.br.systemcontrollstock.mastercontroll.dto.request.ProductRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.ProductResponseDTO;
import com.br.systemcontrollstock.mastercontroll.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponseDTO toResponse(Product product);
    Product toModel(ProductRequestDTO productRequestDTO);
}
