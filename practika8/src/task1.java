import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        for (int i = 1, printed = 0, count = 0; printed < n; printed++){
            System.out.print(i);
            if (printed < n - 1){
                System.out.print(" ");
            }
            count++;
            if (count == i){
                i++;
                count = 0;
            }
        }


    }
}
