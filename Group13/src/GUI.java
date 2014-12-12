// kens test comment..
public class GUI {

	private Picture[] children;
	private Picture parent;
	
	/**
	 * 
	 */
	public GUI() 
	{
		children = new Picture[8];
		parent = new Picture();
		newGeneration();
	}
	
	
	/**
	 * Set the parent picture to be the selected child.
	 */	
	public void setParent(Picture newParent) 
	{
		// set parent field to the selected child
	}
	
	
	/**
	 * Update the parent picture with new values, subsequently
	 * triggering a new generation to be created.
	 * 
	 * \\ Call updatePicture() on each picture in a for loop
	 */
	public void updatePictures(Integer[] values) 
	{
		
	}
	
	/**
	 * Create a new generation of pictures, based on the parent.
	 */
	public void newGeneration() 
	{
		Picture[] newGen = new Picture[8];
		for (int i = 0; i < children.length; i++) 
		{
			Picture p = new Picture(parent);
			//newGen[i] = p;
		}
		
		children = newGen;
	}
}
