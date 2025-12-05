// task3/Main.java
public class Main {
    public static void main(String[] args) {
        DoubleKeyHashTable<String> ht = new DoubleKeyHashTable<>();

        ht.put(3.14, "Pi");
        ht.put(2.71, "e");
        ht.put(1.41, "sqrt(2)");
        ht.put(-0.0, "minus zero"); // особый случай — Double.compare(-0.0, 0.0) == 0
        ht.put(0.0, "zero");         // перезапишет -0.0

        System.out.println("Pi: " + ht.get(3.14));
        System.out.println("e: " + ht.get(2.71));
        System.out.println("sqrt(2): " + ht.get(1.41));
        System.out.println("0.0: " + ht.get(0.0));
        System.out.println("Contains 9.99? " + ht.containsKey(9.99));
        System.out.println("Size: " + ht.size());
    }
}