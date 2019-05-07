package extra;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.*;

public class Slot implements ActionListener{
	Random r = new Random();
	JFrame frame = new JFrame();
	JLabel label1=new JLabel("Hi");
	JLabel label2 = new JLabel("2");
	JLabel label3 = new JLabel("3");
	JLabel result = new JLabel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JButton button = new JButton("SPIN!");
	public Slot() {
		
	}
	public void config() {
		frame.add(panel1);
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		frame.add(panel2);
		panel2.add(result);
		panel2.add(button);
		panel1.setVisible(true);
		button.addActionListener(this);
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
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
	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = r.nextInt(2);
		if(rand==0) {
			try {
				label1=createLabelImage("cherry.jpedg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(rand==1) {
			try {
				label1=createLabelImage("Lime.pngf");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(rand==2) {
			try {
				label1=createLabelImage("orange.jdpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
