package org.example.pragmaticjavaspring.ch2.VO.immutable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountInfo2 {
    private final int id;
    private final long mileage;

    public AccountLevel getLevel() {
        if (mileage > 100_000) return AccountLevel.DIAMOND;
        else if (mileage > 50_000) return AccountLevel.GOLD;
        else if (mileage > 30_000) return AccountLevel.SILVER;
        else if (mileage > 10_000) return AccountLevel.BRONZE;
        else return AccountLevel.NONE;
    }

    public AccountInfo2 withMileage(long mileage) {
        return new AccountInfo2(this.id, mileage);
    }
}
