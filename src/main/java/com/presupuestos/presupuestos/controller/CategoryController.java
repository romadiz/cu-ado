package com.presupuestos.presupuestos.controller;

import com.presupuestos.presupuestos.model.Category;
import com.presupuestos.presupuestos.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping("")
    public List<Category> getCategories(){
        return categoryService.getAllCategories();
    }
}
