package com.digital.nextladders.repository;

import com.digital.nextladders.domains.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by tanup on 5/11/2017.
 */
public interface ProductsRepository extends MongoRepository<Products, Long> {

    java.util.List<Products> findByProductName(String productName);
    java.util.List<Products> findAll();
}
