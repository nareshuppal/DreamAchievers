package com.digital.nextladders.repository;

import com.digital.nextladders.domains.Products;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanup on 5/9/2017.
 */
@Repository
public class AdminManagementRepo {

    public List<Products> getAllProducts(){

        List<Products> productsList= new ArrayList<Products>();

        //access mongo DB and get list of all products in DB
        return productsList;
    }
}
