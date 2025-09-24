import java.util.Scanner;
import java.util.Formatter;


public class Main {

//метод из задания 7
    static int fact(int n){
        int res = 1;
        if (n == 0 || n == 1){
            return res;
        }
        for (int i = 2; i <= n; i++){
            res *= i;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Formatter fmt = new Formatter();


        //задание 3
        int n = input.nextInt();
        int[] arr = new int[n];
        float sum = 0, average;

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        average = sum / n;
        System.out.println("sum = " + sum + "\n" + "avarage = " + average);

        //задание 6
        for (int i = 1; i < 11; i++){
            System.out.printf("%.2f ", 1.0/i);
        }

        //задание 7
        System.out.println(fact(5));


        input.close();
    }
}