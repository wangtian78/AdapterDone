package _todoInSection;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
public class StudentTable extends JFrame {

	/**
	 * Set the GUI to be visible
	 * 
	 * @param args
	 *            unused
	 */
	public static void main(String args[]) {
		new StudentTable().setVisible(true);
	}

	// Need a TableModel to set as the model for a JTabel
	private TableModel model = null;

	// Like DefaultListModel and JList, now we have
	// a class that implements TableModel so this JTable
	// can display rows and columns of data in a graphical manner
	private JTable table = null;

	/**
	 * The constructor for a StudentTable. Sets up the GUI and the JTable
	 */
	public StudentTable() {
		// set up the JFrame
		setTitle("Sort Table Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 300);
		setLocation(30, 30);

		// TODO: 2) Need a new StudentCollection.

		// TODO: 3) Initialize model as a TableModel that adapts the
		// StudentCollection from above.

		// TODO: 4) Initialize the table with our model instance from above.

		// TODO: 5) Initialize the JScrollPane below, then decorate table with a
		// JScrollPane so that if the data exceeds the side of the table in the
		// GUI, then it automatically becomes scrollable.
		JScrollPane scrollPane = null;

		// TODO: 6) Construct a new RowSorter<TableModel> to be a TableRowSorter
		// while setting its model to model

		// TODO: 7) link up table and the sorter

		// Layout the GUI
		add(scrollPane, BorderLayout.CENTER);
		JButton button = new JButton("Select Highlighted Row");
		JPanel panel = new JPanel();
		panel.setMaximumSize(new Dimension(30, 30));
		panel.add(button);
		add(panel, BorderLayout.WEST);

		// Listen to the button click
		button.addActionListener(new ButtonListener());
	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO: 8) Show the name of the student on the currently selected
			// row need table's getSelectedRow and convertRowIndexToModel as
			// well as model's getValueAt(rowIndex, columnIndex). See the API
			// for details.
			System.out.println("Print the student's name");
		}
	}
}