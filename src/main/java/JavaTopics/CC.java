package JavaTopics;

public class CC extends PC {
//Overloading,overriding,interface,inheritance
	public CC() {
		super(); // Super is used to call parent class constructor
		System.out.println("Child class constructor");
	}

	public CC(int i) {
		super(i); // Super is used to call parent class constructor
		System.out.println("Child class constructor");
	}

	public CC(int i, int j) {
		super(i, j); // Super is used to call parent class constructor
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		CC obj = new CC(10, 10);
	}

}
