package org.projetospring.workshop.services;

import org.projetospring.workshop.entities.Category;
import org.projetospring.workshop.entities.Product;
import org.projetospring.workshop.repositories.CategoryRepository;
import org.projetospring.workshop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
