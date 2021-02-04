package com.br.systemcontrollstock.mastercontroll.mapper;

import com.br.systemcontrollstock.mastercontroll.dto.request.ProductRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.ProductResponseDTO;
import com.br.systemcontrollstock.mastercontroll.model.Product;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-04T09:49:18-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.9.1 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResponseDTO toResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponseDTO productResponseDTO = new ProductResponseDTO();

        productResponseDTO.setProduct_id( product.getProduct_id() );
        productResponseDTO.setName( product.getName() );
        productResponseDTO.setBarcode( product.getBarcode() );
        productResponseDTO.setMaximumQuanty( product.getMaximumQuanty() );
        productResponseDTO.setMinimumQuanty( product.getMinimumQuanty() );
        productResponseDTO.setSafetyQuanty( product.getSafetyQuanty() );
        if ( product.getQuantity() != null ) {
            productResponseDTO.setQuantity( product.getQuantity().longValue() );
        }

        return productResponseDTO;
    }

    @Override
    public Product toModel(ProductRequestDTO productRequestDTO) {
        if ( productRequestDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( productRequestDTO.getName() );
        product.setBarcode( productRequestDTO.getBarcode() );
        product.setDescription( productRequestDTO.getDescription() );
        product.setMinimumQuanty( productRequestDTO.getMinimumQuanty() );
        product.setMaximumQuanty( productRequestDTO.getMaximumQuanty() );
        product.setSafetyQuanty( productRequestDTO.getSafetyQuanty() );

        return product;
    }
}
