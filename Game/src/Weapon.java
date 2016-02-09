
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
			maxUse= 10;
			useCount = 0;
			attackPoints = 10;			
		}
		else if (weaponName.equalsIgnoreCase("thSword"))
		{
			name = " ";
			maxUse= 00;
			useCount = 0;
			attackPoints = 15;
		}
		
	}
	public int use()
	{
		useCount++;
		return maxUse - useCount;
	}
	
}
