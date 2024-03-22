package com.lezione.demo.lezione.Entities;

import jakarta.persistence.*;

@Table
@Entity
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;

    public Long getId() {
        return id;
    }
}
