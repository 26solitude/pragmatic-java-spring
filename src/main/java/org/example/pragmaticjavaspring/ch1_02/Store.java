package org.example.pragmaticjavaspring.ch1_02;

import lombok.Getter;

import java.util.List;

@Getter
public class Store {

    private List<Order> orders;
    private long rentalFee;

    // 비즈니스 로직을 객체가 처리하도록 변경
    public long calculateRevenue() {
        long revenue = 0;
        for (Order order : orders) {
            revenue += order.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Order order : orders) {
            income += order.calculateProfit();
        }
        return income - rentalFee;
    }
}
