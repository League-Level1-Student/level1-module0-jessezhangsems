package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image
Component com;
com=createImage("https://i.kym-cdn.com/photos/images/original/001/316/888/f81.jpeg");
quizWindow.add(com);
quizWindow.pack();

String input=JOptionPane.showInputDialog("What animal is going to die in this photo?");
if(input.equals("The goldfish")) {
	System.out.println("CORRECT");
	JOptionPane.showMessageDialog(null, "Yes, that is correct");
}
else if(input.equals("the goldfish")) {
	System.out.println("CORRECT");
	JOptionPane.showMessageDialog(null, "Yes, that is correct");
}
else if(input.equals("goldfish")) {
	System.out.println("CORRECT");
	JOptionPane.showMessageDialog(null, "Yes, that is correct");
}
else if(input.equals("Goldfish")) {
	System.out.println("CORRECT");
	JOptionPane.showMessageDialog(null, "Yes, that is correct");
}
else if(input.equals("thy smol goldie")) {
	System.out.println("CORRECT");
	JOptionPane.showMessageDialog(null, "Yes, that is correct");
}

else if(input.equals("The woman")) {
	System.out.println("INCORRECT");
	JOptionPane.showMessageDialog(null, "Sorry, that is not correct");
}
else if(input.equals("the woman")) {
	System.out.println("INCORRECT");
	JOptionPane.showMessageDialog(null, "Sorry, that is not correct");
}
else if(input.equals("woman")) {
	System.out.println("INCORRECT");
	JOptionPane.showMessageDialog(null, "Sorry, that is not correct");
}
else{
	System.out.println("INCORRECT");
	JOptionPane.showMessageDialog(null, "Sorry, that is not correct");
}

Component comp;
comp=createImage("https://i.pinimg.com/originals/63/ac/10/63ac107caeebda2a798c90996564c4cf.png" );
quizWindow.add(comp);
quizWindow.pack();

String cactus=JOptionPane.showInputDialog("What is this child hugging?");
if(cactus.equals("a cactus")) {
	JOptionPane.showMessageDialog(null, "That is correct!");
}
else if(cactus.equals("A cactus")) {
	JOptionPane.showMessageDialog(null, "That is correct!");
}
else if(cactus.equals("A Cactus")) {
	JOptionPane.showMessageDialog(null, "That is correct!");
}
else if(cactus.equals("A cacti")) {
	JOptionPane.showMessageDialog(null, "That is correct!");
}
else if(cactus.equals("A Cacti")) {
	JOptionPane.showMessageDialog(null, "That is correct!");
}
else if(cactus.equals("a cacti")) {
	JOptionPane.showMessageDialog(null, "That is correct!");
}

else {
	JOptionPane.showMessageDialog(null, "That is not correct!");
}





		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window

		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
