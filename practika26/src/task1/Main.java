// task1/Main.java
import java.util.Stack;

public class Main {
    /**
     * Инвертирует массив через Stack (LIFO).
     * @param arr исходный массив
     * @return новый массив — инверсия входного
     */
    public static <T> T[] reverseUsingStack(T[] arr) {
        if (arr == null) return null;
        Stack<T> stack = new Stack<>();
        // Заполняем стек
        for (T item : arr) {
            stack.push(item);
        }
        // Извлекаем в обратном порядке
        @SuppressWarnings("unchecked")
        T[] reversed = (T[]) java.lang.reflect.Array.newInstance(
            arr.getClass().getComponentType(), arr.length
        );
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = stack.pop();
        }
        return reversed;
    }

    public static void main(String[] args) {
        // Пример с Integer
        Integer[] nums = {1, 2, 3, 4, 5};
        System.out.println("Исходный: " + java.util.Arrays.toString(nums));
        Integer[] rev = reverseUsingStack(nums);
        System.out.println("Инверсия: " + java.util.Arrays.toString(rev));

        // Пример со String
        String[] words = {"a", "b", "c"};
        System.out.println("\nИсходный: " + java.util.Arrays.toString(words));
        String[] rev2 = reverseUsingStack(words);
        System.out.println("Инверсия: " + java.util.Arrays.toString(rev2));
    }
}