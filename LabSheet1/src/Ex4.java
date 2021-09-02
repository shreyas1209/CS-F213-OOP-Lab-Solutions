
public class Ex4 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double l2r = 0 , r2l =0;
		for(int i=1;i<=n;i++) {
			l2r += (1.0/i);
		}
		
		for(int i=n;i>=1;i--) {
			r2l += (1.0/i);
		}
		
		System.out.println("The Harmonic Sum from Left to Right is :"+ l2r);
		System.out.println("The Harmonic Sum from Right to Left is :"+ r2l);

	}

}
