package com.suhasini.BookMyShow.model;


import com.suhasini.BookMyShow.model.enums.PaymentMode;
import com.suhasini.BookMyShow.model.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private double amount ;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus ;
    @ManyToOne
    private Ticket ticket ;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode ;
}
