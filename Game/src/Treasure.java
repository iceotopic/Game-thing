import java.util.Random;

public class Treasure {

	
	//
	String[] type = {"Chromosome Cluster"};
	String rewardType;
	int Chromosomes;
	Random rand = new Random();
	
	public Treasure()
	{
		rewardType = type[rand.nextInt(type.length)];
		Chromosomes = rand.nextInt(11)+10;
	}
	
	public Treasure(int tType)
	{
		rewardType = type[tType];

	}
	
	public String toString ()
	{


		System.out.println("Well when life gives you lemons!");
		return ("The " + rewardType + "gives you " + Chromosomes + " Chromosomes.");
 
	}
	
	
	
}
