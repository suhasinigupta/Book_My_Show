package com.suhasini.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private String name ;
    private int phoneNumber;
    private String email ;
    private String password ;
    @OneToMany
    private List<Ticket> tickets ;

}
