package com.br.systemcontrollstock.mastercontroll.service;

import com.br.systemcontrollstock.mastercontroll.dto.request.ProductRequestDTO;
import com.br.systemcontrollstock.mastercontroll.dto.response.ProductResponseDTO;
import com.br.systemcontrollstock.mastercontroll.exception.ProductNotFoundException;
import com.br.systemcontrollstock.mastercontroll.mapper.ProductMapper;
import com.br.systemcontrollstock.mastercontroll.model.Product;
import com.br.systemcontrollstock.mastercontroll.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ProductService {

    @Autowired
    private  ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;


    public ProductResponseDTO create(ProductRequestDTO productRequestDTO) {
        Product productIsCreate = productMapper.toModel(productRequestDTO);
        Product productIsSave=productRepository.save(productIsCreate);
        return productMapper.toResponse(productIsSave);

    }

    public ProductResponseDTO findByBarcode(String barcode) throws ProductNotFoundException {
        return productMapper.toResponse(verifyExistBarcode(barcode));
    }


    public List<ProductResponseDTO> findAll() {
        List<Product> allProducts= productRepository.findAll();
        return allProducts.stream().map(productMapper::toResponse).collect(Collectors.toList());
    }

    public ProductResponseDTO findById(Long id) throws ProductNotFoundException {
        return productMapper.toResponse(verifyExistById(id));
    }

    private Product verifyExistById(Long id) throws ProductNotFoundException {
        return productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("id",id.toString()));
    }
    private Product verifyExistBarcode(String barcode) throws ProductNotFoundException {
        return productRepository.findByBarcode(barcode).orElseThrow(() -> new ProductNotFoundException("barcode",barcode));
    }

    public void deleteByBarcode(String barcode) throws ProductNotFoundException {
        productRepository.delete(verifyExistBarcode(barcode));
    }

    public void deleteById(Long id) throws ProductNotFoundException {
        productRepository.delete(verifyExistById(id));

    }
}
