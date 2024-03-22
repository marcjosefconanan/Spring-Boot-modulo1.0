package com.lezione.demo.lezione.Entities;

import jakarta.persistence.*;

@Table
@Entity
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "Students_id", nullable = false)
    private Students students;

    @ManyToOne
    @JoinColumn(name = "Classes_id", nullable = false)
    private Classes classes;
    public Long getId(){
        return id;
    }
}
