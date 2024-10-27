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
}
