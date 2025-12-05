// task1/Server.java
public class Server extends Computer {
    private final String ram, hdd, cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override public String getRAM() { return ram; }
    @Override public String getHDD() { return hdd; }
    @Override public String getCPU() { return cpu; }
}
