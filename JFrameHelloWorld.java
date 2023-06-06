import javax.swing.*;
class JframeHelloWorld
{
	private static void createAndShowGUI()
	{
	JFrame frame =new JFrame("HelloWorld");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(100,100,200,100);
	JLabel label=new JLabel("Hello World");
	frame.getContentPane().add(label);
	frame.setVisible(true);
	}
	public static void main(String[] args)
	{
	javax.swing.SwingUtilities.invokeLater(new Runnable());
	{
	public void run()
	{
	createAndShowGUI();
	}
	};
	}
}