package com.sapient.api.controller;

import com.sapient.api.model.entity.Category;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CategoryController {
    @QueryMapping
    public Category[] categories() {
        return new Category[]{};
    }

    @MutationMapping
    public Category createCategory() {
        return null;
    }
}
