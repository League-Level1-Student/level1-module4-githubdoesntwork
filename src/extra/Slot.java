package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot implements ActionListener {
	JFrame frame;
	JButton button;
	JPanel panel1;
	JPanel panel2;
	JPanel mainPanel;
	JLabel label1;
	JLabel label2;
	JLabel label3;

	public void config() {
		
		label1 = new JLabel("LABEL1");
		label2 = new JLabel("LABEL2");
		label3 = new JLabel("LABEL3");
		

		
		rebuild();
	}
	public void rebuild() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setResizable(false);	
		button = new JButton("SPIN!");
		panel1 = new JPanel();
		panel2 = new JPanel();
		mainPanel = new JPanel();
		button.addActionListener(this);
		
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);

		panel2.add(button);

		BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		
		mainPanel.setLayout(boxLayout);
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		
		frame.add(mainPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int ID1=0, ID2=0, ID3=0;
		Random r = new Random();
		int rand = r.nextInt(3);
		if (rand == 0) {
			try {
				label1=createLabelImage("Lime.png");
				ID1=1;
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		} else if (rand == 1) {
			try {
				label1=createLabelImage("cherry.jpeg");
				ID1=2;
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		} else {
			try {
				label1=createLabelImage("orange.jpeg");
				ID1=3;
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		}
		r = new Random();
		rand = r.nextInt(3);
		if (rand == 0) {
			try {
				label2=createLabelImage("Lime.png");
				ID2=1;
				System.out.println();
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		} else if (rand == 1) {
			try {
				label2=createLabelImage("cherry.jpeg");
				ID2=2;
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		} else {
			try {
				label2=createLabelImage("orange.jpeg");
				ID2=3;
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		}
		r = new Random();
		rand = r.nextInt(3);
		if (rand == 0) {
			try {
				label3=createLabelImage("Lime.png");
				ID3=1;
				System.out.println();
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		} else if (rand == 1) {
			try {
				label3=createLabelImage("cherry.jpeg");
				ID3=2;
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		} else {
			try {
				label3=createLabelImage("orange.jpeg");
				ID3=3;
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		}
		frame.dispose();
		rebuild();
		frame.repaint();
		if(ID1==ID2&&ID2==ID3) {
			JOptionPane.showMessageDialog(null, "You win! The chance of winning was 1/9.");
		System.exit(0);
		}
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

}
