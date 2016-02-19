import java.util.Random;

public class Treasure {

	
	//
	String[] types = {"Chromosome Cluster", "Weapon", "Ammunition Clip"};
	String rewardType;
	int Chromosomes;
	Random rand = new Random();
	("Well when life gives you lemons!")
	public Treasure()
	{
		rewardType = types[rand.nextInt(types.length)];
		Chromosomes = rand.nextInt(11)+10;
	}
	
	public Treasure(int tType)
	{
		rewardType = types[tType];

	}
	
	public String toString ()
	{
		return ("The " + rewardType + "gives you " + Chromosomes + " Chromosomes.");
	}
	
	
	
}
