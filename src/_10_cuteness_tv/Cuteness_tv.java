package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv implements ActionListener {
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
duckbutton.addActionListener(this);
frogbutton.addActionListener(this);
unicornbutton.addActionListener(this);
panel.add(duckbutton);
panel.add(frogbutton);
panel.add(unicornbutton);
frame.add(panel);
frame.pack();
}
void playVideo(String videoID) {
    
    // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
    //work on some Linux implementations
    try {
    if (System.getProperty("os.name").toLowerCase().contains("linux")) {
    if (Runtime.getRuntime().exec(new String[] {
     "which", "xdg- open" }).getInputStream().read() != -1) {
    Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
    }
    } else {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    }      } catch (Exception e) {
         e.printStackTrace();
    }
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==duckbutton) {
		showDucks();
	}
	if (e.getSource()==frogbutton) {
		showFrog();
	}
	if (e.getSource()==unicornbutton) {
		showFluffyUnicorns();
	}
	// TODO Auto-generated method stub
	
}
}

