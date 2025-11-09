import java.util.Scanner;

public class task3{
    static void solution(int a, int b){
        if (a < b){
            System.out.print(a + " ");
            solution(++a, b);
        }
        else if (a > b){
            System.out.print(a + " ");
            solution(--a, b);
        }
        else if (a == b){
            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();

        solution(a, b);
    }
}