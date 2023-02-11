package com.example.hospital.entities;

import jakarta.persistence.*;

@Entity
@Table(name="ob_doctores")
public class Doctores extends Personas {
    public Doctores() {
        super();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
