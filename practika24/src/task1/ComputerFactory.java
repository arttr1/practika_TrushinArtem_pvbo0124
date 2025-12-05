// task1/ComputerFactory.java
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        switch (type.toLowerCase()) {
            case "pc":      return new PC(ram, hdd, cpu);
            case "server":  return new Server(ram, hdd, cpu);
            default:        throw new IllegalArgumentException("Unknown computer type: " + type);
        }
    }
}
