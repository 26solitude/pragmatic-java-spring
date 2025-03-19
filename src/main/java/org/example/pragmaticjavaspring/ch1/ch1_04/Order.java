package org.example.pragmaticjavaspring.ch1.ch1_04;

import lombok.Getter;

import java.util.List;

@Getter
public class Order implements Calculable {

    private List<Calculable> items;     // 앞으로 다양한 제품이 들어올 수 있으므로 이름을 변경
    private double transactionFeePercent = 0.03;    // 결제 수수료 3%

    @Override
    public long calculateRevenue() {
        long revenue = 0;
        for (Calculable item : items) {
            revenue += item.calculateRevenue();
        }
        return revenue;
    }

    @Override
    public long calculateProfit() {
        long income = 0;
        for (Calculable item : items) {
            income += item.calculateProfit();
        }
        return (long) (income - calculateRevenue() * transactionFeePercent);
    }
}
