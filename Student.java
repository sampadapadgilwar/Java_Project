package School;

public class Student {

	int id;
	String name;
	long phoneNo;

	Student(int id, String name, long phoneNo) {
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Student Id: " + id + " Student Name: " + name + " Student Phone Number: " + phoneNo;
	}

}
