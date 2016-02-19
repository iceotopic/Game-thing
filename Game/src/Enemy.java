
public class Enemy {
	int health = 45;
	int attack = 5;
	
	private int hp=50;
	
	//System.out.println("Who dares!?");
	public int getHP()
	{
		return hp;
	}
	public void attack(Player p)
	{
		p.defend(attack);
	}
	
	public void defend(int a)
	{
		 int survivor = health - a;
		 if (health == 0) {
				System.out.println("The enemy's last words were 'Wubba Lubba Dub-dub...'");
			}
	}
}
	