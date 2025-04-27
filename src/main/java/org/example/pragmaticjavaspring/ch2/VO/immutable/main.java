package org.example.pragmaticjavaspring.ch2.VO.immutable;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        FilledColor filledColor = new FilledColor(1, 0, 0, rectangle);

        // filledColor의 내부 값이 변경돼 불변성이 깨짐
        ((Rectangle) filledColor.getShape()).setWidth(20);
    }
}
