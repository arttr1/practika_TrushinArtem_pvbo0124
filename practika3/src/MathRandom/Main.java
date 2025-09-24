package MathRandom;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    Random rnd = new Random();
    Tester test = new Tester();

    Circle c1 = new Circle(new Point());
    Circle c2 = new Circle(new Point());
    Circle c3 = new Circle(new Point());
    Circle c4 = new Circle(new Point());
    Circle c5 = new Circle(new Point());

    c1.addRandomPoint();
    c1.addRandomPoint();

    test.addCircle(c1);
    test.addCircle(c2);
    test.addCircle(c3);
    test.addCircle(c4);
    test.addCircle(c5);

    System.out.println(test.getMaxCircle().getRadius());
    System.out.println(test.getMinCircle().getRadius());
    System.out.println();

    ArrayList<Circle> circles = test.getCircles();
    for (int i = 0; i < circles.size(); i++){
        System.out.println(circles.get(i).getRadius());
    }


    System.out.println();
    test.sortCircles();
    for (int i = 0; i < circles.size(); i++){
        System.out.println(circles.get(i).getRadius());
    }

    }
}