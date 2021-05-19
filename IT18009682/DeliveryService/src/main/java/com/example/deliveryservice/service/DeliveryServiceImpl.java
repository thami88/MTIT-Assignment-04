package com.example.deliveryservice.service;

import com.example.deliveryservice.dto.DeliveryRequest;
import com.example.deliveryservice.dto.DeliveryResponse;
import com.example.deliveryservice.dto.StockCreationRequest;
import com.example.deliveryservice.dto.StockCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class DeliveryServiceImpl {
    @Autowired
    private RestTemplate restTemplate;

    public DeliveryResponse createDelivery(DeliveryRequest deliveryRequest) {

        StockCreationRequest stockCreationRequest = new StockCreationRequest();
        stockCreationRequest.setDeliveryDetails(deliveryRequest.getDeliveryDetails());
        stockCreationRequest.setDeliveryType(deliveryRequest.getDeliveryType());
        ResponseEntity <StockCreationResponse> stockCreationResponse = restTemplate.postForEntity("http://localhost:8989/stock", stockCreationRequest, StockCreationResponse.class);

        DeliveryResponse deliveryResponse = new DeliveryResponse();
        deliveryResponse.setDeliveryId(UUID.randomUUID().toString());
        deliveryResponse.setStockId(UUID.randomUUID().toString());
        deliveryResponse.setMessage("Successfully Created Stock and Delivery");

        return deliveryResponse;
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
