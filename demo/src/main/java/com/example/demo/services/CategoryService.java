package com.example.demo.services;


import com.example.demo.entity.Category;
import com.example.demo.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public void addCategory(Category category){
        categoryRepository.save(category);
    };

    public Category getCategoryById(long id){
        return categoryRepository.findById(id).orElse(null);
    }

    public void deleteCategory(long id){
        categoryRepository.deleteById(id);
    }

}
