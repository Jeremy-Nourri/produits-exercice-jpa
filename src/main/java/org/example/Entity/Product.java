package org.example.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
@Setter
@Getter
@Entity
@Inheritance(strategy =  InheritanceType.SINGLE_TABLE)
@SuperBuilder

public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double price;

    public Product() {}

}
