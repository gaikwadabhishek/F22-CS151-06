package gui.demo;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ButtonCounter extends JFrame implements ActionListener{

	Button b1;
	int count = 0;
	JLabel label;
	ButtonCounter() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		b1 = new Button("CLICK");
		b1.addActionListener(this);
		b1.setBounds(200, 100, 100, 50);
		
		label = new JLabel();
		label.setText("count: " + count);
		label.setBounds(200,0,500,30);
		this.add(b1);
		this.add(label);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonCounter();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			count++;
			label.setText("count: " + count);
		}
	}
}
