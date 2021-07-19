package JavaTopics;

public class HSBCBank implements USbank,BrazilBank{

//if class is implementing any interface ,the its mandatory to define /override all the methods of interface.	
	public void credit() {
				System.out.println("HSBC...Credit");
	}

	public void debit() {
		System.out.println("HSBC...debit");
	}

	public void transferMoney() {
		System.out.println("HSBC...transferMoney");
	}
public void CarLoan()
{
	System.out.println("HSBC...car loan");
}
public void EducationLoan()
{
	System.out.println("HSBC...Education loan");
}

public void mutualFund() {
	
	System.out.println("BrazilBank...mutualFund");
}

}
