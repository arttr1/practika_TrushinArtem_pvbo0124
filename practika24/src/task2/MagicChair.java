// task2/MagicChair.java
public class MagicChair implements Chair {
    @Override public void sit() { System.out.println("Сидим на магическом стуле — он парит и поёт!"); }
    @Override public String getType() { return "Magic"; }
}

