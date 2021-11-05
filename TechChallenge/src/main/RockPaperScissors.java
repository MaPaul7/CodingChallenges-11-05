package main;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		rps("Scissors", "Scissors");
		rps("Scissors", "Rock");
		rps("Rock", "Rock");
		rps("Scissors", "Paper");
		rps("Paper", "Lizard");
	}
	public static void rps(String p1, String p2) {
		String possible = "RockPaperScissors";
		if(p1.equals(p2)) {
			System.out.println("Tie");
		}
		if(!possible.contains(p1) || !possible.contains(p2)) {
			System.out.println("Invalid Match");
		}
		else if(p1.equals("Scissors")) {
			if(p2.equals("Paper")) {
				System.out.println("Player 1 Wins");
			}
			if(p2.equals("Rock")) {
				System.out.println("Player 2 Wins");
			}
		}
		else if(p1.equals("Rock")) {
			if(p2.equals("Scissors")) {
				System.out.println("Player 1 Wins");
			}
			if(p2.equals("Paper")) {
				System.out.println("Player 2 Wins");
			}
		}
		else if(p1.equals("Paper")) {
			if(p2.equals("Scissors")) {
				System.out.println("Player 2 Wins");
			}
			if(p2.equals("Rock")) {
				System.out.println("Player 1 Wins");
			}
		}
		
	}

}
