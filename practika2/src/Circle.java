public class Circle{
    Point center;
    double radius;

    Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    Point getCenter(){
        return this.center;
    }
    double getRadius(){
        return this.radius;
    }

}