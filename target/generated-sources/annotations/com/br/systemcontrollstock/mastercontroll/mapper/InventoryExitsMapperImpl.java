package com.br.systemcontrollstock.mastercontroll.mapper;

import com.br.systemcontrollstock.mastercontroll.dto.data.ProductDataDTO;
import com.br.systemcontrollstock.mastercontroll.dto.request.InventoryExitsRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.InventoryExitsResponseDTO;
import com.br.systemcontrollstock.mastercontroll.model.InventoryExits;
import com.br.systemcontrollstock.mastercontroll.model.Product;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-04T10:17:15-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.9.1 (Oracle Corporation)"
)
@Component
public class InventoryExitsMapperImpl implements InventoryExitsMapper {

    @Override
    public InventoryExits toModel(InventoryExitsRequestDTO inventoryExitsRequestDTO) {
        if ( inventoryExitsRequestDTO == null ) {
            return null;
        }

        InventoryExits inventoryExits = new InventoryExits();

        if ( inventoryExitsRequestDTO.getDateExits() != null ) {
            inventoryExits.setDateExits( LocalDate.parse( inventoryExitsRequestDTO.getDateExits(), DateTimeFormatter.ofPattern( "yyyy-MM-dd" ) ) );
        }
        inventoryExits.setProduct( productDataDTOToProduct( inventoryExitsRequestDTO.getProduct() ) );
        inventoryExits.setQuantity( inventoryExitsRequestDTO.getQuantity() );
        inventoryExits.setResponsible( inventoryExitsRequestDTO.getResponsible() );

        return inventoryExits;
    }

    @Override
    public InventoryExitsResponseDTO toResponse(InventoryExits inventoryExits) {
        if ( inventoryExits == null ) {
            return null;
        }

        InventoryExitsResponseDTO inventoryExitsResponseDTO = new InventoryExitsResponseDTO();

        inventoryExitsResponseDTO.setId( inventoryExits.getId() );
        inventoryExitsResponseDTO.setProduct( productToProductDataDTO( inventoryExits.getProduct() ) );
        inventoryExitsResponseDTO.setResponsible( inventoryExits.getResponsible() );
        if ( inventoryExits.getQuantity() != null ) {
            inventoryExitsResponseDTO.setQuantity( inventoryExits.getQuantity().intValue() );
        }
        inventoryExitsResponseDTO.setDateExits( inventoryExits.getDateExits() );

        return inventoryExitsResponseDTO;
    }

    protected Product productDataDTOToProduct(ProductDataDTO productDataDTO) {
        if ( productDataDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setProduct_id( productDataDTO.getProduct_id() );
        product.setName( productDataDTO.getName() );

        return product;
    }

    protected ProductDataDTO productToProductDataDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDataDTO productDataDTO = new ProductDataDTO();

        productDataDTO.setProduct_id( product.getProduct_id() );
        productDataDTO.setName( product.getName() );

        return productDataDTO;
    }
}
