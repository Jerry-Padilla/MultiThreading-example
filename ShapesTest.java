/**
 * Define and implement class ShapeTest. This class should implement main(). In the body of the
 * main() method instantiate an object of Shapes. Then, instantiate at least 2 objects of each shape
 * type (at least 8 shapes) and add to Shapes. The specific shape initialization parameters, such as
 * length or width, are up to you. Make a call to compute() method in class Shapes. Make sure this
 * method is called in multiple threads. This means that you will need to adjust your
 * implementation of the above classes to allow for concurrent execution ability. Whether you want
 * to use inheritance from a class Thread or implement Runnable interface is up to you. Save this
 * class and its definition into a file named ShapeTest.java.
 *
 * @author Gerardo R Padilla Jr.
 */
public class ShapesTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        for (int i = 0; i < 10; i++) {
            Shapes daShapes = new Shapes();

            Rectangle rect1 = new Rectangle(10 * Math.random(), 10 * Math.random());
            Rectangle rect2 = new Rectangle(10 * Math.random(), 10 * Math.random());


            Circle circle1 = new Circle(10 * Math.random());
            Circle circle2 = new Circle(10 * Math.random());


            Hexagon hexagon1 = new Hexagon(10 * Math.random());
            Hexagon hexagon2 = new Hexagon(10 * Math.random());


            Triangle tri1 = new Triangle(10 * Math.random());
            Triangle tri2 = new Triangle(10 * Math.random());


            daShapes.add(rect1);
            daShapes.add(rect2);


            daShapes.add(circle1);
            daShapes.add(circle2);

            daShapes.add(hexagon1);
            daShapes.add(hexagon2);


            daShapes.add(tri1);
            daShapes.add(tri2);


            daShapes.start();
        }


    }
}
