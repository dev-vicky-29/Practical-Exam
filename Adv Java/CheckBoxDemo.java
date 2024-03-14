import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CheckBoxDemo implements ItemListener
{
JFrame f;
JCheckBox c[] = new JCheckBox[3];
JTextField t1;
JLabel l1;
JPanel p1;
CheckBoxDemo()
{
  f = new JFrame("CheckBox  Demo");
  f.setLayout(new GridLayout(3,1));
  p1=new JPanel();
  c[0] = new JCheckBox("Linux");
  c[1] = new JCheckBox("Windows");
  c[2] = new JCheckBox("Mac");
  for(int i=0; i<3; i++)
  {
   p1.add(c[i]);
   c[i].addItemListener(this);
  }
t1 = new JTextField(20);
l1 = new JLabel("Select the Operating Systems you have used", JLabel.CENTER);
f.add(l1); f.add(p1); f.add(t1);
f.pack();
f.setVisible(true);
//t.setFont(new Font( Font.BOLD,18));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void itemStateChanged(ItemEvent ie)
{
 String message = "You have used:";
 for(int i=0;i<3;i++)
 if(c[i].isSelected())
   message += c[i].getText() + "  ";
   t1.setText(message);
}
   public static void main(String [] args)
   {
     new CheckBoxDemo();
   }
}
