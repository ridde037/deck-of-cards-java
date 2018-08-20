package debugandtest;
import mainpackage.*;

/**
 * 
 * This class contains methods for testing the DeckOfCards implementation.
 * 
 * @author Shaun Riddering
 * @version 1.0 
 */

public class Driver {
	
	/**
	 * This method contains a test of each of the methods in the Hand class. Prints debugging information to System.out. 
	 */
	
	public static void testHandClassMethods() {
		
		Deck deck = new Deck();
		Hand hand = new Hand();
		
		System.out.print(deck);
		
		hand.add(deck.deal(), true);
		hand.add(deck.deal(), true);
		hand.add(deck.deal(), true);
		hand.add(deck.deal(), true);
		hand.add(deck.deal(), true);
		
		System.out.println(hand);
		
		System.out.print("Popping a: ");
		System.out.println(hand.pop());
		
		System.out.println("");
		System.out.print("Popping a: ");
		System.out.println(hand.pop());
		System.out.println("");
		
		System.out.println(hand);
		
		System.out.println("Pushing two new cards!");
		System.out.println("");
		
		hand.push(deck.deal(), true);
		System.out.println(hand);
		
		hand.push(deck.deal(), true);
		System.out.println(hand);
		
		System.out.print("Removing at index = 2: ");
		System.out.println(hand.getAndRemove(2));
		System.out.println("");
		
		System.out.println(hand);
		
		System.out.print("Removing at index = 2: ");
		System.out.println(hand.getAndRemove(2));
		System.out.println("");
		
		System.out.println(hand);
		
		System.out.println("Adding a hidden card!");
		hand.add(deck.deal(), false);
		System.out.println("");
		System.out.println(hand);
		
		System.out.println("Testing error handling!");
		hand.addAtIndex(99, deck.deal(), true);
		
		System.out.println(hand.get(99));
		
		System.out.println(hand.getAndRemove(99));
		
		System.out.print("Popping a: ");
		System.out.println(hand.pop());
		
		System.out.print("Popping a: ");
		System.out.println(hand.pop());
		
		System.out.print("Popping a: ");
		System.out.println(hand.pop());
		
		System.out.print("Popping a: ");
		System.out.println(hand.pop());
		
		System.out.print("Popping a: ");
		System.out.println(hand.pop());

		return;
	}

	/**
	 * 
	 * This is the main method for the Driver class. Calls the different test methods.
	 * 
	 * @param args Currently unused.
	 */
	public static void main(String [] args) {
		testHandClassMethods();
	}
}
