
public class Card 
{

	private String suit; //Class-level variable
	private int value;//Class-level variable
	
	public Card()//Default constructor
		{
		this.suit = "Spades";
		this.value = 1; // 1 = Ace
		
		}
	
	public Card(String s, int v)//Parameterized constructor
		{
		
		this.suit = s;
		this.value = v;
		
		}
	
	public String getSuit()//Getter for suit
		{
	
		return this.suit;
		
		}
	
	public void setSuit(String s)//Setter for suit		We probably dont need this
		{
		this.suit = s;
		}
	
	public int getValue()//Getter for value
		{
		
		return this.value;
		
		}
	
	public void setValue(int v)//Setter for value    We probably dont need this
		{
			if ( v > 0 & v < 11)//One line if statement doesnt need curly braces around it
				this.value = v;
			else
				this.value = 1;
		}
	
	//Card card1 = new Card();
	//Card card2 = new Card();
	//System.out.println(card1.equals(card2))// Should print out true
	
	public boolean equals(Card c)
		{
		return c != null 
				&& this.suit.equals(c.getSuit()) 
				&& this.value == c.getValue(); // Comparing  
		}
	
	
	public String toString()//special method to get string from a object
		{
	return getValue() + " of " + getSuit();
		}
	
	
	
}
