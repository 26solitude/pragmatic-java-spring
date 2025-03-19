package org.example.pragmaticjavaspring.ch1.ch1_05.Non_TDA;

public class Shop {

    public void sell(Account account, Product product) {
        long price = product.getPrice();
        long mileage = account.getMoney();
        if (mileage >= price) {
            account.setMoney(mileage - price);
            System.out.println(product.getName() + "를 구매했습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
