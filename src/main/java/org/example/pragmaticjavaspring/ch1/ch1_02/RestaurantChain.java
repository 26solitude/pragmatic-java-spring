package org.example.pragmaticjavaspring.ch1.ch1_02;

import java.util.List;

public class RestaurantChain {

    private List<Store> stores;

    // 매출을 계산하는 함수
    public long calculateRevenue() {
        long revenue = 0;
        for (Store store : stores) {
            revenue += store.calculateRevenue();
        }
        return revenue;
    }

    // 순이익을 계산하는 함수
    public long calculateProfit() {
        long income = 0;
        for (Store store : stores) {
            income += store.calculateProfit();
        }
        return income;
    }
}
