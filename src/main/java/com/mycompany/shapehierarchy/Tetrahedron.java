package com.mycompany.shapehierarchy;

public class Tetrahedron extends ThreeDimensionalShape {
    private double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public double getArea() {
        return Math.sqrt(3) * edge * edge;
    }

    public double getVolume() {
        return (Math.sqrt(2) / 12) * edge * edge * edge;
    }

    public String toString() {
        return "Tetrahedron with edge " + edge;
    }
}

