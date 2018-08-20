package mainpackage;

/**
 * 
 * This class implements a Card object for use with Deck.class and Hand.class.
 * 
 * @author Shaun Riddering
 * @version 1.0
 *
 */

public class Card {
	/**
	 * This enum contains each of the four suits in a standard deck of cards.
	 */
	
	public enum Suit{
		HEARTS, DIAMONDS, SPADES, CLUBS;
	}
	
	/**
	 * This enum contains each of the 14 ranks in a standard deck of cards. 
	 */
	
	public enum Rank {
		ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
		EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
	}

	/**
	 * The Rank value for the Card object.
	 */
	
	private Rank m_rank;
	
	/**
	 * The Suit value for the Card object.
	 */
	
	private Suit m_suit;
	
	/**
	 * A boolean value indicating whether the particular card is visible to the end user during gameplay.
	 * If false, the card will be hidden in certain print methods. If true, the card will not be hidden.
	 */
	
	private boolean m_isVisible;

	/**
	 * Default constructor for a Card object.
	 * 
	 * @param rank The rank value for the Card object.
	 * @param suit The suit value for the Card object.
	 * @param isVisible The visibility of the Card object.
	 */
	
	public Card(Rank rank, Suit suit, boolean isVisible) {
		this.m_rank = rank;
		this.m_suit = suit;
		this.m_isVisible = isVisible;
	}
	
	/**
	 * Secondary constructor for a Card object. Utilizes integers instead of enum values to construct the object.
	 * 
	 * @param rank The rank value for the Card object. 
	 * @param suit The suit value for the Card object.
	 * @param isVisible The visibility of the Card object.
	 */
	
	public Card(int rank, int suit, boolean isVisible) {
		this.m_rank = intToRank(rank);
		this.m_suit = intToSuit(suit);
		this.m_isVisible = isVisible;
	}
	
	/**
	 * This method returns the Rank value for the given integer value.
	 * 
	 * @param n The integer value to be converted.
	 * @return The Rank value for the given integer value.
	 */
	
	public Rank intToRank(int n) {
		switch(n) {
			case 0: return Rank.ACE;
			case 1: return Rank.TWO;
			case 2: return Rank.THREE;
			case 3: return Rank.FOUR;
			case 4: return Rank.FIVE;
			case 5: return Rank.SIX;
			case 6: return Rank.SEVEN;
			case 7: return Rank.EIGHT;
			case 8: return Rank.NINE;
			case 9: return Rank.TEN;
			case 10: return Rank.JACK;
			case 11: return Rank.QUEEN;
			case 12: return Rank.KING;
			default: 
				System.out.println("Invalid Rank value!");
				return null;
		}
	}
	
	/**
	 * This method returns the Suit value for the given integer value.
	 * 
	 * @param n The integer value to be converted.
	 * @return The Suit value for the given integer value.
	 */
	
	public Suit intToSuit(int n) {
		switch(n) {
		case 0: return Suit.HEARTS;
		case 1: return Suit.DIAMONDS;
		case 2: return Suit.SPADES;
		case 3: return Suit.CLUBS;
		default:
			System.out.println("Invalid Suit value!");
			return null;
		}
	}
	
	/**
	 * This method overwrites the standard toString() method for Card objects.
	 * Combines the rank and the suit of a card object into a String.
	 */
	
	@Override
	public String toString() {
		if(m_isVisible) { 
			return this.getRank() + " of " + this.getSuit();
		}
		else { return "HIDDEN"; }
	}
	
	/**
	 * This method returns the Card object's rank.
	 * 
	 * @return The Card object's rank.
	 */
	
	public Rank getRank() { return m_rank; }
	
	/**
	 * This method returns the Card object's suit.
	 * 
	 * @return The Card object's suit.
	 */
	
	public Suit getSuit() { return m_suit; }
	
	/**
	 * This method returns the integer value of the Card object's rank.
	 * 
	 * @return The integer value of the Card object's rank.
	 */
	
	public int getRankValue() {
		switch(m_rank) {
			case ACE: return 0;
			case TWO: return 2;
			case THREE: return 3;
			case FOUR: return 4;
			case FIVE: return 5;
			case SIX: return 6;
			case SEVEN: return 7;
			case EIGHT: return 8;
			case NINE: return 9;
			default: return 10;
		}
	}
	
	/**
	 * This method returns the integer value of the Card object's suit.
	 * 
	 * @return The integer value of the Card object's suit.
	 */
	
	public int getSuitValue() { return m_suit.ordinal(); }
	
	/**
	 * This method returns the visibility of the Card object.
	 * 
	 * @return The visibility of the Card object.
	 */
	
	public boolean isVisible() { return m_isVisible; }
	
	/**
	 * This method sets the visibility of the Card object.
	 * 
	 * @param visibility The new visibility of the Card object.
	 */
	
	public void setVisibility(boolean visibility) { this.m_isVisible = visibility; }
}