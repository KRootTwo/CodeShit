package three;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		
		// JLabel = a GUI display area for a string of text, an image or both
		
		ImageIcon img = new ImageIcon("sw.png");
		
		JLabel label = new JLabel();  // Create a label
		label.setText("Siuuu");  // Set text
		label.setIcon(img);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1080, 720);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.black);
		
		frame.add(label);
		
	}
}
