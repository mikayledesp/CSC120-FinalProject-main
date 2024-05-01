import java.awt.*;
import javax.swing.*;

    public class DisplayImage extends Canvas {
    /**
     * 
     * 
     */
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("map2.gif");
        g.drawImage(i,0,0,this);
    }

    

}

