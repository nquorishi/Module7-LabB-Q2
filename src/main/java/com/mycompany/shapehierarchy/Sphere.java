package com.mycompany.shapehierarchy;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }

    public String toString() {
        return "Sphere with radius " + radius;
    }
}

