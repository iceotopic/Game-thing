import java.util.Scanner;
public class Player {
	
	//initial hp
	private int hp=50;
	
	public Player()
	{
	
	String characterName;
	Scanner scanner1 = new Scanner(System.in);

	System.out.print("Enter character name   ===>>");
	characterName = scanner1.nextLine();
	
	System.out.print("Hi");
	System.out.print(characterName);
	System.out.print(" ! ! !");
	
	}
	
	
	public int getHP()
	{
		return hp;
	}
}
