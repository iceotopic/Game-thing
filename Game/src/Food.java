//import java.util.Random;

public class Food {

	
	int healthPoints;
	String name;
	int attackPoints;
	int hp;
	int chromosomePoints;
	int playerPoints;
	
		public Food(String foodName)
	{
		if (foodName.equalsIgnoreCase("CONFEDERATE CUSH"))
		{
			name = "CONFEDERATE CUSH";
			healthPoints = 10;
			chromosomePoints = 5;
		}
		else if (foodName.equalsIgnoreCase("Spotted dick"
				+ "http://assets.epicurious.com/photos/"
				+ "561025d1f9a84192308aa312/master/pass/103210.jpg"))
		{
			name = "Spotted dick ";
			healthPoints = 20;
			chromosomePoints = 10;
		}
		else if (foodName.equalsIgnoreCase("megapussi"
				+ "http://www.mindjunker.com/"
				+ "wp-content/uploads/2011/12/234.jpg"))
		{
			name = "megapussi";
			healthPoints = 30;
			chromosomePoints = 15;
		}
	}
	public int healthPoints()
	{
		return healthPoints + hp;
		
	}
	public int chromosomePoints()
	{
		return playerPoints - chromosomePoints;
	}
}