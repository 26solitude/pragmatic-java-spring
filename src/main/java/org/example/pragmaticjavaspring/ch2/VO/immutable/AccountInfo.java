package org.example.pragmaticjavaspring.ch2.VO.immutable;

public class AccountInfo {

    private long mileage;

    public AccountLevel getLevel() {
        if (mileage > 100_000) return AccountLevel.DIAMOND;
        else if (mileage > 50_000) return AccountLevel.GOLD;
        else if (mileage > 30_000) return AccountLevel.SILVER;
        else if (mileage > 10_000) return AccountLevel.BRONZE;
        else return AccountLevel.NONE;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }
}
