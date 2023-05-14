package BookMyShow;

public class User {

	String uname;
	int pwd;
	long phoneNo;

	User(String uname, int pwd, long phoneNo) {
		this.uname = uname;
		this.pwd = pwd;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "User Name: " + uname + " Password: " + pwd + " Phone Number: " + phoneNo;
	}

}
