package com.digital.nextladders.services;

import com.digital.nextladders.domains.Products;
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

   public List<Products> getAllProducts(){

       List<Products> productsList= new ArrayList<Products>();
       return productsList;
   }
}
