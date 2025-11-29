public class Main {
    public static void main(String[] args) {
        String[] words = {"first", "second", "third"};
        System.out.println("words[1] = " + ArrayUtils.getElement(words, 1));

        int[] numbers = {100, 200, 300};
        System.out.println("numbers[2] = " + ArrayUtils.getElement(numbers, 2));
    }
}