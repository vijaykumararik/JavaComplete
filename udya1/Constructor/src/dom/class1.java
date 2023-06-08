package dom;

public class class1 {
 
	String name;
	String email;
	String password;
	long contactNumber;
	 class1(String name,String email,String password,long contactNumber) {
		this.name=name;
		this.email=email;
		this.password=password;
		this.contactNumber=contactNumber;
		displayDetails();
		System.out.println();
	}
	public void displayDetails() {
		System.out.println("name:"+name +" \nemail: "+email+
				" \npassword: "+password+"\ncontactnumber: "+contactNumber);
		
	}
}
