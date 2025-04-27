package org.example.pragmaticjavaspring.ch2.VO.immutable;

public class AlphaColor extends Color3 {
    public int a;

    public AlphaColor(int r, int g, int b, int a) {
        super(r, g, b);
        this.a = a;
    }
}
