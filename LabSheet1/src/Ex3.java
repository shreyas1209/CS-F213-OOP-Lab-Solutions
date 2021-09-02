
public class Ex3 {
	

	public static void main(String[] args) {
	String num;
	num = args[0];
	int size = num.length();
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			for(int k=0;k<size;k++) {
				if((num.charAt(i)!=num.charAt(j)) && (num.charAt(j)!=num.charAt(k)) && (num.charAt(i)!=num.charAt(k))) {
					System.out.println(num.charAt(i)+""+num.charAt(j)+""+num.charAt(k));
					
				}
				
			}
		}
	}
	
	

	}

}
