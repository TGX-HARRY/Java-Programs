import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.File;
import java.util.Random;

public class UltimatePrank extends JWindow {

    private Clip clip;
    private JLabel label;
    private JPanel panel;

    public UltimatePrank() {
        setAlwaysOnTop(true);
        setBounds(GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getMaximumWindowBounds());

        panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.BLACK);

        label = new JLabel("Loading system files...", SwingConstants.CENTER);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("Consolas", Font.BOLD, 30));

        panel.add(label, BorderLayout.CENTER);
        add(panel);

        // ESC to exit
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    stopSound();
                    dispose();
                    System.exit(0);
                }
            }
        });

        setFocusable(true);
        setVisible(true);
        requestFocus();

        // Start prank flow
        new Thread(this::startSequence).start();
    }

    private void startSequence() {
        try {
            // Fake loading phase
            Thread.sleep(2000);

            label.setText("Decrypting data...");
            Thread.sleep(2000);

            label.setText("WARNING: Unauthorized access detected");
            Thread.sleep(1500);

            // Random delay for unpredictability
            Thread.sleep(new Random().nextInt(3000));

            // JUMPSCARE
            triggerScare();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void triggerScare() {
        try {
            panel.removeAll();

            ImageIcon icon = new ImageIcon("scary.jpg");
            JLabel imgLabel = new JLabel(icon);
            imgLabel.setHorizontalAlignment(SwingConstants.CENTER);

            panel.add(imgLabel, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();

            playSoundLoop("scary.wav");

            // Flicker effect
            for (int i = 0; i < 20; i++) {
                panel.setBackground(i % 2 == 0 ? Color.BLACK : Color.RED);
                Thread.sleep(80);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playSoundLoop(String path) {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void stopSound() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }

    public static void main(String[] args) {
        new UltimatePrank();
    }
}

