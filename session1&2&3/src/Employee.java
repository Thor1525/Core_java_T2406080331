

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee() {
		System.out.println("Default Constructor Called");
		empId=111;
		empName="Rahul";
		empSalary=400000.44;
	}
	
	public Employee(int i,String n,double d) {
		System.out.println("PAramaterized Constructor Called");
		empId=i;
		empName=n;
		empSalary=d;
		
	}
	public String toString() {
		return "EMployee="+empId+" "+empName+" "+" "+ empSalary;
	}
	
	public static void main(String args[]) {
		Employee e=new Employee();
		System.out.println(e);
		Employee e1=new Employee(222,"JAmes",523453.33d);
		System.out.println(e1);
		Employee e2=new Employee(111,"Chris",4323432.35d);
		System.out.println(e2);

	}

}
