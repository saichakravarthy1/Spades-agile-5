/**
 * Created by Gabe Pham on 10/23/2016.
 */
import java.util.ArrayList;
import java.util.Collections;

public class CreateDeck {

    ArrayList<Card> deck = new ArrayList<Card>(52);

    public CreateDeck() {
        for(int i = 2; i<15; i++){
            deck.add(new Card(i,Suit.Spades));
        }
        for(int i = 2; i<15; i++){
            deck.add(new Card(i,Suit.Hearts));
        }
        for(int i = 2; i<15; i++){
            deck.add(new Card(i,Suit.Clubs));
        }
        for(int i = 2; i<15; i++){
            deck.add(new Card(i,Suit.Diamonds));
        }

        Collections.shuffle(deck);
    }

    public void deal(Player player1, Player player2, Player player3, Player player4)
    {
        Player[] temp = {player1, player2, player3, player4};
        int inc = 0;
        for (Card a: deck)
        {
            temp[inc%4].addToHand(a);
            inc++;
        }

    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Card a: deck) {
            sb.append(a.toString());
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
