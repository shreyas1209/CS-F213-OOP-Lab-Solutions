
public class Ex2 {

	public static void main(String[] args) {
		
		int n;
		n = Integer.parseInt(args[0]);
		System.out.println(n);
		int[] numArray;
		
		numArray = new int[args.length-1];
		for (int i=1;i<(args.length);i++){
			numArray[i-1] = Integer.parseInt(args[i]);
		}
		
		for (int i=0;i<numArray.length;i++){
			for(int j=0;j<numArray.length;j++) {
				if((numArray[i] < numArray[j]) && ( (numArray[i]+numArray[j]) == n)) {
					System.out.println(numArray[i]+" "+numArray[j]);
					
				}
			}
		}
		

	}

}
