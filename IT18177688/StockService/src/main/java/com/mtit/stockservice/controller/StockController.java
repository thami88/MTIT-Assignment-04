package com.mtit.stockservice.controller;

import com.mtit.stockservice.dto.StockRequest;
import com.mtit.stockservice.dto.StockResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/stock")
public class StockController {
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    StockResponse
    createStock(@RequestBody StockRequest stockRequest) {
        System.out.println("Stock Details :" + stockRequest);
        StockResponse stockResponse = new StockResponse();
        stockResponse.setStockId(UUID.randomUUID().toString());
        stockResponse.setMessage("Successfully updated the stock");
        return stockResponse;
    }
}
