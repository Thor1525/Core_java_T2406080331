package session_07;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos=null;
		try{
			fos =new FileOutputStream("C:\\Users\\Shreyash\\OneDrive\\Documents\\mno.txt",true);
			//fos.write(65);
			String str="JSPM BATCH 02";
			byte[] b=str.getBytes();
			fos.write(b);
			System.out.println("SUCCESS");
			
		}
		catch(Exception e){
			System.out.println(e);
			
			
		}
		finally {
			System.out.println("Finally block");
			fos.close();
		}
		

	}

}
