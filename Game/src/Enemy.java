
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
		System.out.println("I hope I dont die!");
		p.defend(attack);
	}
	
	public void defend(int a)
	{
		 health = health - a;
		 System.out.println("The enemy lost health . . . He how has " + health + " health points");
		 if (health <= 0) {
				System.out.println("The enemy's last words were 'But I didn't want to die...'");
				 //int reward = chromosomePoints + 10
			}
	}

}
//System.out.println("Enemy says: I'm supposed to fight you... but not working");
