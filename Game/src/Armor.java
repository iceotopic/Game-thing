
public class Armor {


	int armorPoints;
	String name;
	int attackPoints;
	int chromosomePoints;
	int playerPoints;

	public Armor(String armorName)
	{
		if (armorName.equalsIgnoreCase("Jungle Armor"))
		{
			name = "Jungle Armor";
			armorPoints = 5;
			chromosomePoints = 10;
		}
		else if (armorName.equalsIgnoreCase("Necro Armor"))
		{
			name = "Necro Armor";
			armorPoints = 15;
			chromosomePoints = 20;
		}
		else if (armorName.equalsIgnoreCase("Adamantite Armor"))
		{
			name = "Adamantite Armor";
			armorPoints = 25;
			chromosomePoints = 30;
		}
	}
	public int armorPoints()
	{
		return armorPoints - attackPoints;
	}
	public int chromosomePoints()
	{
		return playerPoints - chromosomePoints;
	}
}
