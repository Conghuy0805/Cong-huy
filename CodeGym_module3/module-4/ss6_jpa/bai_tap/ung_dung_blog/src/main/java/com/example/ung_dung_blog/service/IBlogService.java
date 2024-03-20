package com.example.ung_dung_blog.service;

import com.example.ung_dung_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable , String search);
//    List<Blog> findAll();
    void add(Blog blog);

    Blog view(int id);

    void update(Blog blog, int id);

    void delete(int id);
    Page<Blog> showListCategoryOfBlog(Pageable pageable,int categoryOfBlog);
}
