package com.mavalbazzar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Veggies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String name;

    private String description;

    private Long price;

    @ManyToOne
    private Category VegetableCategory;

    @Column(length = 1000)
    @ElementCollection
    private List<String> images;

    private boolean available;


    @ManyToOne
    private Shop shop;

    private boolean isGreenleafy;

    private boolean isSeasonal;


    @ManyToMany
    private List<IngredientsItem> ingredients= new ArrayList<>();

    private Date creationDate;


}
