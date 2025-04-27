package org.example.pragmaticjavaspring.ch2.VO.self_validation;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Color2 {

    public final int r;
    public final int g;
    public final int b;

    public Color2(int r, int g, int b) {
        this.r = validateComponent(r, "r");
        this.g = validateComponent(g, "g");
        this.b = validateComponent(b, "b");
    }

    private static int validateComponent(int value, String name) {
        if (value < 0 || value > 255) {
            throw new IllegalArgumentException(
                    String.format("Invalid %s componenet: %d (must be 0-255)", name, value)
            );
        }
        return value;
    }

    public String toHex() {
        return String.format("#%02x%02x%02x", r, g, b);
    }
}
