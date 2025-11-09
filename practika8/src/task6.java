import java.util.Scanner;

public class task6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        if (isPrime(n,2))
            System.out.println("YES");
        else 
            System.out.println("NO");
    }

    public static boolean isPrime(int n, int d){
        if (d * d > n)
            return true;
        if (n % d == 0)
            return false;
        return isPrime(n, ++d);
    }
}