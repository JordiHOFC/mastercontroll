package com.br.systemcontrollstock.mastercontroll.mapper;

import com.br.systemcontrollstock.mastercontroll.dto.request.InventoryEntriesRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.request.InventoryExitsRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.InventoryEntriesResponseDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.InventoryExitsResponseDTO;
import com.br.systemcontrollstock.mastercontroll.model.InventoryEntries;
import com.br.systemcontrollstock.mastercontroll.model.InventoryExits;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InventoryExitsMapper {
    @Mapping(target = "dateExits",source = "dateExits", dateFormat = "yyyy-MM-dd")
    InventoryExits toModel(InventoryExitsRequestDTO inventoryExitsRequestDTO);

    InventoryExitsResponseDTO toResponse(InventoryExits inventoryExits);
}
