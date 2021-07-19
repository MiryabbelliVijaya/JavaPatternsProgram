package JavaTopics;

//method overloading : when the method name is same with different arguments or parameter with in the same class
//method with in the method is not possible
//duplicate methods are not allowed 

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		MethodOverloading.main(10000000);
		obj.sum();
	  obj.sum(10,20);
	  obj.sum(10);
	  System.out.println(obj.sum("Vijaya",123.678));
	  System.out.println(obj.sum(123.678,"Vijaya"));
	}
	
	public static void main(int p)
	{
		System.out.println(" main with int");
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		  obj.sum(10,20);
		  obj.sum(10);
		  obj.sum("Vijaya",123.678);
		  obj.sum(123.678,"Vijaya");
	}
	public static void main(double d)
	{
		System.out.println(" main with double");
	}
	
	public void sum()
	{
		System.out.println("SumMentod : Without input Parameter");
		
	}
	
	public void sum(int i)
	{
		System.out.println("SumMentod : With one input Parameter");
	}
	public int sum(int i,int l)
	{
		System.out.println("SumMentod : With two input Parameter");
		System.out.println(i+l);
		return i;
	}
	public String sum(String s, double d)
	{
		System.out.println("SumMentod : With two input String and double Parameter");
		return s;
	}
	public double sum(double d ,String s )
	{
		System.out.println("SumMentod : With two input double and String Parameter");
		return d;
		
	}

}
