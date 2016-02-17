
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
		if (weaponName.equalsIgnoreCase("R0sseta Stone"))
		{
			name = "R0sseta Stone";
			maxUse = 15;
			useCount = 0;
			attackPoints = 10;			
		}
		else if (weaponName.equalsIgnoreCase("Katana"))
		{
			name = "Katana";
			maxUse = 10;
			useCount = 0;
			attackPoints = 30;
		}
		else if (weaponName.equalsIgnoreCase("Reality Check"))
		{
			name = "Reality Check";
			maxUse = 5;
			useCount = 00;
			attackPoints = 80;
		}
	}
	public int use()
	{
		useCount++;
		return maxUse - useCount;
	}
	
}
