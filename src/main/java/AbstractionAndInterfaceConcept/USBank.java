package AbstractionAndInterfaceConcept;

public interface USBank {

	
	// No method body , only method declaration is there.
	// we can not create object of interface 
	// No static method.
	// but variables in interface are static in nature by defaul.
	// 100% abstraction
	
	int min_bal = 100;
	public void debit();
	
	public void creadit();
	
	public void transferMoney();
	
}
