package com.br.systemcontrollstock.mastercontroll.mapper;

import com.br.systemcontrollstock.mastercontroll.dto.data.ProductDataDTO;
import com.br.systemcontrollstock.mastercontroll.dto.request.InventoryEntriesRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.InventoryEntriesResponseDTO;
import com.br.systemcontrollstock.mastercontroll.model.InventoryEntries;
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
public class InventoryEntriesMapperImpl implements InventoryEntriesMapper {

    @Override
    public InventoryEntries toModel(InventoryEntriesRequestDTO inventoryEntriesRequestDTO) {
        if ( inventoryEntriesRequestDTO == null ) {
            return null;
        }

        InventoryEntries inventoryEntries = new InventoryEntries();

        if ( inventoryEntriesRequestDTO.getDateEntries() != null ) {
            inventoryEntries.setDateEntries( LocalDate.parse( inventoryEntriesRequestDTO.getDateEntries(), DateTimeFormatter.ofPattern( "yyyy-MM-dd" ) ) );
        }
        inventoryEntries.setProduct( productDataDTOToProduct( inventoryEntriesRequestDTO.getProduct() ) );
        inventoryEntries.setNumberInvoice( inventoryEntriesRequestDTO.getNumberInvoice() );
        inventoryEntries.setQuantity( inventoryEntriesRequestDTO.getQuantity() );
        inventoryEntries.setUnitaryValue( inventoryEntriesRequestDTO.getUnitaryValue() );
        inventoryEntries.setSupplier( inventoryEntriesRequestDTO.getSupplier() );

        return inventoryEntries;
    }

    @Override
    public InventoryEntriesResponseDTO toResponse(InventoryEntries inventoryEntries) {
        if ( inventoryEntries == null ) {
            return null;
        }

        InventoryEntriesResponseDTO inventoryEntriesResponseDTO = new InventoryEntriesResponseDTO();

        inventoryEntriesResponseDTO.setId( inventoryEntries.getId() );
        inventoryEntriesResponseDTO.setProduct( productToProductDataDTO( inventoryEntries.getProduct() ) );
        inventoryEntriesResponseDTO.setNumberInvoice( inventoryEntries.getNumberInvoice() );
        inventoryEntriesResponseDTO.setQuantity( inventoryEntries.getQuantity() );
        inventoryEntriesResponseDTO.setUnitaryValue( inventoryEntries.getUnitaryValue() );
        inventoryEntriesResponseDTO.setSupplier( inventoryEntries.getSupplier() );
        inventoryEntriesResponseDTO.setDateEntries( inventoryEntries.getDateEntries() );

        return inventoryEntriesResponseDTO;
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
