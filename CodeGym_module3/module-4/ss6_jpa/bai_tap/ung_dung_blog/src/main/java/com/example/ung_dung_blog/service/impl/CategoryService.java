package com.example.ung_dung_blog.service.impl;

import com.example.ung_dung_blog.model.Category;
import com.example.ung_dung_blog.repository.ICategoryRepository;
import com.example.ung_dung_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> listCategory() {
        return iCategoryRepository.findAll();
    }
}
