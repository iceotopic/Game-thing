
public class Enemy {
	int health = 45;
	int attack = 5;
	
	private int hp=50;
	
	public int getHP()
	{
		return hp;
	}
	public void attack(Player p)
	{
		System.out.println("Who dares!?");
		p.defend(attack);
	}
	
	public void defend(int a)
	{
		 health = health - a;
		 System.out.println("The enemy lost health . . . He how has " + health + " health points");
		 if (health <= 0) {
				System.out.println("The enemy's last words were 'Wubba Lubba Dub-dub...'");
				 //int reward = chromosomePoints + 10
			}
	}

}
//System.out.println("Enemy says: I'm supposed to fight you... but not working");
