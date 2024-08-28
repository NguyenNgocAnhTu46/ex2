package edu.iuh.fit;

public class TestRectangle { public static void main(String[] args) {

    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(20.5,5.0);


    // r1.setLength(10.5);

    System.out.println("Length r1: " + r1.getLength());
    System.out.println("Length r2: " + r2.getLength());

    System.out.println("Area r2: " + r2.getArea());
}
}
