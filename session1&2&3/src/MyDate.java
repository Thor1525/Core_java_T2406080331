
public class MyDate {
	private int day,month,year;
	
	public int getMonth() {
		return month;
	
	}
	public void setMonth(int m) {
		month =m;
	}
	
	public static void main(String args[]) {
		MyDate m= new MyDate();
		m.setMonth(7);
		int a=m.getMonth();
		System.out.println("Month="+a);
		
	}

	

}
