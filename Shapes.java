/**
 * Define and implement class Shapes. This class should have a private ArrayList attribute that can
 * contain shapes (any shape). Name this attribute shapeList. Add the ability to add and remove
 * objects from this attribute using methods add() and remove(). This class should have at least one
 * constructor implemented. This class should also implement a getter and a setter for shapeList.
 * Implement a synchronized public method called compute() in which you iterate through the
 * members of shapeList and make a call to compute the shape’s area and print the result to
 * command line output.
 *
 * @author Gerardo R Padilla Jr.
 */


import java.util.ArrayList;


public class Shapes extends Thread {
    ArrayList<Shape> shapeList;

    Shapes() {
        shapeList = new ArrayList();
    }

    @Override
    public void run() {
        try {
            compute();
            System.out.println("Max Volume Shape: " + max());
            System.out.println("Min Volume Shape: " + min());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Shape max() {
        Shape maxShape = shapeList.get(0);
        for (Shape shape : shapeList) {
            if (maxShape.getArea() < shape.getArea()) {
                maxShape = shape;
            }
        }
        return maxShape;
    }

    public Shape min() {
        Shape minShape = shapeList.get(0);
        for (Shape shape : shapeList) {
            if (minShape.getArea() > shape.getArea()) {
                minShape = shape;
            }
        }
        return minShape;
    }


    public void compute() {
        for (Shape shape : shapeList) {
            shape.computeArea();
            System.out.println(shape);
        }
    }

    public ArrayList getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList shapeList) {
        this.shapeList = shapeList;
    }

    public void add(Shape shape) {
        shapeList.add(shape);

    }

    public void remove(Shape shape) {
        shapeList.remove(shape);
    }

}
