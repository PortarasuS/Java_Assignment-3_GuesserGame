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
	int count = 0;
	void eveluate (int gusserInp, int playerInp){
		this.gusserInp = gusserInp;
		this.playerInp = playerInp;
		if (this.gusserInp == this.playerInp)
		{	
			count++;
			System.out.println();
			System.out.println("congratz! Player - " + count +" , You won the match");
		}
		else if (this.gusserInp > this.playerInp){
			count++;
			System.out.println();
			System.out.println("Player - "+count +" selected lesser value");
		}
		else if (this.gusserInp < this.playerInp){
			count ++;
			System.out.println();
			System.out.println("Player - "+ count +" selected greater value");
		}
	}
}	

public class GuesserGame {

	public static void main(String[] args) {

		Scanner scan0 =new Scanner(System.in);
		System.out.println("Please eneter the NUMBER OF PLAYERS participating in this game : ");
		int playercnt = scan0.nextInt();

		int randomval = (int)(Math.random()*10);
		Guesser gsr = new Guesser();
		System.out.println("Hi, Player -- GUESSER selected the value which is HIDDEN , Player, Please select player value (0 to 9) to find the guesser value" );
		System.out.println();
		gsr.setGuesserValue(randomval);
		int gsrOut = gsr.getGuesserValue();


		int [] playerValue = new int[playercnt];
		for (int i=0; i<playercnt; i++)
		{

			Player plr1 = new Player();
			Scanner scan2 = new Scanner (System.in);
			int count = i+1;
			System.out.println("Please enter the Player - " +count +" value : ");
			plr1.setPlayerValue(scan2.nextInt());
			playerValue[i] = plr1.getPlayerValue();
			System.out.println("VALUE OF PLAYER  "+count +" is "+ playerValue [i]);
			System.out.println();
		}
		System.out.println("Please find the GUESSER VALUE : " + gsrOut);
		Umpire ump = new Umpire();
		for (int a : playerValue)
		{
			ump.eveluate(randomval, a);
		}
	}
}
