import javax.swing.*;

public class Window extends JFrame implements Runnable {

    public Window() {
        this.setSize(Constants.ScreenWidth, Constants.ScreenHeight);
        this.setTitle(Constants.ScreenTitle);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void update (double dt) {
        System.out.println(dt);
    }
    public void run() {
        while (true) {

        }
    }
}
