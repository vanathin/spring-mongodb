package com.learning.springmongodb.daoImpl;

import com.learning.springmongodb.bean.Product;
import com.learning.springmongodb.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDaoImpl {

    @Autowired
    private ProductDAO productDao;

    public String save(Product product){
        productDao.save(product);
        return product.getId();
    }

    public List<Product> findByTextIndex(String search){
        return productDao.findByTextIndex(search);
    }

}
