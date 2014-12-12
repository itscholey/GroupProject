public class PictureGenerator {

	private Biomorph biomorph; // the biomorph this generator represents
	//private Coordinate[] coords; // the coordinates representing the biomorph
	private PictureGenerator parent;
	private CoordinateTree coords;
	
	/**
	 * Create a random PictureGenerator for a random representation.
	 */
	public PictureGenerator() 
	{
		
	}
	
	/**
	 * Create a PictureGenerator derived from a parent.
	 * 
	 * @param parent The PictureGenerator in which to derive from.
	 */
	public PictureGenerator(PictureGenerator parent)
	{
		this.parent = parent;
		biomorph = new Biomorph(parent.getBiomorph());
		generateCoordinates();		
	}
	
	/**
	 * Update the image (coordinates and the biomorph itself)
	 */
	public void updatePictureGenerator(Biomorph b) 
	{
		
	}
	
	/**
	 * Retrieve the coordinates generated to represent this biomorph.
	 * 
	 * @return A collection of the coordinates to represent this biomorph.
	 */
	public Coordinate[] getCoordinates() 
	{
		return null; //placeholder
	}
	
	/**
	 * Retrieve the biomorph this PictureGenerator represents.
	 * 
	 * @return The biomorph this PictureGenerator represents.
	 */
	public Biomorph getBiomorph() 
	{
		return null;// placeholder
	}
	
	/**
	 * Create coordinates for the biomorph based on the drawing rules.
	 */
	private void generateCoordinates() 
	{
		/*
		 * Get root of tree [0]
		 * --Determine position based on "gene"
		 * 
		 * Get 1st level of tree [1]
		 * --Parent position, and then its own
		 * 
		 * Get 2nd level of tree [2-3]
		 * --Parent position, and then its own
		 * 
		 * Get 3rd level of tree [4-7]
		 * --Parent position, and then its own
		 * 
		 * Get 4th level of tree [8-15]
		 * --Parent position, and then its own
		 * 
		 */
	}
}
