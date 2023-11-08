package com.codershere.productservice.controller;

//Dışarıya açılan kapıdır. Burdan ulaşılır.

import com.codershere.productservice.document.Product;
import com.codershere.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    // @GetMapping("/merhaba")
    // public String selamla(){
    //     return "Merhaba dünya";
    // }

    //insert eden metod postmapping olur.
    @PostMapping("/product")
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }
}
