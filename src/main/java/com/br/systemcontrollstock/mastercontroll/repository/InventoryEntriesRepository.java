package com.br.systemcontrollstock.mastercontroll.repository;

import com.br.systemcontrollstock.mastercontroll.model.InventoryEntries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryEntriesRepository extends JpaRepository<InventoryEntries,Long> {
}
