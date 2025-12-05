// task2/Main.java
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        System.out.println("Через for-each:");
        for (String s : list) {
            System.out.println("→ " + s);
        }

        System.out.println("\nЧерез итератор с удалением чётных:");
        MyIterator<String> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            String s = it.next();
            System.out.println("Элемент: " + s);
            if (i % 2 == 1) { // удаляем Beta (индекс 1)
                it.remove();
                System.out.println("  Удалён: " + s);
            }
            i++;
        }

        System.out.println("\nПосле удаления: size = " + list.size());
        for (String s : list) {
            System.out.println("→ " + s);
        }
    }
}