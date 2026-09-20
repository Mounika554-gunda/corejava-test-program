package oops;

class student1 {
	int sid;
	String sname;
	Address1 address1;
	
	public student1(int sid, String sname, Address1 address1) {
		this.sid = sid;
		this.sname = sname;
		this.address1 = address1;
	}

	public student1(student1 s1) {
		this.sid = s1.sid;
		this.sname = s1.sname;
		this.address1 = new Address1(s1.address1);
	}
}

class Address1{
	String city;
	
	public Address1(Address1 address1) {
		this.city = address1.city;
	}

	public Address1(String city) {
		this.city = city;
	}
}


public class CloneDeepCopy {

	public static void main(String[] args) {
		Address1 address1 = new Address1("Guntur");
		student1 s1 = new student1(54,"Mounika",address1);
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address1.city);
		System.out.println("-------------------------");
		
		student1 s2 = new student1(s1);
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address1.city);
		System.out.println("-------------------------");
		System.out.println("***********************************");
		
		s2.address1.city = "hyd";
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address1.city);
		System.out.println("-------------------------");
		
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address1.city);
		

	}

}
