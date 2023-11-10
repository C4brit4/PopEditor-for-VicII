package source;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PopEditor {

	public static JFrame loggingWindow = new JFrame();
	public static JPanel loggingPanel = new JPanel();
	
	public static JTextField filePathField = new JTextField();
	public static JButton browseButton = new JButton();
	public static JButton startButton = new JButton();
	
	public static MainUI mainUI = new MainUI(); 
	
	static int windowWidth = 400;
	static int windowHeight = 150;

	public static void main(String[] args) {

		setUpLogging();
		
	}

	
	////////
	//Probably translated to other file in the future
	public static void setUpLogging(){

		//Window Properties
		loggingWindow.setVisible(true);
		loggingWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loggingWindow.setSize(new Dimension(windowWidth, windowHeight));
		loggingWindow.setResizable(false);
		loggingWindow.setTitle("POP EDITOR");
		
		//Panel Set up
		loggingPanel.setLayout(null);
		loggingWindow.add(loggingPanel);
		
		setLoggingUI();
	}
	
	private static void setLoggingUI() {
		int fieldX = 50, fieldY = 30, fieldWidth = 200, fieldHeigth = 20; //Field's transform
	
		//Path Field
		filePathField.setBounds(fieldX, fieldY, fieldWidth, fieldHeigth);
		loggingPanel.add(filePathField);
		
		//Browse Button
		setUpBrowseButton();
		
		//Start Button
		setUpStartButton();
		
	}
	
	//Browse Button Setting Up
	private static void setUpBrowseButton() {
		int browseButtonX = 265, browseButtonY = 30, browseButtonWidth = 80, browseButtonHeigth = 20; //Browse Button transform
		
		browseButton.setText("Browse");
		browseButton.setBounds(browseButtonX, browseButtonY, browseButtonWidth, browseButtonHeigth);
		loggingPanel.add(browseButton);		
	}
	
	private static void setUpStartButton() {
		int startButtonX = 50, startButtonY = 70, startButtonWidth = 80, startButtonHeigth = 20; //Start Button transform
		
		startButton.setText("Start");
		startButton.setBounds(startButtonX, startButtonY, startButtonWidth, startButtonHeigth);
		loggingPanel.add(startButton);
		
		startButton.addActionListener(e ->{
			mainUI.setUpWindow();
			loggingWindow.dispose();
		});
	}
	/////////
	
	
}
