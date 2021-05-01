import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class here extends JFrame{

    
private JButton reg;
   private JButton custom;

   public here(){
       super("The title");
       setLayout(new FlowLayout());

       reg = new JButton("reg Button");
       add(reg);

       Icon vxky = new ImageIcon(getClass().getResource("vxky.png"));
       Icon shey = new ImageIcon(getClass().getResource("shey.png"));

       custom =  new JButton("Custom", vxky);
       custom.setRolloverIcon(vxky);
       add(custom);

       HandlerClass handler = new HandlerClass();
       reg.addActionListener(handler);
       custom.addActionListener(handler);

   }

   private class HandlerClass implements ActionListener{
       
    public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
    }
   }
    
}
