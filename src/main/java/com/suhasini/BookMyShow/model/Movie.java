package com.suhasini.BookMyShow.model;

import com.suhasini.BookMyShow.model.enums.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name ;
    private int rating ;
    private String description ;
    @ManyToMany
    private List<Actor> actors ;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures ;
}
