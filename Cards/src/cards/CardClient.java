package cards;

public class CardClient {
	private static int Player1Score = 0;
	private static int Player2Score = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		deck1.shuffle();
		deck2.shuffle();
		
//		for (int i = 0; i < 52; i++) {
//			battle(deck1.getCards()[i], deck2.getCards()[i], i+1);
//			System.out.println("Scoreboard: P1 [" + Player1Score + "] v. P2 [" + Player2Score + "]");
//			System.out.println();
//		}
//		
//		if (Player1Score > Player2Score) {
//			System.out.println("PLAYER 1 WINS THE GAME!");
//		} else if (Player1Score < Player2Score) {
//			System.out.println("PLAYER 2 WINS THE GAME!");
//		} else {
//			System.out.println("THE GAME ENDS IN A DRAW!");
//		}
		
		System.out.println((int)(Math.random()*52));
	}
	
	private static void battle(Card card1, Card card2, int rd) {
		String winner = "Player 1 Wins!";
		
		if (card2.getValue() > card1.getValue()) {
			winner = "Player 2 Wins!";
			Player2Score++;
		} else if (card2.getValue() == card1.getValue()) {
			winner = "It's a Draw!";
		} else {
			Player1Score++;
		}
		
		System.out.println("       P1      P2");
		System.out.println("      " + card1.printLine1() + "   " + card2.printLine1());
		System.out.println("Round" + " "  + card1.printLine2() + "   " + card2.printLine2());
		System.out.println(" " + String.format("%02d", rd) + "!  " + card1.printLine3() + " v " + card2.printLine3()  + "  " + winner);
		System.out.println("      " + card1.printLine4() + "   " + card2.printLine4());
		System.out.println("      " + card1.printLine5() + "   " + card2.printLine5());
	}

}
