/**
 * Created by Gabe Pham on 10/23/2016.
 */
import java.util.ArrayList;


public class Player {

    private String name;
    private Boolean dealer;
    private int position;   //0 is south, 1 is west, 2 is north and 3 is east
    private int tricksTaken = 0;
    private int tricksBid = 0;
    private int score = 0;
    private boolean NilBid = false;
    private ArrayList<Card> hand = new ArrayList<Card>(13);

    //Use getter and setters for all the players.

    public Player(String name, Boolean dealer, int pos){
        this.name = name;
        this.dealer = dealer;
        this.position = pos;
    }

    public int placeBid(int bid)
    {
        if (bid > 13)
        {
            System.out.println("Cannot place bid higher than 13");
            return -1;
        }
        if (bid == 0)
        {
            NilBid = true;
        }
        tricksBid = bid;
        return bid;
    }

    public String getName()
    {
        return name;
    }

    public boolean isDealer()
    {
        return dealer;
    }

    public int Score()
    {
        score += (tricksTaken * 10);
        if (NilBid)
        {
            if (tricksTaken > 0)
                score -= 100;
            else
                score += 100;
        }
        if (tricksTaken > tricksBid)
            score -= (tricksTaken-tricksBid)*10;
        return score;
    }

    public int getPos()
    {
        return position;
    }

    public ArrayList<Card> getHand()
    {
        return hand;
    }

    public void printHand()
    {
        System.out.print(name + "'s hand: ");
        for (Card a: hand)
        {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void addToHand(Card card){
        hand.add(card);
    }

    public void removeFromHand(Card card){
        hand.remove(card);
    }

    public void orderHand()
    {
        ArrayList<Card> heartsInHand = new ArrayList<Card>();
        ArrayList<Card> diamondsInHand = new ArrayList<Card>();
        ArrayList<Card> spadesInHand = new ArrayList<Card>();
        ArrayList<Card> clubsInHand = new ArrayList<Card>();

        for (Card a: hand)
        {
            switch(a.getSuit())
            {
                case Spades:
                {
                    spadesInHand.add(a);
                    break;
                }
                case Hearts:
                {
                    heartsInHand.add(a);
                    break;
                }
                case Clubs:
                {
                    clubsInHand.add(a);
                    break;
                }
                case Diamonds:
                {
                    diamondsInHand.add(a);
                    break;
                }
            }
        }

        heartsInHand = order(heartsInHand);
        diamondsInHand = order(diamondsInHand);
        spadesInHand = order(spadesInHand);
        clubsInHand = order(clubsInHand);

        hand.clear();
        hand.addAll(heartsInHand);
        hand.addAll(diamondsInHand);        //to change ordering of suits, just change ordering of statements
        hand.addAll(spadesInHand);
        hand.addAll(clubsInHand);

    }

    private ArrayList<Card> order(ArrayList<Card> hand)
    {
        for (int i = 0; i < hand.size(); i++)
        {
            for (int j = 0; j < hand.size(); j++)
            {
                int face1 = hand.get(i).getCardRank();
                int face2 = hand.get(j).getCardRank();
                if (face1 < face2)
                {
                    swap(hand, i, j);
                }
            }
        }
        return hand;
    }

    private void swap(ArrayList<Card> hand, int a, int b)
    {
        Card tempA = hand.get(a);
        Card tempB = hand.get(b);
        hand.remove(a);
        hand.add(a, tempB);
        hand.remove(b);
        hand.add(b, tempA);
    }
}
