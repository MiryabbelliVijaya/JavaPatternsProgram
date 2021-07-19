package JavaTopics;

public class ConstructorsConcept {
	
	public ConstructorsConcept()
	{
		System.out.println(" Default Constructor");
	}
	public ConstructorsConcept(int i)
	{
		System.out.println(i);
	}
	public ConstructorsConcept(int i,int j)
	{
		System.out.println(i+"  "+j);
	}
	public static void main(String[] args) {
		
		ConstructorsConcept CC= new ConstructorsConcept();
		ConstructorsConcept CC1= new ConstructorsConcept(10);
		ConstructorsConcept CC2= new ConstructorsConcept(10,40);
	}

}
