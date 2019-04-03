Explain in your own words the relationship between a deck and a card.
the deck is an array of cards that stores cards and the cards store the data of what that single card is. the deck can store unique cards.
2. Consider the deck initialized with the statements below. How many cards does the deck contain?
      String[] ranks = {"jack", "queen", "king"};
      String[] suits = {"blue", "red"};
      int[] pointValues = {11, 12, 13};
      Deck d = new Deck(ranks, suits, pointValues);
6
3. The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2 (lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point value 10; an ace has point value 11; point values for 2, ..., 10 are 2, ..., 10, respectively. Specify the contents of the ranks, suits, and pointValues arrays so that the statement
      Deck d = new Deck(ranks, suits, pointValues);
initializes a deck for a Twenty-One game.
 String[] ranks = {"1", "2", "3","4","5","6","7","8","9","10"};
 String[] suits = {"Spade", "Club","dim","Heart"};
 int[] pointValues = {11, 2, 3, 4, ,5, 6, 7, 8, 9, 10};
4. Does the order of elements of the ranks, suits, and pointValues arrays matter?
yes becuase point value is determened by the rank at the sape place because they are the same lenght