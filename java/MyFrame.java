import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class MyFrame extends JFrame implements WindowListener {
    Random rand = new Random();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    int width = dim.getSize().width;
    int height = dim.getSize().height;
    JLabel label = new JLabel();
    public static int xOut = 0;


    public MyFrame() {
        label.setVisible(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        Icon icon = new ImageIcon(MyMethods.theDOOOOOG);
        label.setIcon(icon);

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setBounds(rand.nextInt(width - 560) + 1, rand.nextInt(height - 378) + 1, 560, 378);
        this.setResizable(false);
        this.addWindowListener(this);
        this.setAlwaysOnTop(true);
        this.add(label);
        Thread thread = new Thread() {
            public void run(){
                while(true) {
                    MyMethods.sleep(5000);
                    MyMethods.newRun();
                }
            }
        };
        thread.start();
        MyMethods.playMusic();
        this.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    public static int clickCount = 1;
    @Override
    public void windowClosing(WindowEvent e) {
        xOut++;
        this.dispose();
        for(int x = 0; x < 2; x++) {
            MyMethods.newRun();
            MyMethods.sleep(50);
        }
        System.exit(0);
        }

    @Override
    public void windowClosed(WindowEvent e) {
    }
    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}