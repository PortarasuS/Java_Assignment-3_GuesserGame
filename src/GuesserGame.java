import java.util.*;
import java.lang.Math;   


class Guesser{
	private int guesserValue;
	
	
	void setGuesserValue (int guesserValue) {
		this.guesserValue = guesserValue;
	}
	int getGuesserValue() {
		return this.guesserValue;
	}
	
}

class Player{
	private int playerValue;

	public int getPlayerValue() {
		return playerValue;
	}

	public void setPlayerValue(int playerValue) {
		this.playerValue = playerValue;
	}
	
	
}

class Umpire{
	int gusserInp = 0;
	int playerInp;
	void eveluate (int gusserInp, int playerInp){
		this.gusserInp = gusserInp;
		this.playerInp = playerInp;
		if (this.gusserInp == this.playerInp)
		{	
			System.out.println();
			System.out.println("congratz! Player, You won the match");
		}
		else if (this.gusserInp > this.playerInp){
			System.out.println();
			System.out.println("Player selected lesser value");
		}
		else if (this.gusserInp < this.playerInp){
			System.out.println();
			System.out.println("Player selected greater value");
		}
		
		
	}
}	

public class GuesserGame {

	public static void main(String[] args) {
		
		//Guesser Object
		int randomval = (int)(Math.random()*10);
		Guesser gsr = new Guesser();
		//Scanner scan = new Scanner (System.in);
		System.out.println("Hi, Guesser selected the value which is hidden , Please select player value (0 to 9) " );
		// int guesserValue = scan.nextInt();
		gsr.setGuesserValue(randomval);
		int gsrOut = gsr.getGuesserValue();
		
		// Player 1 object
		Player plr1 = new Player();
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Please enter the Player-1 value : ");
		plr1.setPlayerValue(scan2.nextInt());
		int playerValue = plr1.getPlayerValue();
		System.out.println(playerValue);
		System.out.println();
		System.out.println("Please find the Guesser value : " + gsrOut);
		
		Umpire ump = new Umpire();
		ump.eveluate(randomval, playerValue);
		
	}
	

}
