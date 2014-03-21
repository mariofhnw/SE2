package binaryCounterGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class BinaryCounterGUI extends JFrame{ 	//Klasse erstellen, erbt von JFrame J=Swing!!
	
	private NumbersPanel numbersPanel;
	
	public BinaryCounterGUI(){
		//JFrame Spezifikationen (Fenster zum Füllen mit Komponenten)
		super("Binary Counter");	//Titel setzen. super = JFrame-Konstruktor aufrufen
		setBounds(600, 300, 600, 200); //Groesse definieren. Die ersten 2 Werten = Positionierung im Bildschirm
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Beim Schliessen des Fensters Programm Beenden
		setVisible(true);	//Fenster Sichtbar machen
		
		//set layout manager
		setLayout(new BorderLayout()); //siehe zum Auswählen: http://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
		
		//create Swing component
		numbersPanel = new NumbersPanel();
		JButton increment = new JButton("Increment");
		
		
		//Add Swing components to content pane
		Container c = getContentPane();
		c.add(numbersPanel, BorderLayout.NORTH);
		c.add(increment, BorderLayout.EAST);
		
	}
	public static void main(String [] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				BinaryCounterGUI b = new BinaryCounterGUI();
			}
		});
	}
}
