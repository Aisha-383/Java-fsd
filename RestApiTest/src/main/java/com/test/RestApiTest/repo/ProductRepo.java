package com.test.RestApiTest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.RestApiTest.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{

}

