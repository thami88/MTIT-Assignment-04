package com.mtit.categoryservice.dto;

public class CategoryRequest {
    private String category;
    private String itemName;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "CategoryRequest{" +
                "category='" + category + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
