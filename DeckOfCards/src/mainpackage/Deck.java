package mainpackage;
import java.util.ArrayList;
import java.util.Collections;
import mainpackage.Card.Rank;
import mainpackage.Card.Suit;

/**
 * 
 * This class implements a standard 52 card deck of Card objects. For use with Card.class and Hand.class.
 * 
 * @author Shaun Riddering
 * @version 1.0
 */

public class Deck {
	
	/**
	 * This ArrayList object is used to contain all of the 52 Card objects.
	 */
	
	private ArrayList<Card> m_cards;
	
	/**
	 * This integer specifies the total number of cards.
	 * Changing this value is not recommended.
	 */
	
	private static final int m_NUM_CARDS = 52;
	
	/**
	 * This integer is used to determine which cards have been dealt, and which have not been dealt.
	 */
	
	private int m_index;
	
	/**
	 * Default constructor for a Deck object. Iterates through all possible suits and ranks to generate the deck.
	 */
	
	public Deck() {
		m_cards = new ArrayList<Card>();
		m_index = 0;
		for(Suit s : Suit.values()) {
			for(Rank r : Rank.values()) {
				m_cards.add(new Card(r, s, false));
			}
		}
		shuffle();
	}
	
	/**
	 * This function shuffles the deck.
	 */
	
	public void shuffle() { 
		Collections.shuffle(m_cards);
		m_index = 0;
	}
	
	/**
	 * 
	 * This function returns the card at current index value, without removing it. 
	 * Also increments the index, to reflect the dealing of the card.
	 * 
	 * @return The card at the 0th index.
	 */
	
	public Card deal() {	
		if(m_index >= m_NUM_CARDS-1) { shuffle(); }
		return m_cards.get(m_index++);
	}
	
	/**
	 * This method overwrites the standard toString() method for Deck objects.
	 * Creates a string with each card in the deck listed on a new line. 
	 */
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Card temp;
		
		sb.append(System.getProperty("line.separator"));
		sb.append("##########  DECK CONTENTS  ##########").append(System.getProperty("line.separator"));
		for(int i=0; i<m_NUM_CARDS; i++) {
			temp = m_cards.get(i);
			temp.setVisibility(true);
			sb.append("Card ").append(i+1).append(": ").append(temp.toString()).append(System.getProperty("line.separator"));
		}
		sb.append("##########  DECK CONTENTS  ##########").append(System.getProperty("line.separator"));
		
		return sb.toString();
	}
}