package source;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainUI {

	public static JFrame mainWindow = new JFrame();
	public static JPanel mainPanel = new JPanel();
	
	static int windowWidth = 500;
	static int windowHeight = 650;	
	
	public void setUpWindow(){
		
		//Window Properties
		mainWindow.setVisible(true);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setSize(new Dimension(windowWidth, windowHeight));
		mainWindow.setResizable(false);
		mainWindow.setTitle("POP EDITOR");
		
		//Panel Set up
		mainPanel.setLayout(null);
		mainWindow.add(mainPanel);
		
		setUI();		
	}
	
	public void setUI() {
		
		
	}
	
}
