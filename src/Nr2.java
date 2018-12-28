import javax.swing.*;
import java.awt.*;

public class Nr2 extends JFrame {

    public Nr2(){

        setTitle("Reee");
        setBounds((Toolkit.getDefaultToolkit().getScreenSize().width/2)-250,(Toolkit.getDefaultToolkit().getScreenSize().height/2)-250,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        Container contentPane =
                getContentPane();
        contentPane.setLayout(null);

        JButton a = new JButton();

        contentPane.add(a);
        a.setText("Button");
        a.setBounds(10,10,100,100);

        a.addActionListener(e -> System.out.println(a.getText()));



    }


    public static void main(String[] args) {
        new Nr2();
    }



}
