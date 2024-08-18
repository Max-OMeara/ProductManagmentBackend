package com.ProductManagment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ProductManagment.Model.Product;
import com.ProductManagment.Repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepo;

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }

    @Override
    public void deleteProduct(Integer id) {
        Product product = productRepo.findById(id).get();

        if (product != null)
            productRepo.delete(product);

    }

}
