import java.util.Map;

public class Main {
    public static void main(String[] args) {
       
        Map<String, Integer> map = Solution.newHashMap("x", 10, "y", 20, "z", 30);

        System.out.println("Map: " + map);

        
        Map<Integer, String> map2 = Solution.newHashMap(1, "one", 2, "two");
        System.out.println("Map2: " + map2);
    }
}