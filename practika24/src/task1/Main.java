// task1/Main.java
public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "8 GB", "1 TB", "3.2 GHz");
        Computer server = ComputerFactory.getComputer("Server", "64 GB", "4 TB", "2.8 GHz");

        System.out.println("PC config: " + pc);
        System.out.println("Server config: " + server);
    }
}
