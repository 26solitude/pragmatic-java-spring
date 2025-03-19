package org.example.pragmaticjavaspring.ch1.ch1_05.TDA;


public class Account {

    private long money;

    public boolean canAfford(long amount){  // TDA 원칙에 따라 잔액이 물건의 가격보다 큰지 확인
        return money >= amount;
    }

    public void withdraw(long amount){
        money -= amount;
    }
}
