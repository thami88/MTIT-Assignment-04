package com.example.stockservice.controller;

import com.example.stockservice.dto.StockRequest;
import com.example.stockservice.dto.StockResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/stock")
public class StockController {
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody StockResponse createStock(@RequestBody StockRequest stockRequest) {
        System.out.println("Stock Detail" + stockRequest);
        StockResponse stockResponse = new StockResponse();
        stockResponse.setStockId(UUID.randomUUID().toString());
        stockResponse.setMessage("Successfully create Stock");
        return stockResponse;
    }
}
