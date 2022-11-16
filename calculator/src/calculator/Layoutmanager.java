package calculator;

import javax.swing.*;
import java.awt.*;

public class Layoutmanager extends JFrame {
	public Layoutmanager() {
		setTitle("sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Layoutmanager();

	}

}
