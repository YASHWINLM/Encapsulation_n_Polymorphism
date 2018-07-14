package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;



public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update() {
		this.x+=5;
		this.y+=5;
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(x, y, h, w);
	}
	

	

}
