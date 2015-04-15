package kr.ac.mju;

public class gwamok {
	private String name;
	private String people;
	private String instructor;
	
	public gwamok (String gwamokName, String gwamokPeople, String gwamokInstructor) {
		this.name = gwamokName;
		this.people = gwamokPeople;
		this.instructor = gwamokInstructor;
	}
	
	public gwamok() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	

	
}

