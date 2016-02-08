
public class Enemy {
	int health = 30;
	int attack = 15;
	
	private int hp=50;
	
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
	