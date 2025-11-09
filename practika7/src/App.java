public class App {
    public static void main(String[] args) throws Exception {
        movablePoint p1 = new movablePoint(0, 0, 2, 2);
        movablePoint p2 = new movablePoint(4, 4, 2, 2);
        movableRectangle rectangle = new movableRectangle(p1, p2);

        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println("======");
        System.out.println(rectangle);



    }
}
