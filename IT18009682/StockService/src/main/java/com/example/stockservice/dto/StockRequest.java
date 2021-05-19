package com.example.stockservice.dto;

public class StockRequest {
    private String deliveryType;
    private String deliveryDetails;

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(String deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    @Override
    public String toString() {
        return "StockRequest{" +
                "deliveryType='" + deliveryType + '\'' +
                ", deliveryDetails='" + deliveryDetails + '\'' +
                '}';
    }
}
