import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Player {

	String name;
	Boolean dealer;
	int position;   //0 is south, 1 is west, 2 is north and 3 is east
	int tricksTaken = 0;
	int tricksBid = 0;
	ArrayList<Card> hand = new ArrayList<Card>(13);
	
	//Use getter and setters for all the players.
	
	public Player(String name, Boolean dealer, int pos){
		this.name = name;
		this.dealer = dealer;
		this.position = pos;
	}
	
	public void addToHand(Card card){
		hand.add(card);
	}
	
	public void removeFromHand(Card card){
		hand.remove(card);
	}
	
	public void orderHand()
	{
		ArrayList<Card> heartsInHand = new ArrayList<Card>(13);
		ArrayList<Card> diamondsInHand = new ArrayList<Card>(13);
		ArrayList<Card> spadesInHand = new ArrayList<Card>(13);
		ArrayList<Card> clubsInHand = new ArrayList<Card>(13);
		
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
		
		
		
	}
	
	private ArrayList<Card> order(ArrayList<Card> hand)
	{
		for (int i = 0; i < hand.size(); i++)
		{
			for (int j = 0; j < hand.size(); j++)
			{
				
			}
		}
	}
	
	private void swap()
	{
		
	}
}
