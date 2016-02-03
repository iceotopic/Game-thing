
public class Enemy {
	int health = 30;
	int attack = 15;

	public void attack(Player p)
	{
		p.defend(attack);
	}
	
	public void defend(int attackpoints) {
		if (health == 0) {
			System.out.println("The enemy's last words were 'Wubba Lubba Dub-dub...'");
		}
	}
}
