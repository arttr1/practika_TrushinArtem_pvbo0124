import java.util.Scanner;

public class task4{
    static public int countNumbers(int k, int s){
        return recursiveNumbers(k, s, 0, true);
    }
    
    static private int recursiveNumbers(int k, int sum, int i, boolean first){
        if (i == k){
            return sum == 0 ? 1 : 0;
        }

        int count = 0;
        int start = first ? 1 : 0;
        for (int d = start; d <= 9; d++){
            if (sum - d >= 0){
                count += recursiveNumbers(k, sum - d, i + 1, false);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int s = input.nextInt();
        input.close();
        System.out.println(countNumbers(k, s));
    }
}