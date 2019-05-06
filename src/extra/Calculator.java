package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener {
	JFrame frame;
	JLabel label;
	JPanel panel;
	JPanel panel1;
	JPanel panel2;
	JButton add;
	JButton sub;
	JButton mul;
	JButton div;
	JTextField field;
	JTextField field1;
	public Calculator() {
		
	}
	public void configGUI() {
		panel = new JPanel();
		label = new JLabel("Your answer appears here");
		frame = new JFrame();
		panel2 = new JPanel();
		panel1 = new JPanel();
		field = new JTextField(10);
		field1 = new JTextField(10);
		frame.setTitle("Calculator");
		add = new JButton();
		sub = new JButton();
		mul = new JButton();
		div = new JButton();
		frame.add(panel);
		panel.add(label);
		panel1.add(add);
		panel1.add(sub);
		panel1.add(mul);
		panel1.add(div);
		panel1.setBounds(0,60,500,50);
		panel.setBounds(0,120,500,50);
		panel2.setBounds(0, 0, 500, 60);
		panel2.add(field);
		panel2.add(field1);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500, 180);
		frame.add(panel1);
		frame.add(panel2);
		frame.setResizable(false);
		frame.setVisible(true);
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		add.setText("add");
		sub.setText("sub");
		div.setText("div");
		mul.setText("mul");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(field.getText());
		int b = Integer.parseInt(field1.getText());
		int c;
		if (e.getSource() == add) {
			c = a + b;
			label.setText("" + c);
		} else if (e.getSource() == sub) {
			c = a - b;
			label.setText("" + c);
		} else if (e.getSource() == div) {
			c = a / b;
			label.setText("" + c);
		} else {
			c = a * b;
			label.setText("" + c);
		}
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
calc.configGUI();
	}

}
