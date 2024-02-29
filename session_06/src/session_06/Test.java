package session_06;

public class Test {
	public static void main(String args[]) {
		
	/*BOI b=new BOI();
	System.out.println("BOI ="+b.getROI());
	
	//polymorphic refrence
	//SuperClass ref=new Child_class object();
	
	Bank b1=new SBI();
	System.out.println("SBI="+b1.getROI());*/
		//Bank b= new Bank();//cannot be instantiated(means cannot create objects) as parent class is abstract
		Bank b= new BOI();
		System.out.println("BOI="+b.getROI());
		
		Bank b1=new SBI();
		System.out.println("SBI="+b1.getROI());
		b1.sayHello();
		b.sayHello();
		

}}
