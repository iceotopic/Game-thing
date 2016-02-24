import java.awt.Component;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.JOptionPane;
public class Player {

	private int hp=50;
	private int attack=20   ; 
	private Weapon w = new Weapon("Axe");
	//Game class;

	public Player()
	{
	
	String characterName;
	Scanner scanner1 = new Scanner(System.in);

	System.out.print("What do they call you?   ===>>");
	characterName = scanner1.                     nextLine();
	
	System.out.print("Hi ");
	System.out.print(characterName);
	System.out.print("! ");
	System.out.println("Your health is at " + hp + " points right now, when it runs out... it'll be game over man!");
	System.out.println("Pick up weapons and kill some bad guys! Now let's go on an adventure!");
	int path = 0;
	path = JOptionPane.showInputDialog("Would you like to buy something or journey into the unknown?").toLowerCase().charAt(0);//Add something to use weapon 
//Eating – increases the players health by 10
	
	}	
	
	private void setLabel(String string) {
		// TODO Auto-generated method stub
		
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
		if (hp == 0) { 
			System.out.println("");
		}
	}


//// Finish 

	public void addAttack(Weapon w)
	{
		int boostAttack = attack + 5;
	}

		}
	
