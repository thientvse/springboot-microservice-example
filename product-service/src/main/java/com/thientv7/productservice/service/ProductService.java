package com.thientv7.productservice.service;


import com.thientv7.productservice.dto.ProductRequest;
import com.thientv7.productservice.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
