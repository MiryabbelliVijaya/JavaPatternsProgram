package JavaTopics;

public interface USbank {
	
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration and no method body
	//in interface , we declare variables and those are static in nature
	// vars value will not be changed these are final
	//no static methods are allowed
	//no main method and we can not create object 
	//interface is abstract in nature.abstarct means we cannot instantiate
	

}
