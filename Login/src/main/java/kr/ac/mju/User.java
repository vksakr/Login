package kr.ac.mju;

public class User {
	private String ID;
	private String name;
	private String Password;
	
	public User (String userID, String password, String names) {
		this.ID = userID;
		this.Password = password;
		this.name = names;
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

	
}

