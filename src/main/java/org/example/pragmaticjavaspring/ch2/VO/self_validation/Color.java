package org.example.pragmaticjavaspring.ch2.VO.self_validation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class Color {

    public final int r;
    public final int g;
    public final int b;

    public String toHex() {
        return String.format("#%02x%02x%02x", r, g, b);
    }
}
