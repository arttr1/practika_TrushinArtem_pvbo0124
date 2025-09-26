package phone;

public class Main {




    public static void main(String[] args) {

        Phone p1 = new Phone("9844567676", "Iphone 16");
        Phone p2 = new Phone("9009847575","Galaxy s24");
        Phone p3 = new Phone("9086867457","Xiaomi blablabla");

        System.out.printf("Номер: %s, модель: %s\n", p1.getNumber(), p1.getModel());
        System.out.printf("Номер: %s, модель: %s\n", p2.getNumber(), p2.getModel());
        System.out.printf("Номер: %s, модель: %s\n", p3.getNumber(), p3.getModel());
        System.out.println();

        p1.receiveCall("Максим");
        p1.receiveCall("Артем", "9084984994");
        System.out.println();

        p1.sendMessage("9009847575", "9086867457", "9086867457");

        System.out.println();
        p2.sendMessage("9086867457", "9086867457");

    }
}
