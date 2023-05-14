// Aggregation is nothing but "HAS A Relationship"
// as both student and teacher containing same address datamebers , we created a separate class for address 
class Address{
	int plot_no;
	String street;
	String landmark;
	String city;
	int pin;
	
	public Address(int plot_no, String street, String landmark, String city, int pin) {
		super();
		this.plot_no = plot_no;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [plot_no=" + plot_no + ", street=" + street + ", landmark=" + landmark + ", city=" + city
				+ ", pin=" + pin + "]";
	}	
}

class Student{
	int roll;
	String name;
	Address add;  //making reference of address class
	
	public Student(int roll, String name, Address add) {
		this.roll = roll;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}	
}

class Teacher{
	int id;
	String name;
	Address add;  //making reference of address class
	
	public Teacher(int id, String name, Address add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
}

public class Data {
	public static void main(String[] args) {
		Address a=new Address(02,"itwari","postbox","nagpur",440002);
		Address a1=new Address(05,"manewada","pan shop","nagpur",440008);
		
		Student s=new Student(101,"mrunali",a);
		Teacher t=new Teacher(147,"yashasvi",a1);
		
		System.out.println(s);
		System.out.println(t);
	}
}
