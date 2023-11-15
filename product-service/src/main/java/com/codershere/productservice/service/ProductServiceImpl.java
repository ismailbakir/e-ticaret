package com.codershere.productservice.service;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import com.codershere.productservice.mapper.ProductMapper;
import com.codershere.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//ProductService nin implement edilmesi gereklidir.
@Service
@Slf4j
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;



    @Override
    public List<ProductResponseDTO> getAllProducts() {

        List<Product> products = productRepository.findAll();
        return productMapper.productListToProductResponseList(products);
    }

    @Override
    public void createProduct(ProductRequestDTO productRequestDTO) {

        Product product = productMapper.productRequestToProduct(productRequestDTO);
        productRepository.save(product);
        log.info("{} idli product kaydedildi.", product.getId());
    }

    @Override
    public ProductResponseDTO getProducts(String id) {
       Optional<Product> optProduct =  productRepository.findById(id);
        return optProduct.map(product -> productMapper.productToProductResponse(product)).orElse(null);
    }
}
