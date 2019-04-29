1.  Discuss the similarities and differences between Elevens, Thirteens, and Tens.
    The way you determin if the play is legal is  the same taking the values of each card and adding them together to determin if its a legal move. 
they are different from the values needed to add together and in 11's you need to remove a J Q K together 
and not seporate.
for 10's quartets of kings, queens, jacks, and tens need to be removed;
13's uses a 10-card board
10's uses a 13-card board
11's uses a 09-card board  


2.  As discussed previously, all of the instance variables are declared in 
    the Board class. But it is the ElevensBoard class that “knows” the board size, and the ranks, suits, and point values of the cards in the deck. How do the Board instance variables get initialized with the ElevensBoard values? What is the exact mechanism?

11's sets up all variables and declares them in the same file at the start. and the variables are intialised at the call of ElevensBoard(). to add the board size to the cards array, and creating the decks values.
cards = new Card[BOARD_SIZE];

3.  Now examine the files Board.java, and ElevensBoard.java, found in the Activity8 Starter Code directory. Identify the abstract methods in Board.java. See how these methods are implemented in ElevensBoard. Do they cover all the differences between Elevens, Thirteens, and Tens as discussed in question 1? Why or why not?

There are methods that are universal like in seting up the board but not when it comes to the selection of the cards. when selecting cards it will use polymorphism that autimaticlly uses the methods implememnted in particular objects as long as you provide the required board.