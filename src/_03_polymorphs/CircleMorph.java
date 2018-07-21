package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	float x1;
	float y1;
	private int angle;

	CircleMorph(int x, int y, int angle) {
		super(x, y);
		this.angle=angle;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect((int)x1, (int)y1, h, w);
	}
	
	@Override
	public void update() {
		angle+=1;
//		if (x>0 && y >0) {
//		while (angle<=60) {
//			angle+=15;
//		}
//		
//	}
//		else if(x<0 && y>0) {
//			angle+=60;
//			while (angle<=150) {
//				angle+=15;
//				
//			}
//			
//		}
//		else if(x<0 && y<0) {
//			angle+=60;
//			while (angle<240) {
//				angle+=15;
//				
//			}
//			
//		}
//		else if(x<0 && y>0) {
//			angle+=60;
//			while (angle<=330) {
//				angle+=15;
//				
//			}
//			
//		}
		
		this.x1+=Math.cos(angle)*50;
		this.y1+=Math.sin(angle)*50;
		
	}
	
	

}
