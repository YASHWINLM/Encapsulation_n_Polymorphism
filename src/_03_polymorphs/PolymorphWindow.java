package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    int x = 100;
    int y = 100;
   ArrayList<Polymorph> polys= new ArrayList<Polymorph>();
   BluePolymorph b1 = new BluePolymorph(x, y);
   BluePolymorph b2 = new BluePolymorph(x+10, y+10);
   MovingMorph m1= new MovingMorph(x, y+10);
   RedMorph r1= new RedMorph(x+10, y);
   MovingMorph m2= new MovingMorph(x, y-10);
   ImageMorph im = new ImageMorph(x, y);
   CircleMorph cm= new CircleMorph(x, y, 30);
   
   JOPMorph jm= new JOPMorph(x, y);
   
   MouseMorph mm= new MouseMorph(x+100, y+100);
   
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
   	 
   	
  
   	 
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	polys.add(b1);
   	polys.add(b2);
   	polys.add(m1);
   	polys.add(r1);
   	polys.add(m2);
   	this.addMouseMotionListener(mm);
   	this.addMouseListener(jm);
   	
   	
   	
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //Circle morph
   	 //cm.draw(g);
   	// cm.update();
   	 
   	 //Mouse Morph
   	// mm.draw(g);
   	// mm.update();
   	 
   	 
   	 //ImageMorph
   	 //im.draw(g);
   	 
   	 
   	 jm.draw(g);
   	 
   	 //Array of morphs
   	 //draw polymorph
   //	for (Polymorph polymorph : polys) {
	//	polymorph.draw(g);
	//	polymorph.update();
		
	//}
   	
   	 
   	 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	
   	 
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
