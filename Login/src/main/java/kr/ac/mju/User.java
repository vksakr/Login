package kr.ac.mju;

public class User {
	private String ID;
	private String name;
	private String Password;
	private String job;
	
	public User (String userID, String password, String names, String jobs) {
		this.ID = userID;
		this.Password = password;
		this.name = names;
		this.job = jobs;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}	
	
}

