package prototype;

public class Biomorph {

	private Gene gene;
	private Biomorph parent;
	
	/**
	 * Create a random biomorph.
	 */
	public Biomorph()
	{
		// random gene
	}
	
	/**
	 * Create a biomorph that descends from its parent.
	 * 
	 * @param parent The biomorph "related" to this biomorph; it should 
	 * be slightly different in appearance.
	 */
	public Biomorph(Biomorph parent) {
		this.parent = parent;
		gene = parent.getGene();
		gene.mutate();
	}
	
	/**
	 * Retrieve the gene of the biomorph.
	 * 
	 * @return gene The gene of this biomorph.
	 */
	public Gene getGene() {
		return gene;
	}
	
	/**
	 * Update the gene with specified values.
	 * 
	 * @param gene An collection of values to update the gene with.
	 */
	public void updateGene(Integer[] gene) {
		
	}
	
	
}

