package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 *  6.Generate a random number between 0 and 4:

   int rand = new Random().nextInt(5);


7. Depending on which random number, show one of the five fortunes.


league-logo
 */
public class Fortune_Cookie implements ActionListener {
public void showButton(){
	System.out.println("Button Clicked");
	JFrame frame=new JFrame();
	frame.setVisible(true);
	JButton button=new JButton();
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Woo hoo!");
	int rand=new Random().nextInt(5);
	if (rand==0) {
		JOptionPane.showMessageDialog(null, "If winter comes, can spring be much far behind?");
	}
	if (rand==1) {
		JOptionPane.showMessageDialog(null, "You will travel to many exotic places in your lifetime.");
	}
	if(rand==2) {
		JOptionPane.showMessageDialog(null, "You can make your own happiness.");
	}
	if(rand==3) {
		JOptionPane.showMessageDialog(null, "Your ability of accomplishment will follow with success.");
	}
	if(rand==4) {
		JOptionPane.showMessageDialog(null, "Fortune favors the brave");
	}
	
}
}
