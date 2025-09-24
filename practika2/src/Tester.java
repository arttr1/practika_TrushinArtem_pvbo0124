public class Tester {
    Circle[] circles;
    int count;

    Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    void addCircle(Circle c) {
        if (count < circles.length) {
            circles[count] = c;
            count++;
        } else {
            System.out.println("Массив заполнен");
        }
    }
}