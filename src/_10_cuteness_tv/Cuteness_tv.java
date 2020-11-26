package _10_cuteness_tv;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JButton duckbutton=new JButton();
JButton frogbutton=new JButton();
JButton unicornbutton=new JButton();

public void ShowButton() {
frame.setVisible(true);
duckbutton.setText("Duck Song");
frogbutton.setText("Cute Desert Frog Video");
unicornbutton.setText("Fluffy Unicorns on Rainbows Vid");

}
}

