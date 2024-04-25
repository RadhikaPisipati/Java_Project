package StudentManagementSystemProj;

import javax.swing.*;
import java.awt.*;

public class SignUp2 extends JFrame{
    SignUp2(){
        JLabel labelfName = new JLabel("Submitted!");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 38));
        labelfName.setBounds(500, 240, 200, 30);
        add(labelfName);

        setSize(500,500);
        setVisible(true);
    }
    public static void main(String args[]){
        new SignUp();//obj
}
}

