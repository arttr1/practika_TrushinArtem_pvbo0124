import java.util.Scanner;

public class task8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        input.close();
        if (polindrom(word))
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
    public static boolean polindrom(String word){
        int len = word.length();
        for (int i = 0; i < len/2; i++){
            if (word.charAt(i) != word.charAt(len - 1 - i))
                return false;
        }
        return true;
    }
}