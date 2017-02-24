import javax.swing.*;
import java.awt.event.*;
public class SimpleGuilB implements ActionListener{
	JButton button;
	JFrame frame;
	public static void main(String[] args){
		SimpleGuilB gui= new SimpleGuilB();
		gui.go();
	}
	public void go(){
		frame = new JFrame();
		button = new JButton("click me");
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event){
		button.setText("I've been clicked!");
	}

}
