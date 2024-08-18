package com.ProductManagment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ProductManagment.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
