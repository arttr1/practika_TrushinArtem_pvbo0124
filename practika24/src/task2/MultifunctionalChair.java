// task2/MultifunctionalChair.java
public class MultifunctionalChair implements Chair {
    @Override public void sit() { System.out.println("Сидим на многофункциональном стуле — массаж, обогрев, Bluetooth."); }
    @Override public String getType() { return "Multifunctional"; }
}

