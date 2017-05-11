package com.digital.nextladders.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;

/**
 * Created by tanup on 5/9/2017.
 */
@Document(collection = "products")
public class Products {

    // Define a sequence - might also be in another class:

    @Id
    private long id;

    @Indexed(unique = true)
    private String productId;

    @Indexed(unique = true)
    private String productName;
}
