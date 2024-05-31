package com.luv2code.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="state")
@Data
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id") // join with the country table with country id
    private Country country;
}
