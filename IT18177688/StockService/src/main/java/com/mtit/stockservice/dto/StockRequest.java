package com.mtit.stockservice.dto;

public class StockRequest {
    private String orderType;
    private String orderDetails;
    private String qty;

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "StockRequest{" +
                "orderType='" + orderType + '\'' +
                ", orderDetails='" + orderDetails + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }
}
