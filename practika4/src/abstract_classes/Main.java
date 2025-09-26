package abstract_classes;
public class Main {
    public static void main(String[] args) {
     Square sq = new Square(5);
     Circle c = new Circle();

     System.out.println(sq.getArea());
     System.out.println(sq.getPerimetr());
     System.out.println(sq.getType());
     System.out.println();
     System.out.println(c.getArea());
     System.out.println(c.getPerimetr());
     System.out.println(c.getType());

    }
}
