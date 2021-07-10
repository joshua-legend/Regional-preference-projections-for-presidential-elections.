import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Splash extends JFrame {

    int minimum = 0;
    int maximum = 100;
    URL url;
    JPanel southJpanel = new JPanel();
    JProgressBar progress = new JProgressBar(JProgressBar.HORIZONTAL, minimum, maximum);
    Splash(){


        try {
            url = new URL("http://i.giphy.com/xT0GqdXpoKAazgF8t2.gif");
        } catch (Exception e) { // do nothing or just print a message }
        }
        ImageIcon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);

        add(BorderLayout.SOUTH,southJpanel);
        southJpanel.add(label);
//        progress.setValue(0);
//        progress.setStringPainted(true); //percent show

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

//        fill(progress);

    }

//    public static void fill(JProgressBar jProgressBar)
//    {
//        int i = 0;
//        try {
//            while (i <= 100) {
//                jProgressBar.setValue(i + 10);
//                Thread.sleep(1000);
//                i += 20;
//            }
//        }
//        catch (Exception e) { }
//    }

    public static void main(String[] args) {
        new Splash();
    }
}
