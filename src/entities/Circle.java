package entities;

import entities.enums.Color;

public class Circle extends Shape{

    private Double radius;

    private static final double PI = 3.14159;


    public Circle() {
        super();
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area(){
        return PI * radius * radius;
    }
}
