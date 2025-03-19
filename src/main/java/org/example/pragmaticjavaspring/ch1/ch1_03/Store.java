package org.example.pragmaticjavaspring.ch1.ch1_03;

import lombok.Getter;

import java.util.List;

@Getter
public class Store implements Calculable {   // 역할을 구현

    private List<Calculable> orders;    // 역할에 의존하도록 변경
    private long rentalFee;

    @Override
    public long calculateRevenue() {
        long revenue = 0;
        for (Calculable order : orders) {
            revenue += order.calculateRevenue();
        }
        return revenue;
    }

    @Override
    public long calculateProfit() {
        long income = 0;
        for (Calculable order : orders) {
            income += order.calculateProfit();
        }
        return income - rentalFee;
    }
}
