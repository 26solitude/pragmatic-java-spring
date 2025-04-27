package org.example.pragmaticjavaspring.ch2.VO.immutable;


import lombok.Data;

@Data
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
}
