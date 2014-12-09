package prototype;

public class Picture {

	private PictureGenerator picture;
	private Picture parent;
	private Coordinate[] coords;
	
	/**
	 * Create a random picture.
	 */
	public Picture() 
	{
		// create random picture
		picture = new PictureGenerator();
		parent = this;
		coords = picture.getCoordinates();
	}
	
	/**
	 * Create a picture derived from a parent picture.
	 * 
	 * @param parent The picture this picture is derived from.
	 */
	public Picture(Picture parent) 
	{
		this.parent = parent;
		picture = new PictureGenerator(parent.getPictureGenerator());
		coords = picture.getCoordinates();
	}
	
	/**
	 * \\ Calls pictureGenerator.updatePicture() on all the picturegenerator objects 
	 * \\ in a for loop
	 */
	public void updatePicture(Picture parent) 
	{
		picture.updatePictureGenerator(parent.picture.getBiomorph());
		// unfinished
		
	}
	
	/**
	 * Retrieve the reference to this picture's PictureGenerator object.
	 * 
	 * @return The PictureGenerator object reference.
	 */
	public PictureGenerator getPictureGenerator() 
	{
		return picture;
	}
	
	
	/**
	 * 
	 */
	public void displayPicture()
	{
		
	}
}

