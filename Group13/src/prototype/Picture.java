package prototype;

public class Picture {

	private PictureGenerator picture;
	private Coordinate[] coords;
	
	/**
	 * Create a random picture.
	 */
	public Picture() 
	{
		// create random picture
		picture = new PictureGenerator();
		coords = picture.getCoordinates();
	}
	
	/**
	 * 
	 */
	public void displayPicture()
	{
		
	}
}

