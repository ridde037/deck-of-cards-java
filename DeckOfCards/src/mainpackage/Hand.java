package mainpackage;
import java.util.ArrayList;

/**
 * 
 * This class implements a Hand object that stores dealt cards. For use with Card.class and Deck.class.
 * 
 * @author Shaun Riddering
 * @version 1.0
 *
 */

public class Hand {
	
	/**
	 * This ArrayList object is used to store cards that have been dealt into this Hand object.
	 */
	
	protected ArrayList<Card> m_hand;
	
	/**
	 * This value contains number of cards currently in the hand.
	 */
	
	protected int m_len;
	
	/**
	 * This integer array will be implemented at a later time.
	 */
	
	protected int[] m_sums;
	
	/**
	 * Default constructor for a Hand object. 
	 */
	
	public Hand() {
		this.m_len = 0;
		this.m_sums = null;
		this.m_hand = new ArrayList<Card>();
	}
	
	/**
	 * 
	 * This method pushes a Card into the 0th index of the m_hand ArrayList.
	 * 
	 * @param card The card to add to the 0th index.
	 * @param visibility The visibility of the pushed card.
	 */
	
	public void push(Card card, boolean visibility) {
		card.setVisibility(visibility);
		m_hand.add(0, card);
		m_len += 1;
	}
	
	/**
	 * 
	 * This method adds a card to the end of the m_hand ArrayList.
	 * 
	 * @param card The card to add to the 0th index.
	 * @param visibility The visibility of the pushed card.
	 */
	
	public void add(Card card, boolean visibility) { 
		card.setVisibility(visibility);
		m_hand.add(card);
		m_len += 1;
	}
	
	/**
	 * 
	 * This method adds a card at the given index to the m_hand ArrayList.
	 * 
	 * @param index The index to add the card at.
	 * @param card The card to add to the 0th index.
	 * @param visibility The visibility of the pushed card.
	 */
	
	public void addAtIndex(int index, Card card, boolean visibility) {
		try {
			card.setVisibility(visibility);
			m_hand.add(index, card);
			m_len += 1;
		}
		catch (IndexOutOfBoundsException ex ){
			System.out.println("");
			System.out.println("An error has occured: ");
			System.out.println(ex);
		}
	}
	
	/**
	 * This method overwrites the standard toString() method for Hand objects.
	 * Creates a string with each card listed in curly braces on a single line.
	 */
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		
		for(int i=0; i<m_len; i++) {
			sb.append(m_hand.get(i).toString()); 
			if(i<m_len-1) { sb.append(", "); }
		}
		
		sb.append("}").append(System.getProperty("line.separator"));
		return sb.toString();
	}
	
	/**
	 * 
	 * Returns the card at the given index, without removing it.
	 * 
	 * @param index The index of the desired card.
	 * @return The card at the given index.
	 */
	
	public Card get(int index) {
		try {
			return m_hand.get(index);
		}
		catch (IndexOutOfBoundsException ex ){
			System.out.println("");
			System.out.println("An error has occured: ");
			System.out.println(ex);
			return null;
		}
	}
	
	/**
	 * Returns and removes the last card in the m_hand ArrayObject
	 * 
	 * @return The last card in the m_hand ArrayList.
	 */
	
	public Card pop() {
		Card temp;
		try {
			temp = m_hand.get(m_len-1);
			m_hand.remove(m_len-1);
			m_len -= 1;
			return temp;
		}
		catch (IndexOutOfBoundsException ex ){
			System.out.println("");
			System.out.println("An error has occured: ");
			System.out.println(ex);
			return null;
		}
	}
	
	/**
	 * 
	 * Returns and removes the card at the given index.
	 * 
	 * @param index The index of the desired card.
	 * @return The card at the given index.
	 */
	
	public Card getAndRemove(int index) {
		Card temp;
		try {
			temp = m_hand.get(index);
			m_hand.remove(index);
			m_len -= 1;
			return temp;
		}
		catch (IndexOutOfBoundsException ex ){
			System.out.println("");
			System.out.println("An error has occured: ");
			System.out.println(ex);
			return null;
		}
	}
}