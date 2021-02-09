import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class MyMethods {
    public static void sleep(int x) {
        try{
            Thread.sleep(x);
        } catch(InterruptedException e) {

        }
    }
    public static void newRun() {
        try {
            String command = "start KoroneVirus.exe";
            Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", command});
        } catch (IOException ae) {
            ae.printStackTrace();
        }
    }

    public static void playMusic() {
        Thread thread = new Thread() {

                public void run() {
                    try {
                        InputStream in = MyMethods.class.getClassLoader().getResourceAsStream("Korone noises.mp3");
                        Player player = new Player(in);
                        player.play();
                    } catch (JavaLayerException e) {
                        e.printStackTrace();
                    }
                }

            };
        thread.start();
        }
    public static Image theDOOOOOG = getImage();
    public static Image getImage() {
        InputStream in = MyMethods.class.getClassLoader().getResourceAsStream("doog.gif");
        Image image = null;
        try {
            image = Toolkit.getDefaultToolkit().createImage(org.apache.commons.io.IOUtils.toByteArray(in));
        } catch(IOException e){}
        return image;
    }
}

