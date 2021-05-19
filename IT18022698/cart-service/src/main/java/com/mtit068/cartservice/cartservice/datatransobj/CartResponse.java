package com.mtit068.cartservice.cartservice.datatransobj;

public class CartResponse {

    private String cartID;
    private String wishListID;
    private String message;


    public String getCartID() {
        return cartID;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getWishListID() {
        return wishListID;
    }

    public void setWishListID(String wishListID) {
        this.wishListID = wishListID;
    }
}
