import java.awt.*;
import javax.swing.*;

    public class DisplayImage extends Canvas {
    /**
     * Method sets up the map image so that it can be printed in the game loop 
     * @param Graphics 
     * 
     */
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("map2.gif");
        g.drawImage(i,0,0,this);
    }

    

}

