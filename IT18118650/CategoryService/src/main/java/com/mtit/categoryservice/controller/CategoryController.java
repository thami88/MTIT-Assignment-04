package com.mtit.categoryservice.controller;

import com.mtit.categoryservice.dto.CategoryRequest;
import com.mtit.categoryservice.dto.CategoryResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    CategoryResponse categoryResponse (@RequestBody CategoryRequest categoryRequest) {
        System.out.println("Category Details :" + categoryRequest);
        var categoryResponse = new CategoryResponse();
        categoryResponse.setCategoryId(UUID.randomUUID().toString());
        categoryResponse.setMessage("Successfully Created the category");

        return categoryResponse;
    }
}
