/**
 * Each class needs to have getters and setters defined and
 * implemented for all the attributes. Each leaf shape class (triangle, circle, rectangle, hexagon)
 * should have computeArea() method implemented. Each leaf class should have at least one non-
 * default constructor implemented to allow instantiating an object with appropriate attributes. For
 * example, length and width attributes uniquely define a rectangle object. Each class should have
 * toString() method implemented that outputs the values of all the attributes of the instance of that
 * class to command line.
 *
 * @author Gerardo R Padilla Jr.
 */

public class Hexagon extends Shape {

    double length;
    double area;

    Hexagon(double length) {
        this.length = length;
    }

    @Override
    public double computeArea() {
        area = length * length * Math.sqrt(3.0) * 3 / 2;
        return area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hexagon - Length: " + length + " Area: " + computeArea();
    }
}
