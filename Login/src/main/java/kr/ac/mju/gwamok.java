package kr.ac.mju;

public class gwamok {
	private String gcno;
	private String gcname;
	private String gyear;
	private String gclass;
	private String gnum;
	private String gscore;
	private String ginst;
	
	public gwamok(String gcno,String gcname, String gyear,String gclass,String gnum,String gscore,String ginst){
		this.gcno = gcno;
		this.gcname = gcname;
		this.gyear = gyear;
		this.gclass = gclass;
		this.gnum = gnum;
		this.gscore = gscore;
		this.ginst = ginst;
	}

	
	public gwamok(){}
	
	
	
	
	public String getgcno() {
		return gcno;
	}
	public void setGcno(String gcno) {
		this.gcno = gcno;
	}
	public String getGcname() {
		return gcname;
	}
	public void setGcname(String gcname) {
		this.gcname = gcname;
	}
	public String getGyear() {
		return gyear;
	}
	public void setGyear(String gyear) {
		this.gyear = gyear;
	}
	public String getGclass() {
		return gclass;
	}
	public void setGclass(String gclass) {
		this.gclass = gclass;
	}
	public String getGnum() {
		return gnum;
	}
	public void setGnum(String gnum) {
		this.gnum = gnum;
	}
	public String getGscore() {
		return gscore;
	}
	public void setGscore(String gscore) {
		this.gscore = gscore;
	}
	public String getGinst() {
		return ginst;
	}
	public void setGinst(String ginst) {
		this.ginst = ginst;
	}
	

	

	
}

