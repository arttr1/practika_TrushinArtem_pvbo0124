// task2/VictorianChair.java
public class VictorianChair implements Chair {
    @Override public void sit() { System.out.println("Сидим на викторианском стуле — элегантно и жёстко."); }
    @Override public String getType() { return "Victorian"; }
}

