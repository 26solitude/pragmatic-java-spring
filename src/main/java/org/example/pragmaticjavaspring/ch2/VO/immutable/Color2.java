package org.example.pragmaticjavaspring.ch2.VO.immutable;

import java.util.Random;

public class Color2 {

    public final int r;
    public final int g;
    public final int b;

    public Color2(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Color randomColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }
}
