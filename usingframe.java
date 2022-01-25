import javax.swing.*;

/**
 * Created by Lenovo on 9/25/2021.
 */
public class usingframe {
    public static void main(String[] args) {
        JFrame myframe=new JFrame("my first name");
        myframe.setSize(500,55);
        MyComponent paint=new MyComponent();
        myframe.add(paint);
        myframe.setVisible(true);
    }
}
