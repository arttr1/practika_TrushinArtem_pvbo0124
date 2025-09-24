package MathRandom;
import java.util.ArrayList;
import java.util.Random;

public class Circle{
    Random rnd = new Random();

    Point center;
    double radius = rnd.nextDouble();
    double lenght = 2*radius*Math.PI;


    ArrayList<Point> points = new ArrayList<>();
    int pointCount = 0;

    Circle(Point center){
        this.center = center;
    }
    double getRadius(){
        return radius;
    }
    double[] getCenter(){
        double[] coords = center.get();
        return coords;
    }

    void addRandomPoint() {
        double angle = rnd.nextDouble() * 2 * Math.PI;
        double x = center.get()[0] + radius * Math.cos(angle);
        double y = center.get()[1] + radius * Math.sin(angle);
        Point newPoint = new Point(x, y);
        points.add(newPoint);
    }

    ArrayList<Point> getPoints(){
        return points;
    }

}