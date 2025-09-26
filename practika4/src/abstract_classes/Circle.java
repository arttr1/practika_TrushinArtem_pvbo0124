package abstract_classes;
import java.lang.Math;

public class Circle extends Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    Circle(){
        this.r = 1;
    }

    @Override
    String getType(){
        return "Circle";
    }

    @Override
    double getArea(){
        return Math.PI * r * r;
    }

    @Override
    double getPerimetr(){
        return Math.PI * 2 * r;
    }
}
