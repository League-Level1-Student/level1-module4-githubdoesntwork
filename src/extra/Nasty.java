package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel label1;
	JButton button;
	JButton button1;
	JPanel panel2;

	public void run() {
		frame = new JFrame();
		frame.setSize(500,300);
		panel = new JPanel();
		button = new JButton();
		button1 = new JButton();
		label1 = new JLabel();
		panel2=new JPanel();
		frame.add(panel2);
		frame.add(panel);
		panel2.setBounds(0,150,500,100);
		panel2.setVisible(true);
		panel.add(button1);
		panel.add(button);
		panel2.add(label1);
		button.setText("Treat");
		button1.setText("Trick");
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			label1.setVisible(true);
			label1.setText("Insert dog here");
		}
		if (e.getSource() == button1) {
			label1.setVisible(true);
			label1.setText("Insert scary face here");
		}
	}
}
