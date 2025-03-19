package org.example.pragmaticjavaspring.ch1.ch1_02;

import lombok.Getter;

import java.util.List;

@Getter
public class Order {

    private List<Food> foods;
    private double transactionFeePercent = 0.03;    // 결제 수수료 3%

    // 비즈니스 로직을 객체가 처리하도록 변경
    public long calculateRevenue() {
        long revenue = 0;
        for (Food food : foods) {
            revenue += food.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Food food : foods) {
            income += food.calculateProfit();
        }
        return (long) (income - calculateRevenue() * transactionFeePercent);
    }
}
