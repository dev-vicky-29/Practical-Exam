import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class RadioButtonDemo implements ItemListener{
	JFrame Frame;
	JRadioButton Option[] = new JRadioButton[8];
	ButtonGroup Grp1,Grp2,Grp3;
	JTextField Msg1;
	JLabel Lbl1,Lbl2,Lbl3,Lbl4;
	JPanel P1,P2,P3;
	RadioButtonDemo(){
		Frame = new JFrame("Radio Button Demo");
		Frame.setLayout(new GridLayout(10,1));
		P1= new JPanel();P2= new JPanel();
		P3= new JPanel();
		Option[0] = new JRadioButton("B.Sc ");
		Option[1] = new JRadioButton("BCS ");
		Option[2] = new JRadioButton("First Year");
		Option[3] = new JRadioButton("Second Year");
		Option[4] = new JRadioButton("Third Year");
		Option[5] = new JRadioButton("Computer Science");
		Option[6] = new JRadioButton("Statistic");
		Option[7] = new JRadioButton("Mathematics");
		Grp1 = new ButtonGroup();
		Grp2 = new ButtonGroup();
		Grp3 = new ButtonGroup();
		
		Option[0].addItemListener(this);Option[1].addItemListener(this);
		P1.add(Option[0]);P1.add(Option[1]);
		Grp1.add(Option[0]);Grp1.add(Option[1]);
		
		Option[2].addItemListener(this);Option[3].addItemListener(this);Option[4].addItemListener(this);
		P2.add(Option[2]);P2.add(Option[3]);P2.add(Option[4]);
		Grp2.add(Option[2]);Grp2.add(Option[3]);Grp2.add(Option[4]);
		
		Option[5].addItemListener(this);Option[6].addItemListener(this);Option[7].addItemListener(this);
		P3.add(Option[5]);P3.add(Option[6]);P3.add(Option[7]);
		Grp3.add(Option[5]);Grp3.add(Option[6]);Grp3.add(Option[7]);
		
		
		
		Msg1 = new JTextField(50);
		Lbl1 = new JLabel("Select Your Class",JLabel.CENTER);
		Lbl2 = new JLabel("Select Your Year",JLabel.CENTER);
		Lbl3 = new JLabel("Select Your Course",JLabel.CENTER);
		
		Frame.add(Lbl1);
		Frame.add(P1);
		Frame.add(Lbl2);
		Frame.add(P2);
		Frame.add(Lbl3);
		Frame.add(P3);
		Frame.add(Msg1);
		Frame.pack();
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public void itemStateChanged(ItemEvent ie){
			String msg = "YOUR INFORMATION : ";
			for(int i=0;i<8;i++)
				if(Option[i].isSelected())
					msg += Option[i].getText()+" " ;
				Msg1.setText(msg);
		}
		public static void main(String[] args){
			new RadioButtonDemo();
		}
		}
