// task2/VictorianChair.java
public class VictorianChair implements Chair {
    @Override public void sit() { System.out.println("Сидим на викторианском стуле — элегантно и жёстко."); }
    @Override public String getType() { return "Victorian"; }
}

// task2/MagicChair.java
public class MagicChair implements Chair {
    @Override public void sit() { System.out.println("Сидим на магическом стуле — он парит и поёт!"); }
    @Override public String getType() { return "Magic"; }
}

// task2/MultifunctionalChair.java
public class MultifunctionalChair implements Chair {
    @Override public void sit() { System.out.println("Сидим на многофункциональном стуле — массаж, обогрев, Bluetooth."); }
    @Override public String getType() { return "Multifunctional"; }
}
