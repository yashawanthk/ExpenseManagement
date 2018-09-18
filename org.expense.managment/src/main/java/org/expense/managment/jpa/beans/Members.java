package org.expense.managment.jpa.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="members")
public class Members {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO , generator="member_id_seq")
     @SequenceGenerator(name="member_ID", sequenceName="member_id_seq")
	 @Column(name="MEMBERID")
	private String memberID;
	
	 @Column(name="MEMBERNAME")
	private String memberName;
	
	 @Column(name="PHONE")
	private String phonenummber;
	
	 @Column(name="EMAILID")
	private String emailID;
	
	 @Column(name="MEMBERFAMILYCOUNT")
	private int membercount ;

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPhonenummber() {
		return phonenummber;
	}

	public void setPhonenummber(String phonenummber) {
		this.phonenummber = phonenummber;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getMembercount() {
		return membercount;
	}

	public void setMembercount(int membercount) {
		this.membercount = membercount;
	}
}
