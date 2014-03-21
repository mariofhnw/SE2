package binaryCounterGUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumbersPanel extends JPanel {
	public NumbersPanel() {
		Dimension size = getPreferredSize();
		size.height = 100;
		setPreferredSize(size);
		
		//Rahmen
		setBorder(BorderFactory.createTitledBorder("NumbersPanel"));
		
		
		JButton increment = new JButton("Increment");
		
		JLabel z1, z2;
		z1 = new JLabel("1 ");
		z2 = new JLabel("2 ");
		
		setLayout(new GridBagLayout());		
		GridBagConstraints gc = new GridBagConstraints();
	}
	
}
