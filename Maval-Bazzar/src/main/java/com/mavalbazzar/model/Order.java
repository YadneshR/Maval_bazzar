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
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @ManyToOne
    private User customer;

    @JsonIgnore
    @ManyToOne
    private Shop shop;

    private Long totalAmount;

    private String orderStatus;

    private Date createdAt;


    @ManyToOne
    private Address deliveryAddress;


    @OneToMany
    private List<OrderItem>items;


//    private Payment payment;

    private int totalItem;

    private int totalPrice;
}
