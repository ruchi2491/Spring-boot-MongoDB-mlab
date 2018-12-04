/**
 * 
 */
package io.atmecs.springbootstarter.mongodb.status;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ruchira.more
 *
 */
//mongodb://<dbuser>:<dbpassword>@ds145951.mlab.com:45951/dailystatusdb

@Document (collection="dailystatuses")
public class Status {
	@Id
	private String id;
	private String empid;
	private String date;
	private String project_name;
	private String today_status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProject_Name() {
		return project_name;
	}
	public void setProject_Name(String project_Name) {
		project_name = project_Name;
	}
	public String getToday_Status() {
		return today_status;
	}
	public void setToday_Status(String today_Status) {
		today_status = today_Status;
	}
	public Status(String id, String empid, String date, String project_Name, String today_Status) {
		super();
		this.id = id;
		this.empid = empid;
		this.date = date;
		project_name = project_Name;
		today_status = today_Status;
	}
	public Status() {
		super();
	}
	@Override
	public String toString() {
		return "Status [id=" + id + ", empid=" + empid + ", date=" + date + ", Project_Name=" + project_name
				+ ", Today_Status=" + today_status + "]";
	}

	
}	
