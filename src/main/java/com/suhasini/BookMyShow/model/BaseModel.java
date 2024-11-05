package com.suhasini.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseModel {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @CreationTimestamp
        private Instant createdAt;
        @UpdateTimestamp
        private Instant updatedAt;
        private String createdBy;
        private String updatedBy;
}