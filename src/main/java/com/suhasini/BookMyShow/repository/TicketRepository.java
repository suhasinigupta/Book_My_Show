package com.suhasini.BookMyShow.repository;

import com.suhasini.BookMyShow.model.City;
import com.suhasini.BookMyShow.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository  extends JpaRepository<Ticket, Integer> {
}
