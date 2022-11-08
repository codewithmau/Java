package com.homework;

public class Department {

	private int id;
	private String deptname;
	private String description;
	private String hodname;
	
	public Department(int id, String deptname, String description, String hodname) {
		super();
		this.id = id;
		this.deptname = deptname;
		this.description = description;
		this.hodname = hodname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHodname() {
		return hodname;
	}
	public void setHodname(String hodname) {
		this.hodname = hodname;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptname=" + deptname + ", description=" + description + ", hodname="
				+ hodname + "]";
	}
	
	
}
