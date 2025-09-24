import java.util.*;

public class Poker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input count of players");
        int n = input.nextInt();

        if (n * 5 > (52-5)){
            System.out.println("There are too many players, the deck is not enough");
            return;
        }

        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K", "A"};

        ArrayList<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + suit);
            }
        }

        Collections.shuffle(deck);

        for (int i = 1; i <= n*5; i++){
            if(i%5 == 0){
                System.out.println(deck.get(i - 1));
                System.out.println();
            } else{
                System.out.println(deck.get(i - 1));
            }
        }
        input.close();
    }
}
