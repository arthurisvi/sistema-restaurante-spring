package com.restaurantsystem.mspayments.entities;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.Temporal;
// import javax.persistence.TemporalType;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    // @OneToOne 
    // private Order order;
    // @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime paymentAt;
    private PaymentWay paymentWay;
    private PaymentStatus status;

    public Payment(){
    }

    public Payment(Long id, PaymentWay paymentWay, PaymentStatus status, LocalDateTime paymentAt){
        super();
        this.id = id;
        this.paymentWay = paymentWay;
        this.status = status;
        this.paymentAt = paymentAt;
    }

    public Long getId(){
        return id;
    }

    public PaymentWay getPaymentWay(){
        return paymentWay;
    }

    public PaymentStatus getStatus(){
        return status;
    }

    public LocalDateTime getPaymentAt(){
        return paymentAt;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setPaymentStatus(PaymentStatus status){
        this.status = status;
    }

    public void setPaymentAt(LocalDateTime paymentAt){
        this.paymentAt = paymentAt;
    }

    public void setPaymentWay(PaymentWay paymentWay){
        this.paymentWay = paymentWay;
    }

 
}
