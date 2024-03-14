import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyCalculator implements ActionListener{
	JFrame frmCalc;
	JButton btnSum,btnSub,btnMul,btnDiv,btnMod;
	JLabel lblNum1, lblNum2, lblResult;
	JTextField  txtNum1,txtNum2,txtResult;
	MyCalculator(){
		frmCalc = new JFrame("CALCULATOR");
		frmCalc.setLayout(new FlowLayout());
		txtNum1 = new JTextField(10);
		txtNum2 = new JTextField(10);
		btnSum = new JButton("+");
		btnSub = new JButton("-");
		btnMul = new JButton("*");
		btnDiv = new JButton("/");
		btnMod = new JButton("%");
		txtResult = new JTextField(10);
		lblNum1 = new JLabel("Enter Number 1:");
		lblNum2 = new JLabel("Enter Number 2:");
		lblResult =  new JLabel("Result :");
		btnSum.addActionListener(this);
		btnSub.addActionListener(this);
		btnMul.addActionListener(this);
		btnDiv.addActionListener(this);
		btnMod.addActionListener(this);
		frmCalc.add(lblNum1);  	frmCalc.add(txtNum1);
		frmCalc.add(lblNum2); 	frmCalc.add(txtNum2);
	frmCalc.add(btnSum);	frmCalc.add(btnSub);					frmCalc.add(btnMul);	frmCalc.add(btnDiv);					frmCalc.add(btnMod); 
		frmCalc.add(lblResult);  	frmCalc.add(txtResult);
		frmCalc.setSize(250,200);
		frmCalc.setVisible(true);
		frmCalc.setLocationRelativeTo(null);
		frmCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae){
		Integer a = Integer.parseInt(txtNum1.getText());
		Integer b = Integer.parseInt(txtNum2.getText());
		Integer c = 0 ;
		if(ae.getSource() == btnSum)
			c = a + b;
		else if(ae.getSource() == btnSub)
			c = a - b;
		else if(ae.getSource() == btnMul)
			c = a * b;
		else if(ae.getSource() == btnDiv)
		    c = a / b;
		else if(ae.getSource() == btnMod)
			c = a % b;
		txtResult.setText(c.toString());
	}
	public static void main(String[] args){
		new MyCalculator();
	}
}
