package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack implements ActionListener {

	int mole;
	JFrame frameReal = new JFrame();
	JPanel frame = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button10 = new JButton();
	JButton button11 = new JButton();
	public boolean a;
	public int moles=0;

	public void drawButtons(int a) {
		this.a=false;
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		frame.add(button10);
		frame.add(button11);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		frameReal.setSize(200, 200);
		frameReal.setDefaultCloseOperation(frameReal.EXIT_ON_CLOSE);
		frameReal.setResizable(false);
		frameReal.add(frame);
		frameReal.setVisible(true);
		Random r = new Random();
		int rand = r.nextInt(11);
		if (rand == 0) {
			button.setText("Mole");
			mole = 0;
		}
		if (rand == 1) {
			button1.setText("Mole");
			mole = 1;
		}
		if (rand == 2) {
			button2.setText("Mole");
			mole = 2;
		}
		if (rand == 3) {
			button3.setText("Mole");
			mole = 3;
		}
		if (rand == 4) {
			button4.setText("Mole");
			mole = 4;
		}
		if (rand == 5) {
			button5.setText("Mole");
			mole = 5;
		}
		if (rand == 6) {
			button6.setText("Mole");
			mole = 6;
		}
		if (rand == 7) {
			button7.setText("Mole");
			mole = 7;
		}
		if (rand == 8) {
			button8.setText("Mole");
			mole = 8;
		}
		if (rand == 9) {
			button9.setText("Mole");
			mole = 9;
		}
		if (rand == 10) {
			button10.setText("Mole");
			mole = 10;
		}
		if (rand == 11) {
			button11.setText("Mole");
			mole = 11;
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (mole == 0 && e.getSource() == button) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 1 && e.getSource() == button1) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 2 && e.getSource() == button2) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 3 && e.getSource() == button3) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 4 && e.getSource() == button4) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 5 && e.getSource() == button5) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 6 && e.getSource() == button6) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 7 && e.getSource() == button7) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 8 && e.getSource() == button8) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 9 && e.getSource() == button9) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 10 && e.getSource() == button10) {
			speak("Right!");
			frameReal.dispose();
		} else if (mole == 11 && e.getSource() == button11) {
			speak("Right!");
			frameReal.dispose();
		} else {
			speak("Wrong!");
			frameReal.dispose();
		}
		a=true;
		moles++;
	}
}
