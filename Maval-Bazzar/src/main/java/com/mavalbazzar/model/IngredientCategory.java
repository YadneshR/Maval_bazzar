package com.mavalbazzar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientCategory {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String name;


    @JsonIgnore
    @ManyToOne
    private Shop shop;


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<IngredientsItem> ingredients= new ArrayList<>();


}
