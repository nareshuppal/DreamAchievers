package com.digital.nextladders.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.Generated;
import java.math.BigInteger;

/**
 * Created by tanup on 5/9/2017.
 */
@Document(collection = "products")
public class Products {

    // Define a sequence - might also be in another class:

    @Id
    private BigInteger id;

    @Indexed(unique = true)
    private String productId;

    @Indexed(unique = true)
    private String productName;

    @Field("description")
    private String productDescription;
    @Field("stream")
    private String productStream;
    @Field("active")
    private String productActive;
}
