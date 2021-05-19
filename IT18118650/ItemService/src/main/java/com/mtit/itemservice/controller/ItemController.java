package com.mtit.itemservice.controller;

import com.mtit.itemservice.dto.ItemRequest;
import com.mtit.itemservice.dto.ItemResponse;
import com.mtit.itemservice.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    ItemResponse
    createItem(@RequestBody ItemRequest request) {
        System.out.println("Item Details : " + request);
        return itemService.createItem(request);
    }
}
