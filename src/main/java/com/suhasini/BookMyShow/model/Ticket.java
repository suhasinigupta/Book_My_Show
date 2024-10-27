package com.suhasini.BookMyShow.model;

import com.suhasini.BookMyShow.model.enums.TicketStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private LocalDateTime ticketTime ;
    private double amount ;
    @OneToMany
    private List<ShowSeat> showSeatList ;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus ;
}
