package com.suhasini.BookMyShow.model;

import com.suhasini.BookMyShow.model.enums.AuditoriumFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name ;
    private int capacity ;
    @OneToMany
    private List<Show> shows ;
    @OneToMany
    private List<Seat> seat ;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeatures> audiFeatures ;

}
