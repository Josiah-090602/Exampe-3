package main;

import java.awt.*;
import java.awt.event.*;

public class WindowEventDemo extends Frame{
	
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;

	public WindowEventDemo() {
		
		setLayout(new FlowLayout());
		
		add (new Label("Counter"));
		
	
		tfCount= new TextField ("0", 10);
		tfCount.setEditable(false);
		add (tfCount);
		
		btnCount = new Button("Count");
		add (btnCount);
		
		btnCount.addActionListener(new BtnCountListener());
		
		addWindowListener(new MyWindowListener());
		
		setTitle("WindowEvent Demo");
		setSize(300, 100);
		setVisible(true);	
	}

	public static void main(String[] args) {
		new WindowEventDemo();
	}
	private class BtnCountListener implements ActionListener{
		
		public void actionPerformed(ActionEvent evt) {
			++count;
			
			tfCount.setText(count + "");
		}

}
	private class MyWindowListener implements WindowListener{
		
		public void windowClosing(WindowEvent evt) {
		System.exit(0);
		}
		@Override
		public void windowOpened(WindowEvent e) {
		}
		@Override
		public void windowClosed(WindowEvent e) {
		}
		@Override
		public void windowIconified(WindowEvent e) {
		}
		public void windowDeiconified(WindowEvent e) {
		}
		@Override
		public void windowActivated(WindowEvent e) {	
		}
		@Override
		public void windowDeactivated(WindowEvent e) {	
		}
}
}