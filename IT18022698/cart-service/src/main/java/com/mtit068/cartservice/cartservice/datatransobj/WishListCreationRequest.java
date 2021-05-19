package com.mtit068.cartservice.cartservice.datatransobj;

public class WishListCreationRequest {

    private String wishListID;
    private String itmID;
    private String itmName;
    private String itmCategory;
    private String itmPrice;


    public String getWishListID() {
        return wishListID;
    }

    public void setWishListID(String wishListID) {
        this.wishListID = wishListID;
    }

    public String getItmID() {
        return itmID;
    }

    public void setItmID(String itmID) {
        this.itmID = itmID;
    }

    public String getItmName() {
        return itmName;
    }

    public void setItmName(String itmName) {
        this.itmName = itmName;
    }

    public String getItmCategory() {
        return itmCategory;
    }

    public void setItmCategory(String itmCategory) {
        this.itmCategory = itmCategory;
    }

    public String getItmPrice() {
        return itmPrice;
    }

    public void setItmPrice(String itmPrice) {
        this.itmPrice = itmPrice;
    }
}
