package com.mtit.itemservice.service;

import com.mtit.itemservice.dto.CategoryCreationRequest;
import com.mtit.itemservice.dto.CategoryCreationResponse;
import com.mtit.itemservice.dto.ItemRequest;
import com.mtit.itemservice.dto.ItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class ItemServiceImpl {
    @Autowired
    private RestTemplate restTemplate;

    public ItemResponse createItem(ItemRequest itemRequest) {

        var categoryCreationRequest = new CategoryCreationRequest();
        categoryCreationRequest.setCategory(itemRequest.getCategory());
        categoryCreationRequest.setItemName(itemRequest.getItemName());
        ResponseEntity <CategoryCreationResponse> categoryCreationResponse = restTemplate.postForEntity("http://localhost:8080/category", categoryCreationRequest, CategoryCreationResponse.class);

        var itemResponse = new ItemResponse();
        itemResponse.setItemId(UUID.randomUUID().toString());
        itemResponse.setCategoryId(categoryCreationResponse.getBody().getCategoryId());
        itemResponse.setMessage("Successfully Created The Item");
        return itemResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
