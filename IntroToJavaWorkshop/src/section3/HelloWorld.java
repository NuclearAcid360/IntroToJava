package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello World");
		String name=JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null, "Nice to meet you "+name);
	}

}
