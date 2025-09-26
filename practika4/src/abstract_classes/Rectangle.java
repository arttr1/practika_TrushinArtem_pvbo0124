package abstract_classes;

public class Rectangle extends Shape {
    double x, y;
    Rectangle(double x, double y){
        this.x = x;
        this.y = y;

    }
    Rectangle(){
        this.x = 1;
        this.y = 1;
    }

    @Override
    String getType(){
        return "rectangle";
    }

    @Override
    double getArea(){
        return x*y;
    }

    @Override
    double getPerimetr(){
        return 2*(x + y);
    }

}
