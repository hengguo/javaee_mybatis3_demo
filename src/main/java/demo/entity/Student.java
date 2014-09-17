package demo.entity;

public class Student {
	private String id;
	private String name;
	private String gender;
	private String major;
	private String grade;
	private Teacher supervisor; //指导教师
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Teacher getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Teacher supervisor) {
		this.supervisor = supervisor;
	}
	
}
