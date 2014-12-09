package prototype;

import java.util.Random;

public class Gene {

	private Integer[] values;
	private Random rnd;
	
	public Gene()
	{
		values = new Integer[3];
		randomGenes();
	}
	
	private void randomGenes() 
	{
		rnd = new Random(9);
		
		// create random genes
		for (int i = 0; i < values.length; i++) 
		{
			values[i] = rnd.nextInt();
		}
	}
}
