package edu.ucaldas.creational;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape("Circle");
        System.out.println(circle.draw());

        Shape square = shapeFactory.createShape("Square");
        System.out.println(square.draw());

        Shape unknown = shapeFactory.createShape("Triangle");
        System.out.println(unknown);
    }
}
