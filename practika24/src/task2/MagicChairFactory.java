// task2/MagicChairFactory.java
public class MagicChairFactory implements ChairFactory {
    @Override public Chair createChair() { return new MagicChair(); }
}

