// task3/Variable.java
public class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name; // Имя игнорируется по ТЗ (всегда одна переменная x)
    }

    @Override
    public int evaluate(int x) {
        return x;
    }

    @Override
    public String toString() {
        return name;
    }
}
