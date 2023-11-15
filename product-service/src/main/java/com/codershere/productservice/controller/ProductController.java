package com.codershere.productservice.controller;

//Dışarıya açılan kapıdır. Burdan ulaşılır.

import com.codershere.productservice.document.Product;
import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import com.codershere.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    //insert eden method post mapping olur.
    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequestDTO productRequestDTO){
        productService.createProduct(productRequestDTO);
    }

    @GetMapping("/product")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDTO> getAllProducts(){
        return productService.getAllProducts();
    }
    
    //http://localhost:6060/ap/v1/MK48
    @GetMapping("{id}")
    public ProductResponseDTO getProduct(@PathVariable String id){
        return productService.getProducts(id);
    }
}
