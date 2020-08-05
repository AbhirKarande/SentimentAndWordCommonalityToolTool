package main.java.com.nlp.app;

import javax.swing.JFrame;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import java.io.RandomAccessFile;
public class MainClass extends JFrame {
	private JPanel panel;
	private JLabel label;
	private JTextField text;
	private JButton SubmitButton;
	
	public MainClass() {
		super("Welcome");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		add(panel);
		
		label = new JLabel("Please insert the .txt you want to be analyzed");
		panel.add(label);
		
		text = new JTextField(20);
		panel.add(text);
		SubmitButton = new JButton("Analyze");
		panel.add(SubmitButton);
		SubmitButton.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				String ReceivedPath = text.getText();
				System.out.println(ReceivedPath);
			}
		});
		
		setVisible(true);
	}
}
