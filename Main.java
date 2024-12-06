import java.util.Scanner;

public class Main
{

	
//	public static String cardToString(Card c)//special method to get string from a object
//		{
//		return c.getValue() + " of " + c.getSuit();
//		}
	
	public static void printHand(Card[] hand, int amountOfCards)//Method to print Hand
	{	
		for(int i = 0; i < amountOfCards; i++)
		{
			System.out.println(hand[i]);
		}
	// for(int i = 0; i <hand.length;i++)
	//	{
	//		if (hand[i == null])
	//			break;
	//		System.out.println()
	
		
	//	}
	}
	public static int scoreHand(Card[] hand, int amountOfCards)
		{
		int returnVal = 0;
		boolean hasAce = false;
		
		for(int i = 0; i < amountOfCards; i++)
			{
			returnVal += hand[i].getValue()
;
			if(hand[i].getValue() == 1)
				hasAce = true;
			}
		
		if(hasAce && returnVal <= 11)
			{
			returnVal += 10;
			}
		return returnVal;
		}
	

	
	
	
	public static void main(String[] args) 
	{
	
//	Card card = new Card();
//	Card card1 = new Card();
	
//	System.out.println(card.equals(card1));//This should give true
	
//	card.setSuit("Hearts");
	
//	System.out.println(card.getSuit());//Prints out the contents of suit of card
//	System.out.println(card.getValue());//Priints out the contents of value of card
//	System.out.println(card.equals(card1));
		
//	System.out.println(cardToString(card1));// Prints out contents of object - 1 of Spades
//	System.out.println(card1); //Prints out Card@51016012 - memory address of object
	
//		Deck d = new Deck(); - creating a new deck of cards
//		System.out.println(d); -Printing out the whole deck
		
//		d.randomDeal();//To get a random card
//		System.out.println(d.randomDeal());

	//TODO List:
		// Welcome the player
		//Show the player their hand
		//Show the player the dealers visible card
		//Ask the user if they want to hit or stay
		//If the user  goes over 21, they lose
		//Otherwise, deal cards to the dealer until they are 17 or over
		//If the dealer foes over, they lose
		//If neither lost, compare scores
	
	System.out.println("Welcome to Blackjack!");
	
	//Make anew deck object
	Deck d = new Deck();
	
	//This index is keeping track of where  we are putting the next card
	//Aand it is keeping track of how many cards we have
	
	int playerIndex = 0;
	Card[] playerHand = new Card[10];//Array for player hand
	int dealerIndex = 0;
	Card[] dealerHand = new Card[10];//Array for dealer hand
	
	//Dealing cards
	//Deal 1 card and store in respective array of player and dealer
	playerHand[playerIndex] = d.randomDeal();
	playerIndex++;
	
	dealerHand[dealerIndex] = d.randomDeal();
	dealerIndex++;
	
	//Deal another card and store in respective array of player and dealer
	playerHand[playerIndex] = d.randomDeal();
	playerIndex++;
		
	dealerHand[dealerIndex] = d.randomDeal();
	dealerIndex++;
	
	System.out.println("");
	
	System.out.println("Player hand");	
	printHand(playerHand,playerIndex);
	System.out.println("");
	System.out.println("Dealer shown card: ");
	System.out.println(dealerHand[dealerIndex-1]);
	
	Scanner k = new Scanner(System.in);
	
	do 
	{
	
		System.out.println("Do you want to hit or stay?");
		String input = k.nextLine();
		
		if(input.toLowerCase().equals("hit"))
		{
			playerHand[playerIndex] = d.randomDeal();
			playerIndex++;
			
			System.out.println("Player hand: ");
			printHand(playerHand, playerIndex);
			
			
			if(scoreHand(playerHand, playerIndex ) > 21)
				break;
			//if player went over 21, break
			
		}
		else if(input.toLowerCase().equals("stay"))
		{
			break;
		}
		
		
	
	} while(true);
		
		if (scoreHand(playerHand,playerIndex) <= 21)
			{
				while(scoreHand(dealerHand, dealerIndex) < 17)
					{
					dealerHand[dealerIndex] = d.randomDeal();
					dealerIndex++;
					}
				
				System.out.println("Dealer final hand: ");
				printHand(dealerHand, dealerIndex);
				
				int playerScore = scoreHand(playerHand,playerIndex);
				int dealerScore = scoreHand(dealerHand, dealerIndex);
				
				if(dealerScore > 21)
				{	
					System.out.println("Player wins");
				}
				else if(dealerScore >= playerScore)
				{	
					System.out.println("Dealer wins!");
				}
				else
				{
					System.out.println("Player wins!");
				}
			}
		else
			{
			System.out.println("Player lost!");
			}
	}
}

