package com.digital.nextladders.services;

import com.digital.nextladders.domains.Products;
import com.digital.nextladders.repository.AdminManagementRepo;
import com.digital.nextladders.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanup on 5/9/2017.
 */

@Service
public class AdminManagementService {

    @Autowired
    AdminManagementRepo adminManagementRepo;
    @Autowired
    ProductsRepository productsRepository;
   public List<Products> getAllProducts(){

       List<Products> productsList= new ArrayList<Products>();
       productsList=productsRepository.findAll();
      // productsRepository.updateProducts("productTest2","test2");
       return productsList;
   }
}
