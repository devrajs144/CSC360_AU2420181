import javax.swing.*;
import java.awt.*;

public class samplecode extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // =========================
        // LINE
        // =========================
        Graphics2D g2 = (Graphics2D) g;

        // Line color and width
        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(5));

        // Draw line
        g2.drawLine(50, 50, 250, 50);


        // =========================
        // SQUARE
        // =========================
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(4));

        // Draw square
        g2.drawRect(50, 100, 100, 100);


        // =========================
        // RECTANGLE
        // =========================
        g2.setColor(Color.GREEN);
        g2.setStroke(new BasicStroke(6));

        // Draw rectangle
        g2.drawRect(200, 100, 150, 80);


        // =========================
        // CIRCLE
        // =========================
        g2.setColor(Color.ORANGE);
        g2.setStroke(new BasicStroke(3));

        // Draw circle
        g2.drawOval(50, 250, 100, 100);


        // =========================
        // TRIANGLE
        // =========================
        g2.setColor(Color.MAGENTA);
        g2.setStroke(new BasicStroke(5));

        int[] x = {250, 200, 300};
        int[] y = {230, 330, 330};

        // Draw triangle
        g2.drawPolygon(x, y, 3);
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

