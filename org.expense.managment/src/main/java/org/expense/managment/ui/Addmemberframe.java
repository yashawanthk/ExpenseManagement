package org.expense.managment.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.expense.managment.jpa.beans.Members;
import org.expense.managment.manager.CreateGroupManager;

public class Addmemberframe extends JPanel{
	private JTextField nametextField;
	private JTextField phonetextField;
	private JTextField emailidtextField;
	private JTextField memberfamilytextField;
	CreateGroupManager manager = new CreateGroupManager();
	public Addmemberframe() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{434, 0};
		gridBagLayout.rowHeights = new int[]{262, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Add Memder Details");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel label = new JLabel("Member Name");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.weightx = 0.2;
		gbc_label.insets = new Insets(0, 10, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 2;
		panel.add(label, gbc_label);
		
		nametextField = new JTextField();
		GridBagConstraints gbc_nametextField = new GridBagConstraints();
		gbc_nametextField.insets = new Insets(0, 0, 5, 5);
		gbc_nametextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nametextField.gridx = 1;
		gbc_nametextField.gridy = 2;
		panel.add(nametextField, gbc_nametextField);
		nametextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Phone #");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		phonetextField = new JTextField();
		GridBagConstraints gbc_phonetextField = new GridBagConstraints();
		gbc_phonetextField.insets = new Insets(0, 0, 5, 5);
		gbc_phonetextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_phonetextField.gridx = 1;
		gbc_phonetextField.gridy = 3;
		panel.add(phonetextField, gbc_phonetextField);
		phonetextField.setColumns(10);
		
		JLabel lblEmailId = new JLabel("Email ID");
		GridBagConstraints gbc_lblEmailId = new GridBagConstraints();
		gbc_lblEmailId.anchor = GridBagConstraints.EAST;
		gbc_lblEmailId.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailId.gridx = 0;
		gbc_lblEmailId.gridy = 4;
		panel.add(lblEmailId, gbc_lblEmailId);
		
		emailidtextField = new JTextField();
		GridBagConstraints gbc_emailidtextField = new GridBagConstraints();
		gbc_emailidtextField.insets = new Insets(0, 0, 5, 5);
		gbc_emailidtextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailidtextField.gridx = 1;
		gbc_emailidtextField.gridy = 4;
		panel.add(emailidtextField, gbc_emailidtextField);
		emailidtextField.setColumns(10);
		
		JLabel lblFamilyMembers = new JLabel("Family Members");
		GridBagConstraints gbc_lblFamilyMembers = new GridBagConstraints();
		gbc_lblFamilyMembers.anchor = GridBagConstraints.EAST;
		gbc_lblFamilyMembers.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyMembers.gridx = 0;
		gbc_lblFamilyMembers.gridy = 5;
		panel.add(lblFamilyMembers, gbc_lblFamilyMembers);
		
		memberfamilytextField = new JTextField();
		GridBagConstraints gbc_memberfamilytextField = new GridBagConstraints();
		gbc_memberfamilytextField.insets = new Insets(0, 0, 5, 5);
		gbc_memberfamilytextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_memberfamilytextField.gridx = 1;
		gbc_memberfamilytextField.gridy = 5;
		panel.add(memberfamilytextField, gbc_memberfamilytextField);
		memberfamilytextField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Members member = new Members();
				member.setEmailID(emailidtextField.getText());	
				member.setMemberName(nametextField.getText());
				member.setPhonenummber(phonetextField.getText());
				member.setMembercount(  Integer.parseInt(memberfamilytextField.getText())   );
				saveMember(member) ;
			}
		});
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 1;
		gbc_btnSubmit.gridy = 6;
		panel.add(btnSubmit, gbc_btnSubmit);
	}
	
	private void saveMember(Members member)
	{
		
		manager.saveMember(member);
		
	}

}
