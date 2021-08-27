import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements KeyListener, ActionListener{
	
	
	
	int x = 0;
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		g.fillOval(x++, 0, 50, 50);
		
		
	}
	
	public Frame() {
		JFrame f = new JFrame("Pong");
		f.setSize(800,600);
		f.add(this);
		t = new Timer(16, this);
		t.start();
		f.setVisible(true);
		
	}
	
	public static void main(String[] arg) {
		Frame f = new Frame();
	}	
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	Timer t;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
}
