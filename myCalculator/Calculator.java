package myCalculator;

import javax.swing.*;
import java.awt.event.*;
 
class Calculator implements ActionListener
{
	JFrame f;
	JTextField display;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bDiv,bMul,bSub,bAdd,bDec,bEq,bMem,bMemUse,bClr;
 
	static double a=0,b=0,m=0,result=0;
	static int opType=0;// Used in switch statement
	static final String ENTERNUM ="Enter Number First";
 
	Calculator()
	{
		f=new JFrame("Calculator");
		display=new JTextField("");
		display.setHorizontalAlignment(JTextField.RIGHT);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bDiv=new JButton("/");
		bMul=new JButton("*");
		bSub=new JButton("-");
		bAdd=new JButton("+");
		bDec=new JButton(".");
		bEq=new JButton("=");
		bMem=new JButton("Mem");
		bMemUse=new JButton("MemUse");
		bClr=new JButton("Clear");
	// Set size of textfield and buttons
		display.setBounds(30,40,280,30);
		b7.setBounds(40,100,50,40);
		b8.setBounds(110,100,50,40);
		b9.setBounds(180,100,50,40);
		bDiv.setBounds(250,100,50,40);
		
		b4.setBounds(40,170,50,40);
		b5.setBounds(110,170,50,40);
		b6.setBounds(180,170,50,40);
		bMul.setBounds(250,170,50,40);
		
		b1.setBounds(40,240,50,40);
		b2.setBounds(110,240,50,40);
		b3.setBounds(180,240,50,40);
		bSub.setBounds(250,240,50,40);
		
		bDec.setBounds(40,310,50,40);
		b0.setBounds(110,310,50,40);
		bEq.setBounds(180,310,50,40);
		bAdd.setBounds(250,310,50,40);
		
		bMem.setBounds(40,380,80,40);
		bMemUse.setBounds(130,380,80,40);
		bClr.setBounds(220,380,80,40);
	// Addtext field and buttons to Jframe
		f.add(display);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bDiv);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bMul);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bSub);
		f.add(bDec);
		f.add(b0);
		f.add(bEq);
		f.add(bAdd);
		f.add(bMem);
		f.add(bMemUse);
		f.add(bClr);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(350,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bAdd.addActionListener(this);
		bDiv.addActionListener(this);
		bMul.addActionListener(this);
		bSub.addActionListener(this);
		bDec.addActionListener(this);
		bEq.addActionListener(this);
		bMem.addActionListener(this);
		bMemUse.addActionListener(this);
		bClr.addActionListener(this);
	}
	//Clear display
	public void clearDis() {
		display.setText("");
	}
	
	//Implement Actions upon button press
	public void actionPerformed(ActionEvent evt)
	{
	//Operands
		if(evt.getSource()==b1)
		{
			if(CheckButton.checkNum(display.getText())) clearDis();
			display.setText(display.getText().concat("1"));
		}
		
		if(evt.getSource()==b2)
		{
			if(CheckButton.checkNum(display.getText())) clearDis();
			display.setText(display.getText().concat("2"));
		}
		
		if(evt.getSource()==b3)
		{
			if(CheckButton.checkNum(display.getText())) clearDis();
			display.setText(display.getText().concat("3"));
		}
		
		if(evt.getSource()==b4)
		{
			if(CheckButton.checkNum(display.getText())) clearDis();
			display.setText(display.getText().concat("4"));
		}
		
		if(evt.getSource()==b5)
		{
			if(CheckButton.checkNum(display.getText())) clearDis();
			display.setText(display.getText().concat("5"));
		}
		
		if(evt.getSource()==b6)
		{
			if(CheckButton.checkNum(display.getText())) clearDis();
			display.setText(display.getText().concat("6"));
		}
		
		if(evt.getSource()==b7)
		{
			if(CheckButton.checkNum(display.getText())) clearDis();
			display.setText(display.getText().concat("7"));
		}
		
		if(evt.getSource()==b8)
		{
			if(CheckButton.checkNum(display.getText())) clearDis();
			display.setText(display.getText().concat("8"));
		}
		
		if(evt.getSource()==b9)
		{
			if(CheckButton.checkNum(display.getText())) clearDis();
			display.setText(display.getText().concat("9"));
		}
		
		if(evt.getSource()==b0)
		{
			if(CheckButton.checkNum(display.getText())) clearDis();
			display.setText(display.getText().concat("0"));
		}
		
		if(evt.getSource()==bDec)
		{
			if(!display.getText().contains("."))
			{
				if(CheckButton.checkNum(display.getText())) clearDis();
				display.setText(display.getText().concat("."));
			}
		}
	// Operators
		if(evt.getSource()==bAdd)
		{
			if(CheckButton.checkOper(display.getText()))
			{
				a=Double.parseDouble(display.getText());
				opType=1;
				clearDis();
			}
			else display.setText(ENTERNUM);
		} 
		
		if(evt.getSource()==bSub)
		{
			//Error check for attempting sub operation on display="-"
			try
			{
				if(display.getText().equals("")||Character.isLetter(display.getText().charAt(0)))//Check if used for negative operand 
				{
					clearDis();
					display.setText(display.getText().concat("-"));
				}
				else if(CheckButton.checkOper(display.getText()))//Check if used for subtract operation
				{
					a=Double.parseDouble(display.getText());
					opType=2;
					clearDis();
				}
				else display.setText(ENTERNUM);
			} 
			catch(NumberFormatException e)
			{
				display.setText(ENTERNUM);
				System.out.println(e.getMessage());	
			}
		}
		
		if(evt.getSource()==bMul)
		{
			if(CheckButton.checkOper(display.getText()))
			{
				a=Double.parseDouble(display.getText());
				opType=3;
				clearDis();
			}
			else display.setText(ENTERNUM);
		}
		
		if(evt.getSource()==bDiv)
		{
			if(CheckButton.checkOper(display.getText()))
			{
				a=Double.parseDouble(display.getText());
				opType=4;
				clearDis();
			}
			else display.setText(ENTERNUM);
		}
	// This switch does the logical operations
		if(evt.getSource()==bEq)
		{
			if(opType==4 && b==0) throw new MyDivideByZeroException("Tried to divide by Zero");
			try	
			{
				if(!display.getText().equals(""))
				{
					b=Double.parseDouble(display.getText());
				}
				switch(opType)
				{
					case 1: result=a+b;
						break;
			
					case 2: result=a-b;
						break;
			
					case 3: result=a*b;
						break;
			
					case 4: result=a/b;
						break;
			
					default: result=0;
				}
			
				display.setText(""+result);
			}
			catch(NumberFormatException e)
			{
				display.setText(ENTERNUM);
				System.out.println(e.getMessage());	
			}
		}
	// Clear all values	
		if(evt.getSource()==bClr) 
		{
			clearDis();
			a=0;
			b=0;
			result=0;
		}
	//	Store Value in text field in m
		if(evt.getSource()==bMem)
		{
			if(CheckButton.checkOper(display.getText()))
			{
				m=Double.parseDouble(display.getText());
			}
		}
	//  Use value in m
		if(evt.getSource()==bMemUse)
		{
			display.setText(display.getText().concat(m+""));		
		}
		
	}

}