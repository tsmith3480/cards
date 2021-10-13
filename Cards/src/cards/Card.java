package cards;

public class Card {
	private String Color;
	private String Rank;
	private char Symbol;
	private int Value;
	private boolean Playable;
	
	public Card() {
		this.Color = "Black";
		this.Rank = "Ace";
		this.Symbol = '\u2660';
		this.Value = 1;
		this.Playable = true;
	}
	
	public Card(String color, String rank, String symbol, int value, boolean playable) {
		char spade = '\u2660';
		char heart = '\u2665';
		char diamond = '\u2666';
		char club = '\u2663';
		char setSymbol;
		
		if (symbol == "club") {
			setSymbol = club;
		} else if (symbol == "heart") {
			setSymbol = heart;
		} else if (symbol == "diamond") {
			setSymbol = diamond;
		} else {
			setSymbol = spade;
		}
		
		this.Color = color;
		this.Rank = rank;
		this.Symbol = setSymbol;
		this.Value = value;
		this.Playable = playable;
	}
	
	// Accessors/Getters
	public String getColor() { return this.Color; }
	public String getRank() { return this.Rank; }
	public char getSymbol() { return this.Symbol; }
	public int getValue() { return this.Value; }
	public boolean getPlayable() { return this.Playable; }
	
	// Mutators/Setters
	public void setValue(int value) { this.Value = value; }
	public void setPlayable(boolean value) { this.Playable = value; }
	
	public String toString() {
		return printLine1() + "\n" +
				printLine2() + "\n" +
				printLine3() + "\n" +
				printLine4() + "\n" +
				printLine5() + "\n";
	}
	
	public boolean equals(Card card) {
		return this.Color == card.getColor() && 
				this.Rank == card.getRank() && 
				this.Symbol == card.getSymbol() && 
				this.Value == card.getValue() && 
				this.Playable == card.getPlayable();
	}
	
	public String printLine1() {
		return "\u250C" + "\u2500" + "\u2500" + "\u2500" + "\u2510"; 
	}
	
	public String printLine2() {
		return "\u2502" + this.Symbol + "  " + "\u2502";
	}
	
	public String printLine3() {
		String display;
		if (this.Value == 1 || this.Value == 14) {
			display = "A";
		} else if (this.Value == 10) {
			display = "T";
		} else if (this.Value == 11) {
			display = "J";
		} else if (this.Value == 12) {
			display = "Q";
		} else if (this.Value == 13) {
			display = "K";
		} else {
			display = "" + this.Value;
		}
		return "\u2502 " + display + " \u2502";
	}

	public String printLine4() {
		return "\u2502  " + this.Symbol + "\u2502";
	}
	
	public String printLine5() {
		 return "\u2514" + "\u2500" + "\u2500" + "\u2500" + "\u2518";
	}
}
