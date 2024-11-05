package com.suhasini.BookMyShow.repository;

import com.suhasini.BookMyShow.model.City;
import com.suhasini.BookMyShow.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepository  extends JpaRepository<ShowSeat, Integer> {
}
