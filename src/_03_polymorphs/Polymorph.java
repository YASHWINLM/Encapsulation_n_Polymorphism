package _03_polymorphs;

import java.awt.Graphics;


public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int h=50;
    protected int w=50;
    
     Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	this.h = h;
   	this.w = w;
    }
    
    public void update(){

    }
    
    public abstract void draw(Graphics g);
}
