package com.mtit068.wishlistservice.wishlistservice.controller;


import com.mtit068.wishlistservice.wishlistservice.datatransobj.WishListRequest;
import com.mtit068.wishlistservice.wishlistservice.datatransobj.WishListResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("wishlist")
public class WishListController {


    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody WishListResponse createWishList(@RequestBody WishListRequest wishListRequest){

        System.out.println("Wish List Details : " + wishListRequest);

        var wishListResponse = new WishListResponse();

        wishListResponse.setWishListID(UUID.randomUUID().toString());
        wishListResponse.setMessage("Successfully Created the Wish List");

        return wishListResponse;




    }

}
