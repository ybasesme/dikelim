package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "sehir")
public class Sehir {
    private Long id;
    private Long name;
    private Bolge bolge;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "bolge_id")
    public Bolge getBolge() {
        return bolge;
    }

    public void setBolge(Bolge bolge) {
        this.bolge = bolge;
    }
}
