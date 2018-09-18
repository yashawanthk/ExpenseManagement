package org.expense.managment.jpa.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="groups")
public class Groups {

	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO , generator="group_seq")
	    @SequenceGenerator(name="GROUP_ID", sequenceName="group_seq")
	    // @Column(name="GROUPID")
	    private String groupid;
	   // @Column(name="GROUPNAME")
	    private String groupname;
	    
	    
		public String getGroupid() {
			return groupid;
		}
		public void setGroupid(String groupid) {
			this.groupid = groupid;
		}
		public String getGroupname() {
			return groupname;
		}
		public void setGroupname(String groupname) {
			this.groupname = groupname;
		}
}
