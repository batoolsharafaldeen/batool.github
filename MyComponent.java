import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by Lenovo on 9/25/2021.
 */
public class MyComponent extends JComponent {

    protected void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        Rectangle myrect=new Rectangle(50,50,100,100);
        g2.setColor(Color.BLUE);
        g2.fill(myrect);

    }
}
