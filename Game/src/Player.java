import java.awt.Component;
import javax.swing.JDialog;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.JOptionPane;
public class Player {

	private int hp=50;
	private int attack=20   ; 
	private Weapon w = new Weapon("Axe");
	//Game class;
	int path = 0;
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
		
	    JDialog.setDefaultLookAndFeelDecorated(true);
	    Object[] selectionValues = { "Journey", "Store",};
	    String initialSelection = "Adventure";
	    Object selection = JOptionPane.showInputDialog(null, "Would you like to buy something from the store or journey into the unknown?",
	        "Selection Time", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
	    System.out.println(selection);
	    if (selection = 'Store')
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
	
