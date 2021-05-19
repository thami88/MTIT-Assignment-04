package com.mtit.invoiceservice.controller;

import com.mtit.invoiceservice.dto.InvoiceRequest;
import com.mtit.invoiceservice.dto.InvoiceResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    InvoiceResponse
    createInvoice(@RequestBody InvoiceRequest invoiceRequest) {
        System.out.println("Invoice Details :" + invoiceRequest);

        InvoiceResponse invoiceResponse = new InvoiceResponse();
        invoiceResponse.setInvoiceId(UUID.randomUUID().toString());
        invoiceResponse.setMessage("Successfully created the Invoice");
        return invoiceResponse;
    }
}
