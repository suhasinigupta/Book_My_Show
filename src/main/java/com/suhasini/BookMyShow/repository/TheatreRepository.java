package com.suhasini.BookMyShow.repository;

import com.suhasini.BookMyShow.model.City;
import com.suhasini.BookMyShow.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository  extends JpaRepository<Theatre, Integer> {
}
