package com.mtit068.wishlistservice.wishlistservice.datatransobj;

public class WishListRequest {

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


    @Override
    public String toString() {
        return "WishListRequest{" +
                "wishListID='" + wishListID + '\'' +
                ", itmID='" + itmID + '\'' +
                ", itmName='" + itmName + '\'' +
                ", itmCategory='" + itmCategory + '\'' +
                ", itmPrice='" + itmPrice + '\'' +
                '}';
    }
}
