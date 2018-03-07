package csc232;

public class GameDriver{
	
	public static void main(String[] args){
	Deck deck = new Deck();
	deck.fill();
	deck.shuffle();
	while (deck.getSize() > 0){
		Card cInUse = deck.deal();
		System.out.println(cInUse);
		
		//deal number of cards based on rank value		
		for(int i = 0; i < deck.getCardValue(cInUse); i++) {
			System.out.println("Dealing card " + (i+1));
			deck.deal();
			if(deck.getSize() == 0 && i == deck.getCardValue(cInUse)-1){
				System.out.println("You Win!");
			}
			
		}
	}
}
}

