package com.example.ung_dung_blog.controller;

import com.example.ung_dung_blog.model.Blog;
import com.example.ung_dung_blog.model.Category;
import com.example.ung_dung_blog.service.IBlogService;
import com.example.ung_dung_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")

public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String showList(Model model, @RequestParam(defaultValue = "", required = false) String search,
                           @PageableDefault(page = 0, size = 3, sort = "date", direction = Sort.Direction.ASC) Pageable pageable) {
        Page<Blog> listBlog = iBlogService.findAll(pageable, search);
        List<Category> listCategory = iCategoryService.listCategory();
        model.addAttribute("listCategory", listCategory);
        model.addAttribute("listBlog", listBlog);
        model.addAttribute("search", search);
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        List<Category> list = iCategoryService.listCategory();
        model.addAttribute("list", list);
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.add(blog);
        redirectAttributes.addFlashAttribute("mess", "ADD SUCCESS");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/view")
    public String showView(@PathVariable int id, Model model) {
        Blog blog = iBlogService.view(id);
        model.addAttribute("blog", blog);
        return "view";
    }

    @GetMapping("/{id}/update")
    public String showUpdate(@PathVariable int id, Model model) {
        Blog blogUpdate = iBlogService.view(id);
        List<Category> list = iCategoryService.listCategory();
        model.addAttribute("list", list);
        model.addAttribute("blogUpdate", blogUpdate);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.update(blog, blog.getId());
        redirectAttributes.addFlashAttribute("mess", "UPDATE SUCCESS");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirectAttributes) {
        iBlogService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "DELETE SUCCESS");
        return "redirect:/blog";
    }

    @GetMapping("/category/{categoryId}")
    public String showCategory(@PageableDefault(page = 0, size = 2) Pageable pageable, @PathVariable int categoryId, Model model) {
        Page<Blog> blogOfCategory = iBlogService.showListCategoryOfBlog(pageable, categoryId);
        List<Category> listCategory = iCategoryService.listCategory();
        model.addAttribute("listCategory", listCategory);
        model.addAttribute("blogOfCategory", blogOfCategory);
        model.addAttribute("categoryId", categoryId);
        return "category";
    }

}
