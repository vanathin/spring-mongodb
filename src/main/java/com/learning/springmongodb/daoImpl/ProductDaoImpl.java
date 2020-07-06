package com.learning.springmongodb.daoImpl;

import com.learning.springmongodb.bean.Product;
import com.learning.springmongodb.bean.Response;
import com.learning.springmongodb.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDaoImpl {

    @Autowired
    private ProductDAO productDao;

    public String save(Product product){
        return Optional.ofNullable(product)
                .map(product1 -> productDao.save(product1))
                .map(savedProd -> savedProd.getId())
                .orElseGet(() -> "Product Entity Not Saved");
    }

    public Response<Product> findByTextIndex(String search, int start, int limit){
        Page<Product> list = productDao.findByTextIndex(search, PageRequest.of(start, limit));
        list.getContent();
        Response<Product> resp = new Response<>();
        resp.setMyList(list.getContent());
        resp.setLimit(list.getSize());
        resp.setStart(list.getNumber());
        resp.setSize(list.getNumberOfElements());
        resp.setTotalCount(list.getTotalElements());
        resp.setSort(false);
        return resp;
    }

}
