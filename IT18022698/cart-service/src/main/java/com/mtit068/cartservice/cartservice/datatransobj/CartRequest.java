package com.mtit068.cartservice.cartservice.datatransobj;

public class CartRequest {

    private String cartID;
    private String wishListID;
    private String itemID;
    private String itemPrice;
    private String itemName;
    private String itemCategory;
    private String userId;

    public String getCartID() {
        return cartID;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    public String getWishListID() {
        return wishListID;
    }

    public void setWishListID(String wishListID) {
        this.wishListID = wishListID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "CartRequest{" +
                "cartID='" + cartID + '\'' +
                ", wishListID='" + wishListID + '\'' +
                ", itemID='" + itemID + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemCategory='" + itemCategory + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
