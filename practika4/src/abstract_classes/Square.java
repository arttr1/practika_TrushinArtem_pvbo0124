package abstract_classes;

public class Square extends Rectangle{
    Square(double a) {
        super(a, a);
    }

    @Override
    String getType(){
        return "Square";
    }
}
