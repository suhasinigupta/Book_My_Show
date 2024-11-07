package com.suhasini.BookMyShow.model;

import com.suhasini.BookMyShow.model.enums.SeatType;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private int row ;
    private int col ;
    private int seatNumber ;
    private SeatType seatType ;

    public Seat(int row, int col, int seatNumber, SeatType seatType ){
        this.row=row ;
        this.col=col ;
        this.seatNumber=seatNumber ;
        this.seatType=seatType ;
    }
}
