package com.br.systemcontrollstock.mastercontroll.mapper;

import com.br.systemcontrollstock.mastercontroll.dto.request.InventoryEntriesRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.InventoryEntriesResponseDTO;
import com.br.systemcontrollstock.mastercontroll.model.InventoryEntries;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InventoryEntriesMapper {
    @Mapping(target = "dateEntries",source = "dateEntries", dateFormat = "yyyy-MM-dd")
    InventoryEntries toModel(InventoryEntriesRequestDTO inventoryEntriesRequestDTO);

    InventoryEntriesResponseDTO toResponse(InventoryEntries inventoryEntries);
}
