
package com.learning.springmongodb.dao;

import com.learning.springmongodb.bean.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends MongoRepository<Product, String> {

    //@Query(value= "{jobDescription : ?0}")
    @Query("{\"$text\":{\"$search\": ?0}}")
    List<Product> findByTextIndex(String search);
}
