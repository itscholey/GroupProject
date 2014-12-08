
public class Evolution {

	public Evolution()
	{
		
	}
	
	/**
	 * \\ Creates a new biomorph, feeding the updated gene into the constructor
	 */
	private Biomorph createBiomorph() {
		Biomorph b = new Biomorph(); // placeholder
		b.mutateGene();
		return b;
	}
	
	
	/**
	 * \\ Calls mutateBiomorph 
	 * @return
	 */
	public Biomorph[] newGeneration() {
		Biomorph[] b = new Biomorph[2]; // placeholder
		
		// for loop for the number of children to be created
			// for each newly created biomorph and pass it the parent gene
			// OR copy the parent biomorph into a new object
				// call mutateGene() on each new biomorph
					// add each new biomorph to the array
		
		return b;
	}
}
