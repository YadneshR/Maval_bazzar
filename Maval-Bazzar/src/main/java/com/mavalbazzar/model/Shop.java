package com.mavalbazzar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;
import java.util.*;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Shop {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @OneToOne
    private User owner;

    private String name;

    private String description;
    private String cuisineType;

    @OneToOne
    private Address address;

    @Embedded
    private ContactInformation contactinformation;

    private String openingHours;

    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders= new ArrayList<>();

    @ElementCollection
    @Column(length = 1000)
    private List <String> images;

    private LocalDateTime registrationDate;

    private boolean open;

    @JsonIgnore
    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
    private List<Veggies> Vegetables = new ArrayList<>();



}
