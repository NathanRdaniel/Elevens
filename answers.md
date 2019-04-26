1. What items would be necessary if you were playing a game of Elevens at your desk (not on the computer)? List the private instance variables needed for the ElevensBoard class.
~ a deck of cards 
2. Write an algorithm that describes the actions necessary to play the Elevens game.
Shuffle the deck
Layout 9 Cards face up.
Add the Values of the 2 Selected Cards.
If the Value = 11 you can remove them.
If theres a J, Q, K, Select all 3 & remove.
If not then you find another Pair
If cards are removed add more to fill in the spaces.
If there are no Pairs avalible, You lose
If the Board is empty you win.
3. Now examine the partially implemented ElevensBoard.java file found in the Activity7 Starter Code  directory. Does the ElevensBoard class contain all the state and behavior necessary to play the game?
~ Yes
4.  ElevensBoard.java contains three helper methods. These helper methods are private because they are only called from the ElevensBoard class.

    a. Where is the dealMyCards method called in ElevensBoard?
         ~ public void newGame() 
        ~ public ElevensBoard() 
    b. Which public methods should call the containsPairSum11  and containsJQK methods?
        ~ the the is legal method because there it can check to see if what was selected makes a 11 or is jqk and is a legal move.
        ~anotherPlayIsPossible() because it needs to see if its posible to clear the board
    c. It’s important to understand how the cardIndexes method works, and how the list that it returns is used. Suppose that cards contains the elements shown below. Trace the execution of the cardIndexes method to determine what list will be returned. Complete the diagram below by filling in the elements of the returned list, and by showing how those values index cards. Note that the returned list may have less than 9 elements.

    CARDS----> 0    1   2   3   4   5   6   7   8
               J♥   6♣  n   2♠  n   n   A♠  4♥  n
               ----------------------------------
  returned --> 0    1   2   3   4   5   6   7   8
    List       0    1   3   6   7             

    d. Complete the following printCards method to print all of the elements of cards that are indexed by cIndexes.

    public static printCards(ElevensBoard board) {
         for (int i = 0; i < cIndexes.size(); i ++){
             System.out.println(cIndex.get(i));
         }

    e. Which one of the methods that you identified in question 4b above needs to call the cardIndexes method before calling the containsPairSum11 and containsJQK methods? Why?.

    the anotherPlayIsPossible() because it needs to check the cardsindex in play to determin if more can be called in or if its a playable game and can then be used to determian if any moves are legal

                                                             