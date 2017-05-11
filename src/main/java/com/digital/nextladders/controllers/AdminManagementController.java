package com.digital.nextladders.controllers;

import com.digital.nextladders.domains.Products;
import com.digital.nextladders.repository.ProductsRepository;
import com.digital.nextladders.services.AdminManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

/**
 * Created by tanup on 5/9/2017.
 */

@RestController
@EnableWebMvc
@RequestMapping("api/v1")
public class AdminManagementController {

    @Autowired
    private AdminManagementService adminManagementService;

    @Autowired
    private ProductsRepository productsRepository;

    @RequestMapping(value = "/mgmt/ALL", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Products>> findAllByProducts() {
        //log.info("Dog breed controller find ALL--");
        List<Products> dogBreedList = adminManagementService.getAllProducts();
        List<Products> product= productsRepository.findAll();
        return new ResponseEntity(dogBreedList, org.springframework.http.HttpStatus.OK);
    }

    @RequestMapping(value = "/mgmt/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Products>> findByProductName(@PathVariable("name") String name) {
        //log.info("Dog breed controller find ALL--");
        List<Products> dogBreedList = adminManagementService.getAllProducts();
        List<Products> product= productsRepository.findByProductName("name");
        return new ResponseEntity(dogBreedList, org.springframework.http.HttpStatus.OK);
    }
}