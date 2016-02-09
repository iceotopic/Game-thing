import java.util.Scanner;
public class Player {



	//initial health point (hp)

	private int hp=50;
	private int attack=10; 
	
	public Player()
	{
	
	String characterName;
	Scanner scanner1 = new Scanner(System.in);

	System.out.print("Enter character name   ===>>");
	characterName = scanner1.                     nextLine();
	
	System.out.print("Hi ");
	System.out.print(characterName);
	System.out.print("!");
	System.out.println("Your health is at " + hp + " points right now, when it runs out... it'll be game over man");
	System.out.println("Pick up weapons and kill some bad guys! Now let's go on an adventure!");
	//Add something to use weapon 
	//Eating – increases the players health by 10
	
	}
	
	
	public int getHP()
	{
		return hp;
	}
	public void attack(Enemy e)
	{
		e.defend(attack);
	}
	public void defend(int a)
	{
		 int survivor = hp - a;
	}

	/*public class Weapon
	{
	public static void addAttack()	
	}
	}
	*/
}

