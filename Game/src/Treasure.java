import java.util.Random;

public class Treasure {

	/*These are the items that are given to the player throughout the game 
	{
	String type; 
	String rewardtype;
	String Chromosomes: This is what the player is rewarded with upon completing tasks or doing anything profitable
	Int.reward amt (amount): This is the amount of chromosomes the player receives upon completing a profitable task
	}
	*/
	//
	String[] type = {"Chromosome Cluster"};
	String rewardType;
	int Chromosomes;
	Random rand = new Random();
	
	public Treasure()
	{
		System.out.print("Well when life gives you lemons!");
		rewardType = type[rand.nextInt(type.length)];
		Chromosomes = rand.nextInt(11)+10;
	}
	
	public Treasure(int tType)
	{
		rewardType = type[tType];

	}
	
	public void display ()
	{
		System.out.println("Well when life gives you lemons!");
		// gives you chromosomes
	}
	

}
