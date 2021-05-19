package com.mtit.itemservice.dto;

public class ItemRequest {
    private String itemName;
    private String category;
    private String condition;
    private String itemSpecifics;
    private String price;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getItemSpecifics() {
        return itemSpecifics;
    }

    public void setItemSpecifics(String itemSpecifics) {
        this.itemSpecifics = itemSpecifics;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemRequest{" +
                "itemName='" + itemName + '\'' +
                ", category='" + category + '\'' +
                ", condition='" + condition + '\'' +
                ", itemSpecifics='" + itemSpecifics + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
