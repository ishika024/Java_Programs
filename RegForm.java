/*
	CREATING A STUDENT INFORMATION FORM UING GUI WITH AWT(CONTROLS) FRAME 
*/

import java.awt.*;
public class RegForm 
{
	public static void main(String arg[])
	{
	    Frame f1 = new Frame();
		
		Label name = new Label ("Name: ");
		name.setBounds(50,50,200,50);
		f1.add(name);
		
		TextField tf = new TextField();
		tf.setBounds(250,50,200,50);
		f1.add(tf);
				
		
		Label gender = new Label ("Gender : ");
		gender.setBounds(50,150,200,50);
		f1.add(gender);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox male = new Checkbox("Male",cbg,false);
		Checkbox female = new Checkbox("Female",cbg,false);
		male.setBounds(350,150,400,50);
		female.setBounds(750,150,400,50);
		f1.add(male);
		f1.add(female);
		
		Label hobbie = new Label ("Hobbies : ");
		hobbie.setBounds(50,240,200,50);
		f1.add(hobbie);
		
		Checkbox cb = new Checkbox("Travel");
		cb.setBounds(350,240,200,50);
		Checkbox cb1 = new Checkbox("Reading");
		cb1.setBounds(550,240,200,50);
		Checkbox cb2 = new Checkbox("Photography");
		cb2.setBounds(750,240,200,50);
		Checkbox cb3 = new Checkbox("Gardening");
		cb3.setBounds(950,240,200,50);
		f1.add(cb);
		f1.add(cb1);
		f1.add(cb2);
		f1.add(cb3);
		
		Label choice = new Label ("Choice : ");
		choice.setBounds(50,340,200,50);
		f1.add(choice);
		
		Choice c = new Choice();
		c.add("B.Tech");
		c.add("BSC");
		c.add("BA");
		c.add("B.COM");
		c.add("BCA");
		c.add("M.Tech");
		c.add("MSC");
		c.add("MA");
		c.add("M.COM");
		c.add("MCA");
		c.setBounds(250,350,100,50);
		f1.add(c);
		
		Button b = new Button("Submit");
		b.setBounds(150,500,300,50);
		f1.add(b);
		
		f1.setTitle("My GUI Application");
		f1.setSize(500,300);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}