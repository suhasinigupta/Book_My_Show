package com.suhasini.BookMyShow.model;

import com.suhasini.BookMyShow.model.enums.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show ;
    @ManyToOne
    private Seat seat ;
    private int price ;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus ;

}
