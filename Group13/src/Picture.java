
public class Picture {

	private PictureGenerator picture;
	
	public Picture() 
	{
		
	}
	
	public void updatePicture(Picture parent) 
	{
		picture.updatePicture(parent.picture.getBiomorph());
		
	}
	
	public void selectAsParent() 
	{
		
	}
	
	/**
	 * \\ Calls pictureGenerator.updatePicture() on all the picturegenerator objects 
	 * \\ in a for loop
	 */
	public void updatePicture()
	{
		
	}
}
