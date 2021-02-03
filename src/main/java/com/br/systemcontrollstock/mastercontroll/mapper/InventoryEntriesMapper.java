package com.br.systemcontrollstock.mastercontroll.mapper;

import com.br.systemcontrollstock.mastercontroll.dto.request.InventoryEntriesRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.InventoryEntriesResponseDTO;
import com.br.systemcontrollstock.mastercontroll.model.InventoryEntries;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InventoryEntriesMapper {

    InventoryEntries toModel(InventoryEntriesRequestDTO inventoryEntriesRequestDTO);
    InventoryEntriesResponseDTO toResponse(InventoryEntries inventoryEntries);
}
