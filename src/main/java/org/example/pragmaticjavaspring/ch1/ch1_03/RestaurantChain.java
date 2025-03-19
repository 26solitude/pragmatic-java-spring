package org.example.pragmaticjavaspring.ch1.ch1_03;

import java.util.List;

public class RestaurantChain implements Calculable { // 역할을 구현

    private List<Calculable> stores;    // 역할에 의존하도록 변경

    @Override
    public long calculateRevenue() {
        long revenue = 0;
        for (Calculable store : stores) {
            revenue += store.calculateRevenue();
        }
        return revenue;
    }

    @Override
    public long calculateProfit() {
        long income = 0;
        for (Calculable store : stores) {
            income += store.calculateProfit();
        }
        return income;
    }
}
