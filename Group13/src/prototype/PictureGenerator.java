package prototype;

public class PictureGenerator {

	private Coordinate[] coords; // the coordinates representing the biomorph
	
	/**
	 * Create a random PictureGenerator for a random representation.
	 */
	public PictureGenerator() 
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
