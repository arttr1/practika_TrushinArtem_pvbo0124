import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Строки
        String[] strs = {"apple", "banana", "cherry"};
        List<String> strList = ArrayConverter.arrayToList(strs);
        System.out.println("Список строк: " + strList);

        // Целые
        int[] nums = {10, 20, 30};
        List<Integer> intList = ArrayConverter.arrayToList(nums);
        System.out.println("Список int: " + intList);

        // Вещественные
        double[] doubles = {1.1, 2.2, 3.3};
        List<Double> dblList = ArrayConverter.arrayToList(doubles);
        System.out.println("Список double: " + dblList);
    }
}