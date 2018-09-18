package org.expense.managment.jpa.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="memberexpense")
public class addExpenseBean {

	/* @Id
	 @GeneratedValue(strategy=GenerationType.AUTO , generator="member_id_seq")
     @SequenceGenerator(name="member_ID", sequenceName="member_id_seq")
	 @Column(name="MEMBERID")*/
	
	/**
	 * GROUPID                 VARCHAR2(20)  
	   MEMBERID                VARCHAR2(20)  
	   EXPENSEID               VARCHAR2(20)  
       EXPENCEDESCRIPTION      VARCHAR2(200) 
       AMOUNT                  NUMBER(16,5)  
       SPLITTYPE               VARCHAR2(10)  
	 * 
	 */
	
	@Column(name="groupID")
	private String groupID;
	
	
	@Column(name="expencedescription")
	private String expensediscription;
	
	@Column(name="amount")
	private double amount;
	
	
	@Column(name="expencedescription")
	private int splittype ;
	
	private List<MemberShareDetails> membersshare = new ArrayList<MemberShareDetails>();
	
	
	@Column(name="expencedescription")
	private List<Members> members = new ArrayList<Members>();
	
	public String getExpensediscription() {
		return expensediscription;
	}

	public void setExpensediscription(String expensediscription) {
		this.expensediscription = expensediscription;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	public List<Members> getMembers() {
		return members;
	}

	public void setMembers(List<Members> members) {
		this.members = members;
	}
	
	public void addMember( Members  member)
	{
		this.members.add(member);
	}
	
	
	
	private void calculateShare()
	{
		
		double share = 0;
		if (splittype == 0 )
		{
			int membercount = getMembers().size();
			share = getAmount()/membercount;
			
		}else
		{
			Iterator<Members> iterator = getMembers().iterator();
			int familycount = 0;
			for (Members members2 : members) {
				
				familycount=familycount+members2.getMembercount();
			}
			share = getAmount()/familycount; 
		}
		
		
		Iterator<Members> iterator = getMembers().iterator();
		MemberShareDetails  membershare = null;
		for (Members members2 : members) {
			
			membershare = new MemberShareDetails();
			membershare.setAmount(share);
			membershare.setMemberID(members2.getMemberID());
			membershare.setDescription(getExpensediscription());
		}
	}
			
	
}
