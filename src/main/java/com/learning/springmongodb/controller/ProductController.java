package com.learning.springmongodb.controller;

import com.learning.springmongodb.bean.Product;
import com.learning.springmongodb.bean.Response;
import com.learning.springmongodb.daoImpl.ProductDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDaoImpl productImpl;

    @PostMapping(path="/products")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        String id = productImpl.save(product);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(path="/products/{search}")
    public Response<Product> findByTextIndex(
            @PathVariable String search,
            @RequestParam(value="start", defaultValue = "0", required = true) String start,
            @RequestParam(value="limit", defaultValue = "5", required = true) String limit){
        return productImpl.findByTextIndex(search, Integer.parseInt(start), Integer.parseInt(limit));
    }
}
