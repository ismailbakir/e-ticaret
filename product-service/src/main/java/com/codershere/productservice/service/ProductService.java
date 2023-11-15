package com.codershere.productservice.service;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    

    List<ProductResponseDTO> getAllProducts();

    void createProduct(ProductRequestDTO productRequestDTO);


    ProductResponseDTO getProducts(String id);
}
