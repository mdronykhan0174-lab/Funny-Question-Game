import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FunnyQuestion {

    static Random random = new Random();

    public static void main(String[] args) {

        // Main Frame
        JFrame frame = new JFrame("Youtube: @ronikhan8547");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Question Label
        JLabel questionLabel = new JLabel("Do you love me❤️?");
        questionLabel.setBounds(140, 30, 200, 30);
        frame.add(questionLabel);

        // YES Button
        JButton yesButton = new JButton("Yes🌹");
        yesButton.setBounds(150, 80, 80, 30);
        frame.add(yesButton);

        // NO Button
        JButton noButton = new JButton("No");
        noButton.setBounds(150, 130, 80, 30);
        frame.add(noButton);

        // YES button action (Popup)
        yesButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    frame,
                    "I love you, too",
                    "Popup",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        // NO button mouse hover action
        noButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                int x = random.nextInt(300);
                int y = random.nextInt(300);
                noButton.setLocation(x, y);
            }
        });

        frame.setVisible(true);
    }
}
