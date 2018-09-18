package org.expense.managment.manager;

import java.util.List;

import org.expense.managment.jpa.beans.GroupMaster;
import org.expense.managment.jpa.beans.Groups;
import org.expense.managment.jpa.beans.Members;

public class CreateGroupManager {

	private GroupMaster groupmanager ;
	
	public void createGroupManager()
	{
		groupmanager = new GroupMaster();
	}
	
	
	public CreateGroupManager() {
	}
	
	private GroupMaster getGroupMaster()
	{
		if (this.groupmanager == null)
		{
			createGroupManager();
		}
		return this.groupmanager;
	}
	
	
	public Groups saveGroup(Groups emp)
	{
		
		return getGroupMaster().createGroup(emp);
		
	}
	
	public List<Groups> loadgroup()
	{
		
		return getGroupMaster().loadgroup();
	}
	
	public void saveMember(Members member)
	{
		getGroupMaster().createmember(member);
	}
}
