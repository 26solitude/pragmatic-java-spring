package org.example.pragmaticjavaspring.ch1_02;

import lombok.Getter;

@Getter
public class Food {

    private long price;
    private long originCost;    // 원가

    // 비즈니스 로직을 객체가 처리하도록 변경
    public long calculateRevenue() {
        return price;
    }

    public long calculateProfit() {
        return price - originCost;
    }
}
