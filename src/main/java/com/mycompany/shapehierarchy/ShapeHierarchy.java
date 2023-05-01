package com.mycompany.shapehierarchy;

public class ShapeHierarchy {
    public static void main(String[] args) {
        // Creates the array of shapes:
        Shape[] shapes = {
            new Circle(5.0),
            new Square(4.0),
            new Triangle(3.0, 6.0),
            new Sphere(3.0),
            new Cube(2.0),
            new Tetrahedron(4.0)
        };

        // This will be the output:
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            if (shape instanceof TwoDimensionalShape) {
                System.out.println("Area: " + ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                System.out.println("Surface Area: " + ((ThreeDimensionalShape) shape).getArea());
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}
