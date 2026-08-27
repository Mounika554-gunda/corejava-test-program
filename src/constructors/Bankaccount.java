package constructors;

public class Bankaccount {
	String accholder;
	int accnum;
	double balance;
	
	Bankaccount(){
		this("unknown");
	}
	Bankaccount(String accholder){
		this(accholder,0);
	}
	Bankaccount(String accholder,int accnum){
		this(accholder,accnum,0.0);
	}
	public Bankaccount(String accholder, int accnum, double balance) {
		this.accholder = accholder;
		this.accnum = accnum;
		this.balance = balance;
	}
	
	void balinfo(){
		System.out.println("Name of the Account Holder:" +accholder);
		System.out.println("Account Number:" +accnum);
		System.out.println("balance:" +balance);
	}
	public static void main(String[] args) {
		Bankaccount b1 = new Bankaccount();
		Bankaccount b2 = new Bankaccount("krishna");
		Bankaccount b3 = new Bankaccount("krishna",123467890);
		Bankaccount b4 = new Bankaccount("krishna",1234567890,50000);
		
		b1.balinfo();
		b2.balinfo();
		b3.balinfo();
		b4.balinfo();

	}

}
