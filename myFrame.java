import java.awt.*;
import javax.swing.*;

public class myFrame{

	public static void main(String args[]){
		// creating objects
		JFrame frame = new JFrame("My first Frame");
		JLabel label = new JLabel();
		JPanel panel = new JPanel();
		JLabel label2 = new JLabel("SIGN IN:");
		JPasswordField passWord = new JPasswordField("Password: ");
		JTextField userName = new JTextField("Username: ");
		JTextField anotherAccount = new JTextField("Forgot Pass?");
		JButton button = new JButton("Login");
		JTextArea area = new JTextArea();

		// area background
		label2.setBounds(125,30,150,150);
		area.setBounds(75,75,150,150);
		area.setBackground(Color.gray);

		// username/password box
		userName.setBounds(100, 120, 100, 20);
		passWord.setBounds(100, 140, 100, 20);
		anotherAccount.setBounds(100, 180, 100, 20);
		
		// setting button size
		button.setBounds(100, 160, 100, 20);
		button.setBackground(Color.black);
		
		// adding button function
		frame.getContentPane().add(button);
		frame.getContentPane().add(userName);
		frame.getContentPane().add(anotherAccount);
		frame.getContentPane().add(passWord);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(label, BorderLayout.CENTER);

		// setting frame 
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(area);
		
		System.out.println("Printing GUI");
	}
}