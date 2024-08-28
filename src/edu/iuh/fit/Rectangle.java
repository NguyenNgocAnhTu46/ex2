package edu.iuh.fit;

public class Rectangle { private double length;
    private double width;

    //Constructors

    /**
     * Default constructors
     */
    public Rectangle() {
        this(0.0,0.0);
        //  this.length = 0.0;
        //  this.width = 0.0;
    }
    public Rectangle(double length, double width) {
        if (length<0 || width<0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    //setters / getters
    public double getLength() {
        return length;
    }

    /**
     * Description: Set the lenght of the rectangle
     * @param length The lenght of the ractangle
     * @throws IllegalArgumentException if lenght is less than 0
     */
    public void setLength(double length) {
        if (length < 0.0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    //Methods

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}
