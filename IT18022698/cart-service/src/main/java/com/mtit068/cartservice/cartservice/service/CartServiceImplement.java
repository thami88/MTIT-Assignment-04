package com.mtit068.cartservice.cartservice.service;
import com.mtit068.cartservice.cartservice.datatransobj.CartRequest;
import com.mtit068.cartservice.cartservice.datatransobj.CartResponse;
import com.mtit068.cartservice.cartservice.datatransobj.WishListCreationRequest;
import com.mtit068.cartservice.cartservice.datatransobj.WishListCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.UUID;

@Service
public class CartServiceImplement {

    @Autowired
    private RestTemplate restTemplate;

    public CartResponse createCart(CartRequest cartRequest){

        var wishListCreationRequest = new WishListCreationRequest();

        wishListCreationRequest.setWishListID(cartRequest.getWishListID());
        wishListCreationRequest.setItmID(cartRequest.getItemID());
        wishListCreationRequest.setItmName(cartRequest.getItemName());
        wishListCreationRequest.setItmCategory(cartRequest.getItemCategory());
        wishListCreationRequest.setItmPrice(cartRequest.getItemPrice());


        ResponseEntity<WishListCreationResponse> wishListCreationResponse = restTemplate.postForEntity("http://localhost:8080/wishlist", wishListCreationRequest, WishListCreationResponse.class);

        var cartResponse = new CartResponse();

        cartResponse.setCartID(UUID.randomUUID().toString());
        cartResponse.setWishListID(wishListCreationResponse.getBody().getWishListID());
        cartResponse.setMessage("Successfully Created the Cart");

        return cartResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return  builder.build();
    }

    

}
