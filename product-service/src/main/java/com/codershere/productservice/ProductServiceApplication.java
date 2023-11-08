package com.codershere.productservice;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

    @Autowired//Bizim için objeyi oluşturmuş oluyor.BestPractice olan ise constructor oluşturmaktır.
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Product p1 = new Product();
        p1.setId("AZ244");
        p1.setName("Dondurma Makinesi");
        p1.setDescription("Dondurma yapıyr.");
        p1.setPrice(BigDecimal.valueOf(3500));

        productRepository.save(p1);


        Product p2 = Product.builder()
                .id("AIR345")
                .name("AirFryrer")
                .description("Her şeyi yapıyor.")
                .price(BigDecimal.valueOf(5000))
                .build();

        productRepository.save(p2);

        Product p3 = new Product("MK123", "Makarna", "Güzel makarna yapılıyor.",BigDecimal.valueOf(300));
        productRepository.save(p3);
    }
}
