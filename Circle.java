public class Circle extends Shape {

    double radius;
    double area;

    Circle(double length) {
        this.radius = length;
    }

    @Override
    public double computeArea() {

        area = radius * radius * Math.PI;
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle - Radius: " + radius + " Area: " + computeArea();
    }
}
