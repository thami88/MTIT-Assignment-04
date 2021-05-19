package com.example.deliveryservice.dto;

public class DeliveryRequest {
    private String fullName;
    private String address;
    private String deliveryType;
    private String deliveryDetails;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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
        return "DeliveryRequest{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", deliveryType='" + deliveryType + '\'' +
                ", deliveryDetails='" + deliveryDetails + '\'' +
                '}';
    }
}
