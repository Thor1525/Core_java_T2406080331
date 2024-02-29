
public class TwoArray {
	public static void main(String args[]) {
		int[][] arr= new int[2][3];
		//arr[0][0]=1;
		//arr[1][2]=10;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=i+j+1;
				sum+=arr[i][j];
				System.out.print(arr[i][j]+"\t");
				
				
				
			}
			System.out.println();
			
		}
		System.out.println("Sum="+sum);
		
		/*for(int[] i:arr) {
			for(int j:i) {
				System.out.print(j+"\t");
				
			}
			System.out.println();
		}*/
		
	}

}
