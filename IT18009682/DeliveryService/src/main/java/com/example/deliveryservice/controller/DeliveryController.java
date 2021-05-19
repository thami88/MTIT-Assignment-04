package com.example.deliveryservice.controller;

import com.example.deliveryservice.dto.DeliveryRequest;
import com.example.deliveryservice.dto.DeliveryResponse;
import com.example.deliveryservice.service.DeliveryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @Autowired
    private DeliveryServiceImpl deliveryService;

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody
    DeliveryResponse
    createDelivery(@RequestBody DeliveryRequest request) {
        System.out.println("Delivey Details :" + request);
        return deliveryService.createDelivery(request);
    }
}
