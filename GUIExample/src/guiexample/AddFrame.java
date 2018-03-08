package guiexample;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddFrame extends JFrame implements ActionListener{
    
        JLabel l1;
        JLabel l2;
        JLabel l3;
        JTextField t1;
        JTextField t2;
        JButton b1;
    public AddFrame()
    {
        l1=new JLabel("Number : ");
        l2=new JLabel("Number : ");
        l3=new JLabel("Ans");
        t1=new JTextField(15);
        t2=new JTextField(15);
        b1=new JButton("Addition");
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
        b1.addActionListener(this);
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l3.setText(
                String.valueOf(
                        Integer.parseInt(t1.getText())
                    +
                        Integer.parseInt(t2.getText())
                )
        );
    }
}
