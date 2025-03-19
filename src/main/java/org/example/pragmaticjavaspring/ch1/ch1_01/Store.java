package org.example.pragmaticjavaspring.ch1.ch1_01;

import lombok.Getter;

import java.util.List;

@Getter
public class Store {

    private List<Order> orders;
    private long rentalFee;
}
