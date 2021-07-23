package com.epam.test.automation.java.practice5;

public class Rectangle {
    private double sideA;
    private double sideB;


    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;

        //Implement constructor with 'a' and 'b' parameters;
        //set sideA and sideB to specified values;
    }
    public Rectangle(double a) {
        //Implement constructor with 'a' parameter;
        //set sideB to default value;
        this.sideA = a;
        this.sideB = 5;
    }

    public Rectangle() {
        // Implement default constructor;
        //set sideA and sideB to default values;
        this.sideA = 4;
        this.sideB = 3;

    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double getSideA() {
        // Delete line below and write your own solution;
       return this.sideA;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double getSideB() {
        // Delete line below and write your own solution;
        return this.sideB;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double area() {
        // Delete line below and write your own solution;
        return this.sideA*this.sideB;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double perimeter() {
        // Delete line below and write your own solution;
        return ((this.sideA*2)+(this.sideB*2));
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public boolean isSquare() {
        // Delete line below and write your own solution;
        return this.sideA == this.sideB;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public void replaceSides() {
        // Delete line below and write your own solution;
        double c;
        c = this.sideA;
        this.sideA = this.sideB;
        this.sideB = c;
    }

}
