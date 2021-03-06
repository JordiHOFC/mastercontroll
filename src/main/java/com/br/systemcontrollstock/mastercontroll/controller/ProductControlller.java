package com.br.systemcontrollstock.mastercontroll.controller;

import com.br.systemcontrollstock.mastercontroll.dto.request.InventoryEntriesRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.request.InventoryExitsRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.request.ProductRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.InventoryEntriesResponseDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.InventoryExitsResponseDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.ProductResponseDTO;
import com.br.systemcontrollstock.mastercontroll.exception.ProductNotFoundException;
import com.br.systemcontrollstock.mastercontroll.model.InventoryExits;
import com.br.systemcontrollstock.mastercontroll.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductControlller {

    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseDTO createProduct(@RequestBody @Valid ProductRequestDTO productRequestDTO){
        return productService.create(productRequestDTO);
    }

    @GetMapping("/{barcode}")
    public ProductResponseDTO findByBarcode(@PathVariable String barcode) throws ProductNotFoundException {
        return productService.findByBarcode(barcode);
    }
    @GetMapping("/{id}")
    public ProductResponseDTO findById(@PathVariable Long id) throws ProductNotFoundException {
        return productService.findById(id);
    }

    @GetMapping
    public List<ProductResponseDTO> findAll(){
        return productService.findAll();
    }

    @DeleteMapping("/{barcode}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String barcode) throws ProductNotFoundException {
        productService.deleteByBarcode(barcode);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws ProductNotFoundException {
        productService.deleteById(id);
    }
    @PostMapping("/entries")
    @ResponseStatus(HttpStatus.CREATED)
    public InventoryEntriesResponseDTO entriesProductInventorie(@RequestBody @Valid InventoryEntriesRequestDTO product){
        return productService.entriesProduct(product);
    }
    @PostMapping("/exits")
    @ResponseStatus(HttpStatus.CREATED)
    public InventoryExitsResponseDTO exitsProductInventorie(@RequestBody @Valid InventoryExitsRequestDTO product){
        return productService.exitsProduct(product);
    }

}
