package extra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class E extends JFrame implements KeyListener{
	int x=250,y=250;
	boolean shooting=false;
	boolean canShoot=false;
	public E() {
		setSize(500,500);
		addKeyListener(this);
		setDefaultCloseOperation(E.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		g.drawRect(0, 0, 500, 500);
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		g.drawRect(x, y, 30, 30);
		g.setColor(Color.CYAN);
		g.fillRect(x, y, 30, 30);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		switch(key) {
		case KeyEvent.VK_W:
			y=y-10;
		break;
		case KeyEvent.VK_S:
			y=y+10;
		break;
		case KeyEvent.VK_A:
			x=x-10;
		break;
		case KeyEvent.VK_D:
			x=x+10;
		break;
		case KeyEvent.VK_SPACE:
			canShoot=true;
			canShoot=false;
			shooting=true;
		break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	new E().show();
}
}

