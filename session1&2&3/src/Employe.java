
public class Employe {
	private int empId;
	private String empName;
	private float empSal;
	private static int count;
	
	public Employe() {}
	
	public Employe(int empId, String empName,float empSal) {
		this.empId= empId;
		this.empName= empName;
		this.empSal= empSal;
		count++;
	}
	
	public static int getCount() {
		return count;
		
	}
	
	public String toString() {
		return "Employee [empId=" + empId +", " + "empName=" + empName +", " + "empSal=" + empSal + "]";
	}
	
	static {
		System.out.println("Static bloc called!!");
		count=40;
	}
	
	public static void main(String args[]) {
		System.out.println("MAin method called!!");
		Employe e1= new Employe(111,"rahul",56132.34f);
		System.out.println(e1);
		Employe e2= new Employe(222,"Aish",32112.35f);
		System.out.println(e2);
		Employe e3= new Employe(333,"Chris",63512.32f);
		System.out.println(e3);
		System.out.println("Employe count= "+ Employe.getCount());
	}
}