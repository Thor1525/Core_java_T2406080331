package session_06;

public class B extends A{
	public B() {
		//super() without calling super it implictly calles the default constructor of parent class( A)
		System.out.println("Default constructor of class B");
		
	}
	
	public B(int a) {
		super(10);//have to call it explictly to call the parametrized constructor of parent class(A)
		System.out.println("Parameterized Constructor of class B");
		
		
	}
	
	public static void main(String args[]) {
		B b=new B(10);
	}

}
