public class Main {
    public static void main(String[] args) {
        GenericArray<String> ga = new GenericArray<>(3);
        ga.add("Alpha");
        ga.add("Beta");
        System.out.println("Добавлено: Alpha, Beta");
        System.out.println("ga.get(0) = " + ga.get(0));
        System.out.println("ga = " + ga);
    }
}