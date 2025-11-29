import java.io.Serializable;

// T — должен сравниваться (Comparable<T>)
// V — должен быть подклассом Animal И реализовывать Serializable
// K — без ограничений
public class Triple<T extends Comparable<T>, V extends Animal & Serializable, K> {

    private T t;
    private V v;
    private K k;

    public Triple(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() { return t; }
    public V getV() { return v; }
    public K getK() { return k; }

    public void printTypes() {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("V: " + v.getClass().getName());
        System.out.println("K: " + k.getClass().getName());
    }

    @Override
    public String toString() {
        return "Triple{" +
                "t=" + t +
                ", v=" + v +
                ", k=" + k +
                '}';
    }
}