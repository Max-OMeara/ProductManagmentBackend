package com.ProductManagment.Service;

import java.util.List;

import com.ProductManagment.Model.Product;

public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> getAllProducts();

    public Product getProductById(Integer id);

    public void deleteProduct(Integer id);

}
