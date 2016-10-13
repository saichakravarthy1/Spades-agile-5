import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Player {

	String name;
	Boolean dealer;
	int position;   //0 is south, 1 is west, 2 is north and 3 is east
	int tricksTaken = 0;
	int tricksBid = 0;
	Card[] hand = new Card[13];
	
	//Use getter and setters for all the players.
	
	public Player(String name, Boolean dealer, int pos){
		this.name = name;
		this.dealer = dealer;
		this.position = pos;
	}
	
	public void addToHand(Card card){
		this.hand[12] = card;
	}
	
	public void removeFromHand(Card card){
		
	}
	
	public void deal(Player player1, Player player2, Player player3){
		ArrayList<Card> deck = new ArrayList<Card>(52);
		ArrayList<Card> dealDeck = new ArrayList<Card>(52);
		
		 Collections.shuffle(arrlist);
		
	}
}
