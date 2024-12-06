import java.util.Random;

public class Deck 
{

	private Card[] cards;
	
	public Deck()
		{
		String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};//array of suits
		int[] values = {1,2,3,4,5,6,7,8,9,10,10,10,10};//array of values
		
		cards = new Card[suits.length * values.length];//Size of array
		int cardIndex = 0; //declaration for method 2 of adding to array
		
		for(int i = 0; i< suits.length; i++)
			{
			for(int j = 0; j < values.length; j++)
				{
				Card c = new Card(suits[i], values[j]);//making all possible combinations with the 2 suits and 5 values
				//cards[(i * values.length) + j] = c; //Assigning the new card made above to the array 'cards'    //method 1 of adding to array
				cards[cardIndex] = c;
				cardIndex ++;
				}
			}
		}
	
	//TODO: Parametized constructor?
	//Maybe it takesin an array of suits and values and make the cards based on that
	
	//Draw card method
	//Shuffle method
	//Reset deck
	
	public Card randomDeal()
		{
		Random r = new Random();//Random method
		//System.out.println(r.nextInt(52));
		int len = getCards().length;
		int select = r.nextInt(len);
		return getCards()[select];
		}
	
	public Card[] getCards()//Getter for array 
		{
			return this.cards;
		}
	
	public String toString()//String contents
		{	
		String returnString = "";
		
		for(int i = 0; i < getCards().length; i++)
			{
				returnString += getCards()[i] + "\n";
			}
		
		return returnString;
		
		}
	
}
