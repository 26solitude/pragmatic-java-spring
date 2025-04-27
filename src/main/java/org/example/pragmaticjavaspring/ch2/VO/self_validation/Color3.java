package org.example.pragmaticjavaspring.ch2.VO.self_validation;


public record Color3(int r, int g, int b) {

    public Color3 {
        if (r < 0 || r > 255 ||
                g < 0 || g > 255 ||
                b < 0 || b > 255) {
            throw new IllegalArgumentException("RGB should be 0 to 255");
        }
    }
}
