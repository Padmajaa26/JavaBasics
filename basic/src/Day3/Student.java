package Day3;

public class Student {
	int sid;
	String sname;
	String city;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setSid();

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
	}
	
	
	

}
