package session_06;

public abstract class Bank{//to remove the flaw of inheritance of RoI we create abstract class
	/*public float getROI() {
		return 0.0f;
	}*/
	
	
	public abstract float getROI();
	
	public void sayHello() {
		System.out.println("Hello World!!");
		
	}
}
