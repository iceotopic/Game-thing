//import java.util.Random;

public class Food {
//mark
	
	int healthPoints;
	String name;
	int useCount=0;
	int maxUse;
	int attackPoints;
	
		public Food(String foodName)
	{
		if (foodName.equalsIgnoreCase("CONFEDERATE CUSH"))
		{
			name = "CONFEDERATE CUSH";
			healthPoints = 10;			
		}
		else if (foodName.equalsIgnoreCase("Spotted dick"
				+ "http://assets.epicurious.com/photos/"
				+ "561025d1f9a84192308aa312/master/pass/103210.jpg"))
		{
			name = "Spotted dick ";
			healthPoints = 20;
		}
		else if (foodName.equalsIgnoreCase("megapussi"
				+ "http://www.mindjunker.com/"
				+ "wp-content/uploads/2011/12/234.jpg"))
		{
			name = "megapussi";
			healthPoints = 30;
		}
	}
	public int healthPoints()
	{
		return healthPoints - attackPoints;
	}
	
}