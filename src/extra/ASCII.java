package extra;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class ASCII implements KeyListener {
String a="#########";
String b="#.......#";
String c="#.......#";
String d="#.......######";
String e="#............#";
String f="#............#";
String g="##############";
int x=2, y=2;
boolean big=false;
boolean gameBegun=false;
boolean character=false;					//TRUE FOR X, FALSE FOR S
JFrame frame;
JLabel label;
public ASCII() {
	
}
public void config() {
	frame = new JFrame();
	label = new JLabel("Control with arrow keys");
	frame.add(label);
	frame.setSize(300, 50);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
public void tick() {
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	if(big) {
		big=false;
	}else {
		big=true;
	}
}
public void run() {
	while(true) {
		tick();
		if(gameBegun) {
			if(y==2) {
				String chara;
				if(big==true) {
					if(character) {
						chara="X";
					}else {
						chara="S";
					}
				}else {
					if(character) {
						chara="x";
					}else {
						chara="s";
					}
				}
				switch(x) {
				case 2:
					b="#"+chara+"......#";
				}
			}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
		}else {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Choose Your Character!");
			if(big) {
				System.out.println("       X     S");
			}else {
				System.out.println("       x     s");
			}
			System.out.println();
			System.out.println("Left for X, right for S.");
			frame.addKeyListener(this);
		}
	}
}
@Override
public void keyTyped(KeyEvent e) {
	
}
@Override
public void keyPressed(KeyEvent e) {
	int key = e.getKeyCode();
	if(gameBegun==false) {
		switch(key) {
		case KeyEvent.VK_LEFT:
			character=true;
			break;
		case KeyEvent.VK_RIGHT:
			character=false;
			break;
		}
		gameBegun=true;
	}
}
@Override
public void keyReleased(KeyEvent e) {
	
}
}
