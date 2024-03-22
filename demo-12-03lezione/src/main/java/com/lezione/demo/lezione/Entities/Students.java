package com.lezione.demo.lezione.Entities;

import jakarta.persistence.*;

@Table
@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String firstname;
    @Column (nullable = false)
    private String lastname;
    @Column (nullable = false , unique = true)
    private String email;
    public Long getId(){
        return id;
    }
}
