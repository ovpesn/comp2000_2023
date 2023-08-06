import javax.swing.*;
import java.awt.*;

public class Week2 extends JFrame{
    // extend supposedly makes the entire class a JFrame
    public static void main(String[] args) throws Exception {
        Week2 window = new Week2();
    }

    class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        public void paint(Graphics g) {
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
        // 
        this.pack();
        //
        this.setVisible(true);
        // makes the JFrame visible
    }
}
