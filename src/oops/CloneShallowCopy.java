package oops;

class student implements Cloneable{
	int sid;
	String sname;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	public student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
}

class Address{
	String city;

	public Address(String city) {
		this.city = city;
	}
}

public class CloneShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Guntur");
		student s1 = new student(54,"Mounika",address);
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-------------------------");
		
		student s2 =(student)s1.clone();
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("-------------------------");
		System.out.println("***********************************");
		
		s2.sid = 90;
		s2.sname = "chinnu";
		s2.address.city = "hyd";
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-------------------------");
		
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);	
	}
}

