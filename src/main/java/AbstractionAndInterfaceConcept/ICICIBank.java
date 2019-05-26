package AbstractionAndInterfaceConcept;

public class ICICIBank extends Finnace  implements USBank, RBIBank {


	// RBIBank
	public void educationLoan() {
		System.out.println("icici education loan");
	}

	public void hoamLoan() {
		System.out.println("icici hoam loan");
		
	}

	public void carLoan() {
		System.out.println("icici car loan");
		
	}

	
	// USBank Interface
	public void debit() {
		System.out.println("icici debit card");	
	}

	public void creadit() {
		System.out.println("icici creadit card");
		
	}

	public void transferMoney() {
		System.out.println("icici tranfer money");
		
	}
	
	// class itself methods
	
	public void mutualFunds(){
		System.out.println("icici mutual funds");
	}
	
	
	public void insurance(){
		System.out.println("icici insurance");
	}


}
	