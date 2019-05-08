package extra;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Slot implements ActionListener {
	JFrame frame;
	JButton button;
	JPanel panel1;
	JPanel panel2;
	JLabel label1;
	JLabel label2;
	JLabel label3;

	public Slot() {

	}

	public void config() {
		frame = new JFrame();
		button = new JButton();
		panel1 = new JPanel();
		panel2 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		
		panel2.add(button);
		panel2.setLocation(250, 300);
		
		button.addActionListener(this);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random r= new Random();
int rand = r.nextInt(2);
if(rand==0) {
	ImageIcon icon = new ImageIcon("Lime.png");
	label1.setIcon(icon);
}else if(rand==1) {
	ImageIcon icon = new ImageIcon("cherry.jpeg");
	label1.setIcon(icon);
}else {
	ImageIcon icon = new ImageIcon("orange.jpeg");
	label1.setIcon(icon);
}
	}

}
