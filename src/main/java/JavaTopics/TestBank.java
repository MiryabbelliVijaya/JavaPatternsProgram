package JavaTopics;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HSBCBank HS= new HSBCBank(); //This is static polymorphism
	HS.CarLoan();
	HS.credit();
	HS.debit();
	HS.EducationLoan();
	HS.transferMoney();
	System.out.println(HS.min_bal);
	System.out.println(USbank.min_bal);
	HS.mutualFund();
	
	// we can achieve dynamic polymorphism /;child class object can be referred by parent interface reference variable
	USbank UH=new HSBCBank();
	UH.credit();
	UH.debit();
	UH.transferMoney();

	BrazilBank  BH=new HSBCBank();
	BH.mutualFund();
	
	}

}
