package overriding;

public class MainBank {
	public static void main(String[] args) {
BankAA abc = new BankBB();
System.out.println(abc.getIntrestRate());
	}

}

