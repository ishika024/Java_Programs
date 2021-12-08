/*
	IMPLEMENT CALULATOR USING FRAME 
*/
import java.awt.*;
import java.awt.event.*;

public class Calculator_Frame extends Frame implements ActionListener
{
	Button add,sub,mul,div;
	Label l1, l2, l3, l_res;
	TextField tf_num1, tf_num2;
	public Calculator_Frame()
	{
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		
		tf_num1 = new TextField();
		tf_num2 = new TextField();
		
		// ADD EVENT LISTENER FOR OPERATIONS(addition, subtraction, multiplication, division)
		add.addActionListener(this);  
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		l1 = new Label("Number 1");
		l2 = new Label("Number 2");
		l3 = new Label("Result");
		l_res = new Label();
		
		
		setLayout(new GridLayout(2,1));  
		/* 	LAYS OUT COMPONENTS IN A TWO DIMNENSIONAL GRID.
			CONSTRUCTORS:
						GridLayout();
						GridLayout(int numRows, int numClolumns);
						GridLayout(int numRows, int numClolumns, int horz, int vert);
		*/
		Panel p1 = new Panel(new GridLayout(2,2));
		p1.add(add);
		p1.add(sub);
		p1.add(mul);
		p1.add(div);
		
		Panel p2 = new Panel(new GridLayout(3,2));
		p2.add(l1);
		p2.add(tf_num1);
		p2.add(l2);
		p2.add(tf_num2);
		p2.add(l3);
		p2.add(l_res);
		
		add(p2);
		add(p1);
		
		setVisible(true);
		setSize(400,400);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == add)
		{
			double num1 = Double.parseDouble(tf_num1.getText());
			double num2 = Double.parseDouble(tf_num2.getText());
			double result = num1 + num2;
			l_res.setText(Double.toString(result));	
		}
		if(e.getSource() == sub)
		{
			double num1 = Double.parseDouble(tf_num1.getText());
			double num2 = Double.parseDouble(tf_num2.getText());
			double result = num1 - num2;
			l_res.setText(Double.toString(result));	
		}
		if(e.getSource() == mul)
		{
			double num1 = Double.parseDouble(tf_num1.getText());
			double num2 = Double.parseDouble(tf_num2.getText());
			double result = num1 * num2;
			l_res.setText(Double.toString(result));	
		}
		if(e.getSource() == div)
		{
			double num1 = Double.parseDouble(tf_num1.getText());
			double num2 = Double.parseDouble(tf_num2.getText());
			double result = num1 / num2;
			l_res.setText(Double.toString(result));	
		}
		
	}
	public static void main (String arg[])
	{
		Calculator_Frame c = new Calculator_Frame();
	}
}