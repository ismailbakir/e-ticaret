package com.codershere.productservice.mapper;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

//DTO entity değişimini yapmak için kullanılır.

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product productRequestToProduct(ProductRequestDTO productRequestDTO);

    ProductResponseDTO productToProductResponse(Product product);

    List<ProductResponseDTO> productListToProductResponseList(List<Product> products);
}
