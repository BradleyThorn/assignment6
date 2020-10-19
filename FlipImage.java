import acm.graphics.*;
import acm.program.*;

public class FlipImage extends GraphicsProgram
{
	public void run() {
		//call image
		GImage image = new GImage("corcodildy.png");
		GImage flippedImage = createFlippedImage(image);
	
		//create images
		image.scale(.5);
		add(image, 10, 50);
		
		flippedImage.scale(.5);
		add(flippedImage, 380, 50);
	}
	
	
	private GImage createFlippedImage(GImage image) 
	{
		//fill a multi-dimensional array using getPixelArray, which will give us the pixel count of the image
		int[][] array = image.getPixelArray();
		int height = array.length;
		int width = array[0].length;
		
		//loops for every pixel in the image
		for (int y = 0; y < height; y++)
		{
			//you have to run with width divided by two otherwise it will run through twice and flip it back to the original 
			for (int x = 0; x < width/2; x++)
			{
				//makes the new flipped width "coordinate", with the -1 being so that it fits in the array
				int x2 = width - x - 1;
				//standard temporary and change
				int flipped = array[y][x];
				array[y][x] = array[y][x2];
				array[y][x2] = flipped;
			}
		}
		return new GImage (array);
	}
}
