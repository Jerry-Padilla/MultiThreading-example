/**
 * Design and implement a class hierarchy to represent the following 2-D shapes: triangle, circle,
 * rectangle, and hexagon. Remember that all these shapes are descendants from a basic shape and
 * share some attributes and functionality.
 *
 * @author Gerardo R Padilla Jr.
 */


public abstract class Shape {
    double area;
    abstract double getArea();
    abstract double computeArea();
}
