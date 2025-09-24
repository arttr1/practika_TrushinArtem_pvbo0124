public class Main {
    public static void main(String[] args) {

//    Point point = new Point(1, 4);
//    point.show();
//    Point point1 = new Point();
//    point1.show();
    Tester test = new Tester(3);

    Circle c1 = new Circle(new Point(5, 6), 5);
    Circle c2 = new Circle(new Point(3, 5), 9);

    test.addCircle(c1);
    test.addCircle(c2);
    }
}