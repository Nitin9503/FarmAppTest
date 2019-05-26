package AbstractionAndInterfaceConcept;

public class TestBankClass {

	public static void main(String[] args) {
		ICICIBank icb = new ICICIBank();
		icb.carLoan();
		icb.creadit();
		icb.debit();
		icb.educationLoan();
		icb.hoamLoan();
		icb.insurance();
		icb.mutualFunds();
		icb.transferMoney();

		System.out.println(USBank.min_bal);
		
		USBank ub = new ICICIBank();
		ub.creadit();
		ub.debit();
		ub.transferMoney();
	}
	

}
