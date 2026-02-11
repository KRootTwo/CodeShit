package test1;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Test1 extends JFrame{
	private static final long serialVersionUID = 1L;
	Test1() {
		this.setTitle("Siuuu");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.setVisible(true);
		
		ImageIcon ig = new ImageIcon("hcre.png");
		this.setIconImage(ig.getImage());
	}
}
