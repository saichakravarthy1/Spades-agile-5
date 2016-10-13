import java.util.ArrayList;
import java.util.Collections;

public class CreateDeck {
	
	ArrayList<Card> deck = new ArrayList<Card>(52);
	
		 
		public void createDeck() {
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
	    
		
}
