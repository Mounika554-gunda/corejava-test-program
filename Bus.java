package myfirstjavaproject;

public class Bus {

	
		
			int seatnum;
			String custname;
			String address;
			
			static int busno = 1234;
			static String busname = "mounitravels";
			

			public static void main(String[] args) {
				System.out.println("bus details....");
				System.out.println("--------------------------------------");
				
				Bus person1 = new Bus();
				person1.seatnum = 4;
				person1.custname =  "miss";
				person1.address = "hyd";
				System.out.println("seat number:" + person1.seatnum);
				System.out.println("cust name:" + person1.custname);
				System.out.println("cust address:" + person1.address);

				System.out.println("bus number:" + busno);
				System.out.println("bus name:" + busname);
				System.out.println("--------------------------------------");
				
				Bus person2 = new Bus();
				person2.seatnum = 5;
				person2.custname =  "mouni";
				person2.address = "hyd";
				
				System.out.println("seat number:" + person2.seatnum);
				System.out.println("cust name:" + person2.custname);
				System.out.println("cust address:" + person2.address);
				System.out.println("bus number:" + busno);
				System.out.println("bus name:" + busname);

				
				
			
			}


	}

