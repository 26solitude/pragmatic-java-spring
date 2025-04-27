package org.example.pragmaticjavaspring.ch2.VO.equality;

public class main {
    public static void main(String[] args) {
        Color green1 = new Color(0, 1, 0);
        Color green2 = new Color(0, 1, 0);
        System.out.println(green1 == green2);
    }
}
