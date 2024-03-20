package com.example.ung_dung_blog.service.impl;

import com.example.ung_dung_blog.model.Blog;
import com.example.ung_dung_blog.repository.IBlogRepository;
import com.example.ung_dung_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable, String search) {
        return iBlogRepository.searchAllByTitleContaining(pageable, search);
    }


//    @Override
//    public List<Blog> findAll() {
//        return iBlogRepository.findAll();
//    }

    @Override
    public void add(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog view(int id) {
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Blog blog, int id) {
        iBlogRepository.save(blog);
    }

    @Override
    public void delete(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> showListCategoryOfBlog(Pageable pageable, int categoryOfBlog) {
        return iBlogRepository.showListCategoryId(pageable, categoryOfBlog);
    }
}
