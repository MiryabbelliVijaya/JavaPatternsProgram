package JavaTopics;

public class ConstructorWithThisKeyword {

	String name;
	int age;
	public ConstructorWithThisKeyword(String name ,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyword c =new ConstructorWithThisKeyword("name",34);
	
	}

	

}
