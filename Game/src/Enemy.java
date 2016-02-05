
public class Enemy {
	int health = 30;
	int attack = 15;
	
	private int hp=50;
	
	public void attack(Player p)
	{
		p.defend(attack);
	}
	public int getHP()
	{
		return hp;
	}
	public void defend(int attackpoints) {
		if (health == 0) {
			System.out.println("The enemy's last words were 'Wubba Lubba Dub-dub...'");
		}
	}
}
