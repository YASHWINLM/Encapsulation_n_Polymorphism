package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	 Image image;
	 
   
	ImageMorph(int x, int y) {
		super(x, y);
		try {
			this.image = ImageIO.read(ImageMorph.class.getResourceAsStream("DogThatAteABee.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage( image,x,y,100,100, null);
		
	}

}
