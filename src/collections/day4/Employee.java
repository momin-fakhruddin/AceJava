package collections.day4;

public class Employee {
	String lname;

	public Employee(String lname, String fname) {
		super();
		this.lname = lname;
		this.fname = fname;
	}

	String fname;

	public String getLname() {
		return lname;
	}

	public String getFname() {
		return fname;
	}

	@Override
	public String toString() {
		return lname + "  " + fname + "\n";
	}
}
