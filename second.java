
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class second {
private JFrame frame;
private JPanel panel;
private JTextField [] text = new JTextField [4];

public second() {
	frame = new JFrame();
	
	frame.setVisible(true);
	frame.setSize(350, 350);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	text [0] = new JTextField(20);
	text [1] = new JTextField(20);
	text [2] = new JTextField(20);
	text [3] = new JTextField(20);
	
	panel = new JPanel();
	panel.setBackground(Color.blue);
	panel.setLayout(new GridLayout(2,2));
	panel.add(text [0]);
	panel.add(text [1]);
	panel.add(text [2]);
	panel.add(text [3]);

	panel.setVisible(true);
	
	frame.add(panel);
	
}

}
