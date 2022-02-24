package com.restaurantsystem.mspayments.entities;

public enum PaymentWay {
    PIX("Pix"),
    CARD("Cartão"),
    MONEY("Dinheiro");

    private String paymentWay;

    PaymentWay(String paymentWay){
        this.paymentWay = paymentWay;
    }

    public String getPaymentWay(){
        return paymentWay;
    }
}