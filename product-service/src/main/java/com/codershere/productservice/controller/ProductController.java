package com.codershere.productservice.controller;

//Dışarıya açılan kapıdır. Burdan ulaşılır.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @GetMapping("/merhaba")
    public String selamla(){
        return "Merhaba dünya";
    }
}
