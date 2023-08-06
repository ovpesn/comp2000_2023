import javax.swing.*;
import java.awt.*;

public class Week2 extends JFrame{
    // extend supposedly makes the entire class a JFrame
    // JFrame opens a new window upon execution
    // unlike Frame, it can close the program by clcosing the window
    public static void main(String[] args) throws Exception {
        // Week2 week2 = new Week2();
    }

    class Canvas extends JPanel {
        // a container used to store a group of components
        // in this case, it is used to store the grid and cells
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        public void paint(Graphics g) {
            // grants the ability to draw onto components
            g.setColor(Color.GRAY);
            g.fillRect(0, 0, 720, 720);
            for(int i = 10; i < 710; i += 35) {
                for(int j = 10; j < 710; j += 35) {
                    g.setColor(Color.BLACK);
                    g.drawRect(i, j, 35, 35); 
                }
            }
        }
    }

    private Week2() {
        Canvas canvas = new Canvas();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // terminates the program upon closing the window
        this.setContentPane(canvas);
        // used to hold GUI-related objects
        // usually used over a JPanel
        this.pack();
        // sizes the frame so that all contents are at or above preferred sizes
        this.setVisible(true);
        // makes the JFrame appear on the screen
    }
}
