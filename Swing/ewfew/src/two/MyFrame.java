package two;
import java.awt.Color;
import javax.swing.*;

public class MyFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	MyFrame() {
		this.setTitle("Siuuu"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(false);  
		this.setSize(420, 420);
		this.setVisible(true);  
			
		ImageIcon img = new ImageIcon("hcre.png"); 
		this.setIconImage(img.getImage());  
		this.getContentPane().setBackground(new Color(123, 50, 250)); 
	}
}
