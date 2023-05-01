package com.mycompany.shapehierarchy;

public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public String toString() {
        return "Square with side " + side;
    }
}

