package org.expense.managment.ui;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.expense.managment.jpa.beans.Groups;
import org.expense.managment.jpa.beans.Members;
import org.expense.managment.manager.CreateGroupManager;

public class Mainframe extends JFrame{
	
	private JTextField textField;
	JComboBox groupcomboBox = null;
	
	CreateGroupManager manager = new CreateGroupManager();
	private JTextField nametextField;
	private JTextField phonetextField;
	private JTextField emailidtextField;
	private JTextField memberfamilytextField;
	public Mainframe() {
		
		
		setTitle("Trip Expense Management");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{73, 411, 0};
		gridBagLayout.rowHeights = new int[]{37, 188, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel main_panel = new JPanel();
		main_panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		main_panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_main_panel = new GridBagConstraints();
		gbc_main_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_panel.gridx = 1;
		gbc_main_panel.gridy = 1;
		getContentPane().add(main_panel, gbc_main_panel);
		GridBagLayout gbl_main_panel = new GridBagLayout();
		gbl_main_panel.columnWidths = new int[]{140, 0, 0, 0};
		gbl_main_panel.rowHeights = new int[]{24, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_main_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0};
		gbl_main_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		main_panel.setLayout(gbl_main_panel);
		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{130, 0};
		gbl_panel.rowHeights = new int[]{14, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		main_panel.add(panel, gbc_panel);
		
		JLabel label = new JLabel("Trip Expense Management ");
		label.setBorder(null);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 3;
		gbc_label.fill = GridBagConstraints.VERTICAL;
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 4;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 6;
		main_panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 4.9E-324, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label_1 = new JLabel("Add Memder Details");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.weightx = 1.0;
		gbc_label_1.gridwidth = 4;
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		panel_1.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("Member Name");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.weightx = 0.2;
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 10, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 2;
		panel_1.add(label_2, gbc_label_2);
		
		nametextField = new JTextField();
		nametextField.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		panel_1.add(nametextField, gbc_textField_1);
		
		JLabel label_3 = new JLabel("Phone #");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 3;
		panel_1.add(label_3, gbc_label_3);
		
		phonetextField = new JTextField();
		phonetextField.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		panel_1.add(phonetextField, gbc_textField_2);
		
		JLabel label_4 = new JLabel("Email ID");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 4;
		panel_1.add(label_4, gbc_label_4);
		
		emailidtextField = new JTextField();
		emailidtextField.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		panel_1.add(emailidtextField, gbc_textField_3);
		
		JLabel label_5 = new JLabel("Family Members");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 5;
		panel_1.add(label_5, gbc_label_5);
		
		memberfamilytextField = new JTextField();
		memberfamilytextField.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 5;
		panel_1.add(memberfamilytextField, gbc_textField_4);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 6;
		panel_1.add(btnSubmit, gbc_button);
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Members member = new Members();
				member.setEmailID(emailidtextField.getText());	
				member.setMemberName(nametextField.getText());
				member.setPhonenummber(phonetextField.getText());
				member.setMembercount(  Integer.parseInt(memberfamilytextField.getText())   );
				saveMember(member) ;
				emailidtextField.setText("");
				nametextField.setText("");
				phonetextField.setText("");
				memberfamilytextField.setText("");
			}
		});
		
		JLabel add_group_lbl = new JLabel("Add Group");
		add_group_lbl.setBorder(null);
		GridBagConstraints gbc_add_group_lbl = new GridBagConstraints();
		gbc_add_group_lbl.insets = new Insets(0, 0, 5, 5);
		gbc_add_group_lbl.gridwidth = 3;
		gbc_add_group_lbl.gridx = 0;
		gbc_add_group_lbl.gridy = 1;
		main_panel.add(add_group_lbl, gbc_add_group_lbl);
		
		JPanel main_content_panel = new JPanel();
		main_content_panel.setBorder(null);
		GridBagConstraints gbc_main_content_panel = new GridBagConstraints();
		gbc_main_content_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_main_content_panel.gridwidth = 4;
		gbc_main_content_panel.insets = new Insets(7, 0, 5, 5);
		gbc_main_content_panel.gridx = 0;
		gbc_main_content_panel.gridy = 3;
		main_panel.add(main_content_panel, gbc_main_content_panel);
		GridBagLayout gbl_main_content_panel = new GridBagLayout();
		gbl_main_content_panel.columnWidths = new int[]{59, 86, 0};
		gbl_main_content_panel.rowHeights = new int[]{20, 0};
		gbl_main_content_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_main_content_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		main_content_panel.setLayout(gbl_main_content_panel);
		
		JLabel lblNewLabel = new JLabel("Group Name");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		main_content_panel.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		main_content_panel.add(textField, gbc_textField);
		textField.setColumns(30);
		
		JButton btnCreagte = new JButton("Create");
		btnCreagte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				saveGroup(textField.getText());
				textField.setText("");
				
				
			}
		});
		GridBagConstraints gbc_btnCreagte = new GridBagConstraints();
		gbc_btnCreagte.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreagte.gridx = 1;
		gbc_btnCreagte.gridy = 4;
		main_panel.add(btnCreagte, gbc_btnCreagte);
		
		JLabel lblNewLabel_2 = new JLabel("select Group");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 5;
		main_panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		groupcomboBox = new JComboBox();
		groupcomboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				System.out.println(groupcomboBox.getSelectedItem());
				getGroupDetails((String)groupcomboBox.getSelectedItem());
			}
		});
		GridBagConstraints gbc_groupcomboBox = new GridBagConstraints();
		gbc_groupcomboBox.gridwidth = 4;
		gbc_groupcomboBox.anchor = GridBagConstraints.NORTH;
		gbc_groupcomboBox.insets = new Insets(0, 0, 5, 0);
		gbc_groupcomboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_groupcomboBox.gridx = 1;
		gbc_groupcomboBox.gridy = 5;
		main_panel.add(groupcomboBox, gbc_groupcomboBox);
		
		loadGroupCombo(groupcomboBox);
		
		setSize(543, 382);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		/*JFrame frame = new JFrame("My First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       JButton button = new JButton("Press");
	       frame.getContentPane().add(button); // Adds Button to content pane of frame
	       frame.setVisible(true);*/
	}
	
	private void loadGroupCombo(JComboBox groupcomboBox)
	{
		List<Groups> groups = manager .loadgroup();
		 for (Groups todo : groups) {
	            System.out.println(todo.getGroupid() + "    "  + todo.getGroupname());
	            groupcomboBox.addItem(todo.getGroupname());
	            
	        }
		
	}
	private void loadGrouptoCombo(Groups groups)
	{
		
	            groupcomboBox.addItem(groups.getGroupname());
	}
	
	private void getGroupDetails(String groupname)
	{
		
		List<Groups> groups = manager .loadgroup();
		Groups selectedgroup = null;
		for (Groups todo : groups) {
           
            if (todo.getGroupname().equalsIgnoreCase(groupname))
            {
            	selectedgroup = todo;
            	break;
            }
            
        }
		
		 System.out.println(selectedgroup.getGroupid() + "    "  + selectedgroup.getGroupname());
	}
	
	private void saveGroup(String groupname)
	{
		
		Groups grp = new Groups();
		grp.setGroupname(groupname);
		grp = manager.saveGroup(grp);
		loadGrouptoCombo(grp);
		
	}
	private void saveMember(Members member)
	{
		
		manager.saveMember(member);
		
	}
	
	public static void main(String[] args) {
		
		Mainframe frame = new Mainframe();
	}

}
