package session_07;

public class Test1 {
	public static void main (String args[]) {
		try {
			
			int c=0;
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("c="+c);
			}
		
		catch(NumberFormatException e) {
			System.out.println("enter only integers");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2 values");
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("Enter denominator");
		}
		
			
			catch (Exception e) {
				//Exception e=new ArithematicException();
				//System.out.println(e);
				//e.printStackTrace();
				System.out.println("Exception!!");
			}
			
	}

}
