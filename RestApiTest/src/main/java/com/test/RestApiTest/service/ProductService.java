package com.test.RestApiTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.RestApiTest.entity.ProductEntity;
import com.test.RestApiTest.repo.ProductRepo;

@Service
public class ProductService {
        
    @Autowired
    ProductRepo productRepository;
    
    public List<ProductEntity> getAllProduct(){
        return productRepository.findAll();
    }
        
    public ProductEntity getProduct(int id){
        return productRepository.findById(id).get();
    }
        
    public void addProduct(ProductEntity pe){
        productRepository.save(pe);
    }
        
    public void updateProduct(int id, ProductEntity pe){
        if(productRepository.findById(id).isPresent()) {
            ProductEntity oldProductEntity=productRepository.findById(id).get();
            oldProductEntity.setName(pe.getName());
            oldProductEntity.setDescription(pe.getDescription());
            productRepository.save(oldProductEntity);
        }
    }
        
    public void deleteProduct(int id){
        productRepository.deleteById(id);       
    }
}
