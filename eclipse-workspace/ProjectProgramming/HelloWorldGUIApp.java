import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;
public class HelloWorldGUIApp{
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame nemo = new JFrame("HelloWorld GUI");
                nemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nemo.setPreferredSize(new Dimension(200, 100));
                JLabel msg = new JLabel("Hello JAVA World!!", SwingConstants.NORTH_EAST);
                nemo.getContentPane().add(msg);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                nemo.setLocation(dim.width/2-200/2, dim.height/2-400/2);
                nemo.pack();
                nemo.setVisible(true);
                
                                                
            }
        });
    }
}
