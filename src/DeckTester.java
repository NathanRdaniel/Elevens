/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suits = {"1","2","3","4"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck deckA = new Deck(ranks, suits, values);
		
		
		System.out.println(deckA.size());
		System.out.println(deckA.isEmpty());
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
		System.out.println(deckA.deal());
	}
}
