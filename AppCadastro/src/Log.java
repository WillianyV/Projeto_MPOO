import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Log extends JFrame{
	private JTextArea areaText;
	JScrollPane scroll;
	private String log = new String("  ");
	
	
	public  Log() {
		super("Log");
		setSize(200, 170);		
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		areaText =  new JTextArea(log, 5, 10);
		areaText.setEditable(false);
		
		scroll = new JScrollPane(areaText, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
}
