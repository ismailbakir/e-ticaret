package com.codershere.productservice.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@Data //Icerisinde getter setter lar var. ToString() var. Project lombok sitesinde anatasyonlara bakılabilir.
@Builder // productan nesne oluştururken değişkenlerin yerini yanlış yazmamak için kullandık.
public class Product {

    @Id // primary key olduğunu söylemek için
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}
