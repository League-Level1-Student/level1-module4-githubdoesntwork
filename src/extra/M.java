package extra;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class M implements KeyListener{
	static M m = new M();
static String level1_1="######";
static String level1_2="#....#";
static String level1_3="#....#";
static String level1_4="#....#";
static String level1_5="######";
static int x=4,y=2;
public static void main(String[] args) {
	JFrame frame = new JFrame("Key Listener");
	KeyListener listener = new KeyListener() {
		@Override
		public void keyTyped(KeyEvent e) {
		}
		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			switch(key) {
			case KeyEvent.VK_W:
				y++;
				break;
			case KeyEvent.VK_S:
				y--;
				break;
			case KeyEvent.VK_D:
				x++;
				break;
			case KeyEvent.VK_A:
				x--;
				break;
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
		}
	};
	frame.addKeyListener(listener);
	frame.setVisible(true);
	while(true) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		drawLvl(x,y);
	}
}
public static void drawLvl(int x, int y) {
level1_1="######";
level1_2="#....#";
level1_3="#....#";
level1_4="#....#";
level1_5="######";
if(y==1) {
	if(x==2) {
		level1_2="#@...#";
	}else if(x==3) {
		level1_2="#.@..#";
	}else if(x==4) {
		level1_2="#..@.#";
	}else if(x==5) {
		level1_2="#...@#";
	}
}else if(y==2) {
	if(x==2) {
		level1_3="#@...#";
	}else if(x==3) {
		level1_3="#.@..#";
	}else if(x==4) {
		level1_3="#..@.#";
	}else if(x==5) {
		level1_3="#...@#";
	}
}else if(y==3) {
	if(x==2) {
		level1_4="#@...#";
	}else if(x==3) {
		level1_4="#.@..#";
	}else if(x==4) {
		level1_4="#..@.#";
	}else if(x==5) {
		level1_4="#...@#";
	}
}
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(level1_1);
	System.out.println(level1_2);
	System.out.println(level1_3);
	System.out.println(level1_4);
	System.out.println(level1_5);
}
@Override
public void keyTyped(KeyEvent e) {
}
@Override
public void keyPressed(KeyEvent e) {
	int key = e.getKeyCode();
	switch(key) {
	case KeyEvent.VK_W:
		y--;
		break;
	case KeyEvent.VK_S:
		y++;
		break;
	case KeyEvent.VK_D:
		x++;
		break;
	case KeyEvent.VK_A:
		x--;
		break;
	}
}
@Override
public void keyReleased(KeyEvent e) {
}
}
