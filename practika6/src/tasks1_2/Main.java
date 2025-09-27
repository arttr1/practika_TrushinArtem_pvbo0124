package tasks1_2;

public class Main {
    public static void main(String[] args) {
        Movable p = new MovablePoint(0, 0, 1, 2);
        Movable c = new MovableCircle(1, 1, 2, 5, 8);

        System.out.println(p.toString());
        System.out.println(c.toString());


    }
}
