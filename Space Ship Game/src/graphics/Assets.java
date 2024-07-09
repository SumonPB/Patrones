package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage player;
	
	// effects
	
	public static BufferedImage speed;
	
	// explosion
	
	public static BufferedImage[] exp = new BufferedImage[9];
	
	// lasers
	
	public static BufferedImage blueLaser, greenLaser, redLaser;
	
	// Meteors
	
	public static BufferedImage[] bigs = new BufferedImage[4];
	public static BufferedImage[] meds = new BufferedImage[2];
	public static BufferedImage[] smalls = new BufferedImage[2];
	public static BufferedImage[] tinies = new BufferedImage[2];
	
	//fondo
	
	public static BufferedImage fondo;
	
	public static void init()
	{
		fondo = Loader.ImageLoader("/ships/fondo01.jpeg");
		
		player = Loader.ImageLoader("/ships/PlayerGreen.png");
		
		speed = Loader.ImageLoader("/effects/fire09.png");
		
		blueLaser = Loader.ImageLoader("/lasers/laserBlue01.png");
		
		greenLaser = Loader.ImageLoader("/lasers/laserGreen11.png");
		
		redLaser = Loader.ImageLoader("/lasers/laserRed01.png");
		
		for(int i = 0; i < bigs.length; i++)
			bigs[i] = Loader.ImageLoader("/meteors/meteorBrown_big"+(i+1)+".png");
		
		for(int i = 0; i < meds.length; i++)
			meds[i] = Loader.ImageLoader("/meteors/meteorBrown_med"+(i+1)+".png");
		
		for(int i = 0; i < smalls.length; i++)
			smalls[i] = Loader.ImageLoader("/meteors/meteorBrown_small"+(i+1)+".png");
		
		for(int i = 0; i < tinies.length; i++)
			tinies[i] = Loader.ImageLoader("/meteors/meteorBrown_tiny"+(i+1)+".png");
		
		for(int i = 0; i < exp.length; i++)
			exp[i] = Loader.ImageLoader("/explosion/"+i+".png");
		
	}
	
}
