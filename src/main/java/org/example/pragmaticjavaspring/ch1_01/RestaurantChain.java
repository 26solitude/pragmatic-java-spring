package org.example.pragmaticjavaspring.ch1_01;

import java.util.List;

public class RestaurantChain {

    private List<Store> stores;

    // 매출을 계산하는 함수
    public long calculateRevenue() {
        long revenue = 0;
        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                for (Food food : order.getFoods()) {
                    revenue += food.getPrice();
                }
            }
        }
        return revenue;
    }

    // 순이익을 계산하는 함수
    public long calculateProfit() {
        long cost = 0;
        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                long orderPrice = 0;
                for (Food food : order.getFoods()) {
                    orderPrice += food.getPrice();
                    cost += food.getOriginCost();
                }
                // 결제 금액의 3%를 비용으로 잡는다.
                cost += orderPrice * order.getTransactionFeePercent();
            }
            cost += store.getRentalFee();
        }
        return calculateRevenue() - cost;
    }
}
