
public class Weapon {

	int attackPoints;
	String name;
	int useCount;
	int maxUse;
	
	
	public Weapon()
	{
		
	}
	
	public Weapon(String weaponName)
	{
		if (weaponName.equals("Axe"))
		{
			name = "axe";
			maxUse= 10;
			useCount = 0;
			attackPoints = 5;			
		}
	}
	public int use()
	{
		useCount++;
		return maxUse - useCount;
	}
	
}
