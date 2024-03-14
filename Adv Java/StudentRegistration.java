import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class StudentRegistration implements ActionListener{
	JFrame FForm;
	JLabel lblHead,lblRoll,lblName,lblAdd,lblClass,lblGen,lblHob,lblSub;
	JTextField txtRn,txtName;
	JTextArea taAdd;
	JComboBox jClass;
	JRadioButton rbGender[] = new JRadioButton[3];
	ButtonGroup grpGen;
	JCheckBox cbHobbies[] = new JCheckBox[6];
	JList lSub;
	JButton btnSubmit;
	JPanel pClass,pGen,pHob,pSub,pEnd;
	StudentRegistration(){
		
		FForm = new JFrame("Registration Form");
		FForm.setLayout(null);
				
		lblHead = new JLabel("STUDENT REGISTRATION",JLabel.CENTER);
		lblHead.setBounds(100,10,200,50);
		FForm.add(lblHead);
		lblRoll = new JLabel("Enter Roll No. : ");
		lblRoll.setBounds(50,70,100,20);
		FForm.add(lblRoll);
		txtRn = new JTextField(10);
		txtRn.setBounds(170,70,100,20);
		FForm.add(txtRn);
		
		lblName = new JLabel("Enter Name : ");
		lblName.setBounds(50,100,100,20);
		FForm.add(lblName);
		txtName = new JTextField(10);
		txtName.setBounds(170,100,150,20);
		FForm.add(txtName);
		
		lblAdd = new JLabel("Enter Address : ");
		lblAdd.setBounds(50,130,100,20);
		FForm.add(lblAdd);
		
		taAdd = new JTextArea(5,20);
		taAdd.setBounds(170,130,150,50);
		FForm.add(taAdd);
		taAdd.setWrapStyleWord(true);
		
		
		lblClass = new JLabel("Class");
		lblClass.setBounds(50,190,100,20);
		FForm.add(lblClass);
		
		String[] classes = new String[]{"B.Sc I","B.Sc II","B.Sc III","BCS I","BCS II","BCS III"};
		jClass = new JComboBox(classes);
		jClass.setEditable(true);
		jClass.setBounds(170,190,150,20);
		FForm.add(jClass);
		
		lblGen = new JLabel("Gender");
		lblGen.setBounds(50,220,100,30);
		FForm.add(lblGen);
		
		pGen = new JPanel();
		rbGender[0] = new JRadioButton("Male");
		rbGender[1] = new JRadioButton("Female");
		rbGender[2] = new JRadioButton("Other");
		grpGen = new ButtonGroup();
		for(int i=0;i<3;i++){
			pGen.add(rbGender[i]);
			grpGen.add(rbGender[i]);
		}
		pGen.setBounds(160,220,200,50);
		FForm.add(pGen);
		
		
		lblHob = new JLabel("Hobbies");
		lblHob.setBounds(50,260,100,30);
		FForm.add(lblHob);
		
		pHob = new JPanel();
		pHob.setLayout(new GridLayout(2,3));
		cbHobbies[0] = new JCheckBox("Reading");
		cbHobbies[1] = new JCheckBox("Singing");
		cbHobbies[2] = new JCheckBox("Dancing");
		cbHobbies[3] = new JCheckBox("Treking");
		cbHobbies[4] = new JCheckBox("Travelling");
		cbHobbies[5] = new JCheckBox("Drawing");
		for(int i=0;i<6;i++){
			pHob.add(cbHobbies[i]);
		}
		pHob.setBounds(160,250,300,60);
		FForm.add(pHob);
		
		lblSub = new JLabel("Subject");
		lblSub.setBounds(50,310,100,30);
		FForm.add(lblSub);
		
		String[] Subject = new String[]{"Java","ASP.Net","Linux","Python","Data Structure","CPP"};
		lSub = new JList(Subject);
		lSub.setBounds(160,310,100,120);
		FForm.add(lSub);
		
		btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(150,450,100,35);
		FForm.add(btnSubmit);
		
				
		FForm.setSize(500,550);
		FForm.setVisible(true);
		FForm.setLocationRelativeTo(null);
		FForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
	
		
	}
	public static void main(String[] args){
		new StudentRegistration();
	}
}
