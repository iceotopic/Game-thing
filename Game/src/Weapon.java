
public class Weapon {

	int attackPoints;
	String name;
	int useCount;
	int maxUse;
	
	
	public Weapon()
	{
		name = "Sword";
		maxUse = 999999999;
		useCount = 0;
		attackPoints = 5;
	}
	
	public Weapon(String weaponName)
	{
		if (weaponName.equalsIgnoreCase("Axe"))
		{
			name = "axe";
			maxUse = 10;
			useCount = 0;
			attackPoints = 10;			
		}
		else if (weaponName.equalsIgnoreCase("Sword"))
		{
			name = "Sword";
			maxUse = 00;
			useCount = 0;
			attackPoints = 15;
		}
		else if (weaponName.equalsIgnoreCase("Reality Check"))
		{
			name = "Reality Check";
			maxUse = 00;
			useCount = 00;
			attackPoints = 00;
		}
	}
	public int use()
	{
		useCount++;
		return maxUse - useCount;
	}
	
}
