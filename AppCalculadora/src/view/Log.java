package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Log extends JFrame{
	private static String log;
	private static JTextArea area;
	
	public Log(){
		super("Log");
		setSize(200,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLayout(new FlowLayout());
		setResizable(false);
		
		area = new JTextArea(log,10,15);
		JScrollPane scrooll = new JScrollPane(area);
		 scrooll.setVerticalScrollBarPolicy(
                 JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		add(scrooll);
		
		setVisible(true);
	}

	public static String getLog() {
		return log;
	}

	public static void setLog(String log) {
		Log.log = log;
	}

	public static JTextArea getArea() {
		return area;
	}
	
	
	
	
}
