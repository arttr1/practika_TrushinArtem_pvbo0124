// task2/VictorianChairFactory.java
public class VictorianChairFactory implements ChairFactory {
    @Override public Chair createChair() { return new VictorianChair(); }
}

// task2/MagicChairFactory.java
public class MagicChairFactory implements ChairFactory {
    @Override public Chair createChair() { return new MagicChair(); }
}

// task2/MultifunctionalChairFactory.java
public class MultifunctionalChairFactory implements ChairFactory {
    @Override public Chair createChair() { return new MultifunctionalChair(); }
}
