package com.restaurantsystem.msusers.entities;

public enum PaymentStatus {
    WAITING_PAYMENT("Processando pagamento"),
    PAYED("Pago");

    private String paymentStatus;

    PaymentStatus (String paymentStatus){
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }
}
