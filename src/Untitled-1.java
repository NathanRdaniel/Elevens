import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are 
     (1) a pair of non-face cards
	 * whose values add to 11, 
      (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */

    public boolean isLegal(List<Integer> selectedCards) {
        if (selectedCards.size() == 2) {
            return containsPairSum11(selectedCards);
           } else if (selectedCards.size() == 3) {
            return containsJQK(selectedCards);
           } else {
            return false;
           }
          }






	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, 
     * (2) a group of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        List<Integer> cIndexes = cardIndexes();
        return containsPairSum11(cIndexes) || containsJQK(cIndexes);
       }
           /* {}{}{}IF theres a J Q K {}{}{}
                CHECK FOR the rest to make a JQK
                - BOOL if J = T
                       if Q = T
                       if K = T
                       if J Q K = T return T
                */
                
                
	}
/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
        for (int i = 0; i < selectedCards.size(); i++) {
            int cardOne = selectedCards.get(i).intValue();
            for (int j = i + 1; j < selectedCards.size(); j++) {
             int cardTwo = selectedCards.get(j).intValue();
             if (cardAt(cardOne).pointValue() + cardAt(cardTwo).pointValue() == 11) {
              return true;
             }
            }
           }
           return false;
          }

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
        boolean foundJack = false;
        boolean foundQueen = false;
        boolean foundKing = false;
        for (Integer cardObj : selectedCards) {
         int k = cardObj.intValue();
         if (cardAt(k).rank().equals("jack")) {
          foundJack = true;
         } else if (cardAt(k).rank().equals("queen")) {
          foundQueen = true;
         } else if (cardAt(k).rank().equals("king")) {
          foundKing = true;
         }
        }
        return foundJack && foundQueen && foundKing;
       }
      }
/*

1.  The size of the board is one of the differences between Elevens and Thirteens. 
    Why is size not an abstract method?
    
    -Because you can set size when you call Board. 

2.  Why are there no abstract methods dealing with the selection of the cards to be
    removed or replaced in the array cards?
- because each Game has different Rules in the game and how you select the cards. so,
    there wouldent be any abstract methods for games that dont share a comon answer.

3.  Another way to create “IS-A” relationships is by implementing interfaces. Suppose 
    that instead of creating an abstract Board class, we created the following Board 
    interface, and had ElevensBoard implement it. Would this new scheme allow the Elevens 
    GUI to call isLegal and anotherPlayIsPossible polymorphically? Would this alternate 
    design work as well as the abstract Board class design? Why or why not?
-no because the only thing that can be taken to both is the methods name; when you declare
the rules the simularitys end.
public interface Board
    {
        boolean isLegal(List<Integer> selectedCards);
        boolean anotherPlayIsPossible();
    }
*/
}