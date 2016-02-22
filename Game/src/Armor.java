
public class Armor {

	int damagePoints;
	String name;
	int useCount=0;
	int maxUse;

	public Armor(String armorName)
	{
		if (armorName.equalsIgnoreCase(""))
		{
			name = "R0sseta Stone";
			maxUse = 15;
			damagePoints = 10;			
		}
		else if (armorName.equalsIgnoreCase("Katana"))
		{
			name = "Katana";
			maxUse = 10;
			damagePoints = 30;
		}
		else if (armorName.equalsIgnoreCase("Reality Check"))
		{
			name = "Reality Check";
			maxUse = 5;
			damagePoints = 80;
		}
	}
	public int use()
	{
		useCount++;
		return maxUse - useCount;
	}
	
}
