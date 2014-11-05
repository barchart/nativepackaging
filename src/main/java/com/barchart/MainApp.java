package com.barchart;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends JFrame {

	private static final Logger log = LoggerFactory.getLogger(MainApp.class);

	public MainApp() {

		setTitle("Barchart Native Package");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainApp ex = new MainApp();
				ex.setVisible(true);
			}
		});
	}

}
