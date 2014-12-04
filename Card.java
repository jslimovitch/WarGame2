/*    Jonathan Slimovitch
      CS 110: Intermediate Programming
      Assignment #10
      
      Card Class:

*/

/**
   Card Class: Representation of a single playing card (From a standard 52 card deck). A card consists of 
   a suit value and a rank value. Once instantiated, the Card object cannot change.
*/

public class Card
{
   //Constants
   //suits
   public final static int SPADES=0,
                           HEARTS=1,
                           DIAMONDS=2,
                           CLUBS=3;
   //ranks
   //Cards 2 through 9 have face value
   public final static int ACE=14,
                           JACK=11,
                           QUEEN=12,
                           KING=13;
            
   private int suit;    //The suit of this card, one of the constants
                        //SPADES,HEARTS,DIAMONDS,CLUBS
   
   private int rank;    //The rank of this card, from 1-13
   
   /**
      Creates a new playing card
      @param suit The suit value of the card
      @param rank The rank value of the card
  */
  
   public Card (int rank, int suit)
   {
      this.rank=rank;
      this.suit=suit;
   }
   
   /**
      Returns the suit of the card
      @return a Suit constant representing the suit value of the card
   */
   
   public int getSuit()
   {
      return suit;
   }
   
   /**
      Returns the rank of the card
      @return a Rank constant representing the rank value of the card
   */
   
   public int getRank()
   {
      //Returns the int that codes for this card's rank
      return rank;
   }
   
   /**
      Returns a description of the suit of this card
      @return The suit value of the card as a string
   */
   
   public String getSuitAsString()
   {
      //Return a String representing the card's suit
      //If the card's suit is invalid, "??" is returned
      switch(suit)
      {
         case SPADES: return "SPADES";
         case HEARTS: return "HEARTS";
         case DIAMONDS: return "DIAMONDS";
         case CLUBS: return "CLUBS";
         default: return "Invalid";
      }
   }
   
   /**
      Returns a description of the rank of this card
      @return the rank value of the card as a string
   */
   
   public String getRankAsString()
   {
      switch(rank)
      {
         //case 1: return "Ace";
         case 2: return "2";
         case 3: return "3";
         case 4: return "4";
         case 5: return "5";
         case 6: return "6";
         case 7: return "7";
         case 8: return "8";
         case 9: return "9";
         case 10: return "10";
         case 11: return "Jack";
         case 12: return "Queen";
         case 13: return "King";
         case 14: return "Ace";
         default: return "??";
      }
   }
   
   /**
         Returns a description of the card
         @return The name of the card
   */
   
   public String toString()
   {
      return getRankAsString()+" of " + getSuitAsString();
   }
   
   /**
      Compares two cards to determine if they have the sam evalue
      @param otherCard The other card
      @return true if the two cards have the same rank and suit values, otherwise false
   */
   
   public boolean equals(Card otherCard)
   {
      if((rank!=otherCard.rank)||(suit!=otherCard.suit))
         return false;
      else
         return true;
   }
}  