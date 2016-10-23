/**
 * Created by Gabe Pham on 10/23/2016.
 */
public class Card {
    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int getCardRank()
    {
        return rank;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        switch (rank)
        {
            case 11: sb.append("J");
                break;
            case 12: sb.append("Q");
                break;
            case 13: sb.append("K");
                break;
            case 14: sb.append("A");
                break;
            default: sb.append(rank);
        }
        switch (suit)
        {
            case Spades: sb.append("S");
                break;
            case Hearts: sb.append("H");
                break;
            case Clubs: sb.append("C");
                break;
            case Diamonds: sb.append("D");
        }

        return sb.toString();
    }
}
