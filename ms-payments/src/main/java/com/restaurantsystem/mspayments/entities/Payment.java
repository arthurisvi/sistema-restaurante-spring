package com.restaurantsystem.mspayments.entities;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.Temporal;
// import javax.persistence.TemporalType;

@Entity
public class Payment implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    // @OneToOne 
    // private Order order;
    private PaymentWay paymentWay;
    private PaymentStatus status;
    private LocalDateTime requestDate;
    private LocalDateTime paymentAt;


    public Payment(){
    }

    public Payment(Long id, PaymentWay paymentWay, PaymentStatus status, LocalDateTime requestDate, LocalDateTime paymentAt){
        super();
        this.id = id;
        this.requestDate = requestDate;
        this.paymentWay = paymentWay;
        this.status = status;
        this.paymentAt = paymentAt;
    }

    public Long getId(){
        return id;
    }

    public LocalDateTime getRequestDate(){
        return requestDate;
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

    public void setRequestDate(LocalDateTime requestDate){
        this.requestDate = requestDate;
    }

    public void setStatus(PaymentStatus status){
        this.status = status;
    }

    public void setPaymentAt(LocalDateTime paymentAt){
        this.paymentAt = paymentAt;
    }

    public void setPaymentWay(PaymentWay paymentWay){
        this.paymentWay = paymentWay;
    }

 
}
