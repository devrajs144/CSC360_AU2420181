
import java.awt.*;
import javax.swing.*;

public class samplecode extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // =========================
        // SQUARE
        // =========================
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(4));

        // Draw square
        g2.drawRect(50, 100, 100, 100);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Basic Computer Graphics");

        samplecode panel = new samplecode();

        frame.add(panel);

        frame.setSize(450, 400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
