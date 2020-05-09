import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="cuberoot" width=500 height=500>
</applet>
*/
public class cuberoot extends JApplet 
{	JTextField jt;
	JButton b;
	JLabel jb,jb1,jb2;
	public void init()
	{
	try
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				makeGUI();
			}
		});
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
public void makeGUI()
{
	setLayout(new FlowLayout());
	
	

	jb=new JLabel("Enter a Cube  number:");	//for first label
	Font d=new Font("Algerian",Font.BOLD,25);
	jb.setFont(d);


	jt=new JTextField(15);			//for text field
	Font f=new Font("ARIAL",Font.BOLD,25);
	jt.setFont(f);
	
	b=new JButton("RESULT");			// button
	
	
	jb2=new JLabel(" ");			//for second label
	Font e=new Font("Algerian",Font.BOLD,25);
	jb2.setFont(e);
	
	jb1=new JLabel(" ");			//label for result
	Font g=new Font("Arial",Font.BOLD,25);
	jb1.setFont(g);
	
	
	add(jb);
	add(jt);
	add(b);
	add(jb2);
	add(jb1);
	
	b.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			int n=Integer.parseInt(jt.getText());
			double value=Math.cbrt(n);
			jb2.setText("THE CUBEROOT OF GIVEN NO. IS:  ");
			jb1.setText(value + " ");
			
			
		}

	});
}
}
