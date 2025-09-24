package MathRandom;
import java.util.Random;

public class Point{
    double x = 0, y = 0;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    Point(){
        this.x = 0;
        this.y = 0;
    }
    void setX(double x){
        this.x = x;
    }
    void setY(double y){
        this.y = y;
    }
    void show(){
        System.out.print(x + " ");
        System.out.print(y + "\n");
    }
    double[] get(){
        double[] coords = {this.x, this.y};
        return coords;
    }
}