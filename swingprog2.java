import javax.swing.*;
public class swing2
{
	JFrame f;
	swing2()
	{
		f=new JFrame();
		JButton b=new JButton("click");
		b.setBounds(130,140,100,50);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new swing2();
	}
}
