import com.sun.org.apache.bcel.internal.generic.ConstantPushInstruction;

/**
 * Created by Gabe Pham on 10/23/2016.
 */
public class Spades {

    public static void main(String[] args) {
        String yourName = "Mark";
        Player humanPlayer = new Player(yourName, true, 0);
        Player CPU1 = new Player("player1", false, 1);      //we need the actual names here
        Player CPU2 = new Player("player2", false, 2);
        Player CPU3 = new Player("player3", false, 3);

        CreateDeck deck = new CreateDeck();

        System.out.println(deck);

        deck.deal(humanPlayer, CPU1, CPU2, CPU3);

        humanPlayer.orderHand();
        CPU1.orderHand();
        CPU2.orderHand();
        CPU3.orderHand();

        humanPlayer.printHand();
        CPU1.printHand();
        CPU2.printHand();
        CPU3.printHand();
    }

}

