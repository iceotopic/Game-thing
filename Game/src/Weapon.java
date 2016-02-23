
public class Weapon {

	int attackPoints;
	String name;
	int useCount=0;
	int maxUse;
	
	
	public Weapon()
	{
		name = "Sword";
		maxUse = 999999999;
		attackPoints = 5;
	}
	
	public Weapon(String weaponName)
	{
		if (weaponName.equalsIgnoreCase("R0sseta Stone"))
		{
			name = "R0sseta Stone";
			maxUse = 15;
			attackPoints = 10;			
		}
		else if (weaponName.equalsIgnoreCase("Katana"))
		{
			name = "Katana";
			maxUse = 10;
			attackPoints = 30;
		}
		else if (weaponName.equalsIgnoreCase("Reality Check"))
		{
			name = "Reality Check";
			maxUse = 5;
			attackPoints = 80;
		}
	}
	public int use()
	{
		useCount++;
		return maxUse - useCount;
	}
	
}
