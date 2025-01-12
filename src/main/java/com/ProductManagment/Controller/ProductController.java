package com.ProductManagment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProductManagment.Model.Product;
import com.ProductManagment.Service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Integer id) {
        return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }

    @GetMapping("/deleteProduct/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
