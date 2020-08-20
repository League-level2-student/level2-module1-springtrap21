package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI witchaseh two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton addName = new JButton("add name");
	JButton viewNames = new JButton("view Names");
	public void GUI() {
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	public static void main(String[] args) {
		new GuestBook().GUI();
	}
	ArrayList<String> names = new ArrayList<String>();
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == addName) {
			String name = JOptionPane.showInputDialog("Enter a Name:");
			names.add(name);
		}
		if (arg0.getSource() == viewNames) {
			
			for (int i = 0; i < names.size(); i++) {
				names.get(i);
				System.out.println(names.get(i));
			}
		}
	}
}
