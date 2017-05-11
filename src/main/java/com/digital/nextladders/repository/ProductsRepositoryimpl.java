package com.digital.nextladders.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by tanup on 5/11/2017.
 */
public class ProductsRepositoryimpl implements ProductsRepositoryCustom{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public int updateProducts(String productName, String productId){

        return 0;
    }

}
