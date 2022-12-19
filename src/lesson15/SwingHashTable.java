package lesson15;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class SwingHashTable extends JFrame {
    private final int WIDTH_SIZE = 1024;
    private final int HEIGHT_SIZE = 600;

    public static void main(String[] args) {
        new SwingHashTable();
    }

    public SwingHashTable() {
        setTitle("HashTable");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setPreferredSize(new Dimension(WIDTH_SIZE, HEIGHT_SIZE));
        canvasPanel.setBackground(Color.lightGray);

        JTextField textField = new JTextField();
        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(e -> {
            // TODO
            canvasPanel.repaint();
        });
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.X_AXIS));
        southPanel.add(textField);
        southPanel.add(enterButton);

        add(canvasPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            // TODO
        }
    }
}
