import java.awt.Component;
import javax.swing.JDialog;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.JOptionPane;




public class Player {

	private int hp = 50;
	private int attack = 20;
	private Weapon w = new Weapon("Axe");
	// Game class;
int path = 0;
	public Player() {
/*
		String characterName;
		Scanner scanner1 = new Scanner(System.in);

		System.out.print("What do they call you?   ===>>");
		characterName = scanner1.nextLine();

		System.out.print("Hi ");
		System.out.print(characterName);
		System.out.print("! ");
		System.out.println("Your health is at " + hp + " points right now, when it runs out... it'll be game over man!");
		System.out.println("Pick up weapons and kill some bad guys! Now let's go on an adventure!");
		int path = 0;
		*/
		path = JOptionPane.showInputDialog("Welcome to the game, this is the product of about 4 and a half years of making. I hope you like it. What would you like to be called?").toLowerCase()
				.charAt(0);
		System.out.println("I dont really care what youre name is");
	    JDialog.setDefaultLookAndFeelDecorated(true);
	    String[] selectionValues = { "Journey", "Store",};
	    String initialSelection = "Adventure";
	    String selection = (String) JOptionPane.showInputDialog(null, "Would you like to buy something from the store or journey into the unknown?",
	        "Selection Time", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
	    System.out.println(selection);
	    if (selection.equals("Store"))
	    {
	    	 JDialog.setDefaultLookAndFeelDecorated(true);
	 	    String[] selectionValues1 = { "Armor of the Black Knight", "Magically Healing Tasty Food,", "Holy Sword of the Titans",  "A game that's programmed correctly"};
	 	    String initialSelection1 = "Stroe";
	 	    String selection1 = (String) JOptionPane.showInputDialog(null, "Select an item for your quest",
	 	        "Welcome to the Store", JOptionPane.QUESTION_MESSAGE, null, selectionValues1, initialSelection1);
	 	    System.out.println("Oh you want just one? " + "'" + selection1 + "'" + " Well jokes on you because I cant program that.");
	    }
	    
	    JDialog.setDefaultLookAndFeelDecorated(true);
	    String[] selectionValues2 = { "Show him whats up", "Bounce out ouf this joint",};
	    String initialSelection2 = "Adventure";
	    String selection2 = (String) JOptionPane.showInputDialog(null, "You ventured down a rough rocky pass and an enemy got in your way... What do you do?",
	        "Challenger approaches", JOptionPane.QUESTION_MESSAGE, null, selectionValues2, initialSelection2);
	    
	    System.out.println("Oh, so you wanna " + selection2 + " Well turns out he was an civilian in need of help. And to think you were about to " + selection2);
	}


	private void setLabel(String string) {
		// TODO Auto-generated method stub

	}

	public int getHP() {
		return hp;
	}

/*	public void attack(Enemy e) {
		e.defend(attack);
	}
*/
	public void defend(int a) {
		int survivor = hp - a;

		if (hp == 0) {
			System.out.println("");
		}
	}

	//// Finish

	public void addAttack(Weapon w) {
		int boostAttack = attack + 5;
	}

}
