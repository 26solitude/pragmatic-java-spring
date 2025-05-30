package org.example.pragmaticjavaspring.ch2.VO.immutable;

import lombok.Getter;


@Getter
public class FilledColor {
    public final int r;
    public final int g;
    public final int b;
    public final Shape shape;

    public FilledColor(int r, int g, int b, Shape shape) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.shape = shape;
    }
}
