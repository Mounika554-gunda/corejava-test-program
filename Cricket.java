package myfirstjavaproject;

public class Cricket {

	
		
			int runs;
			String plyname;
			
			static String teamname = "india";
			public static void main(String[] args) {
				System.out.println("indian cricket team.......");
				System.out.println("-----------------------------------------");
				
				Cricket p = new Cricket();
				p.plyname = "Dhoni";
			    p.runs = 96;
				System.out.println("Name of the player:" +p.plyname);
				System.out.println("no.of runs:" + p.runs);
				System.out.println("Team Name:" +teamname);
				System.out.println("-----------------------------------------");
				
				Cricket t = new Cricket();
				t.plyname = "ruturaj";
				t.runs = 100;
				System.out.println("Name of the player:" +t.plyname);
				System.out.println("no.of runs:" + t.runs);
				System.out.println("Team Name:" + teamname);
				
			    System.out.println("-----------------------------------------");
		      String teamname = "afghanistan";
			Cricket s = new Cricket();
			s.plyname = "rashid khan";
		    s.runs = 64;
			System.out.println("Name of the player:" +s.plyname);
			System.out.println("no.of runs:" + s.runs);
			System.out.println("Team Name:" +teamname);
			}
			}


