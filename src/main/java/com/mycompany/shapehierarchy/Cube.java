package com.mycompany.shapehierarchy;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return 6 * side * side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public String toString() {
        return "Cube with side " + side;
    }
}

