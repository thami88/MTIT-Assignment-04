package com.mtit068.cartservice.cartservice.controller;


import com.mtit068.cartservice.cartservice.datatransobj.CartRequest;
import com.mtit068.cartservice.cartservice.datatransobj.CartResponse;
import com.mtit068.cartservice.cartservice.service.CartServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartServiceImplement cartService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody CartResponse createCart(@RequestBody CartRequest cartReq){

        System.out.println("Cart Details : " + cartReq);

        var cartResponse = new CartResponse();

        cartResponse.setCartID(UUID.randomUUID().toString());
        cartResponse.setMessage("Successfully Created the Cart");

        return cartService.createCart(cartReq);

    }


}
