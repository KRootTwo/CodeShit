package one;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class one {
public static void main(String[] args) {
		
	// JFrame = a GUI window to add components to
		
	JFrame frame = new JFrame();  // Creates a frame
	frame.setTitle("Siuuu");  // Sets title for frame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit
	frame.setResizable(false);  // Prevents resizing
	frame.setSize(420, 420);  // Set x & y direction of the frame
	frame.setVisible(true);  // Make frame visible
		
	ImageIcon img = new ImageIcon("hcre.png");  // Create ImageIcon
	frame.setIconImage(img.getImage());  // Set icon of frame
	frame.getContentPane().setBackground(Color.black); // Change bg color
	frame.getContentPane().setBackground(new Color(0x00000)); // Change bg color
	frame.getContentPane().setBackground(new Color(123, 50, 250)); // Change bg 
	
	
}}
