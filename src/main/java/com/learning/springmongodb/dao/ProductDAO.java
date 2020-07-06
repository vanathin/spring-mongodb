
package com.learning.springmongodb.dao;

import com.learning.springmongodb.bean.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends MongoRepository<Product, String> {

    @Query("{\"$text\":{\"$search\": ?0}}")
    Page<Product> findByTextIndex(final String searchKeyword, Pageable pageable);
}
