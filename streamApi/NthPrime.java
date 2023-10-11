package streamApi;

import java.util.stream.IntStream;

public class NthPrime {
	public static boolean checkNumber(int n) {
		if(n<=1) {
			return false;
		}
		return n>1 && IntStream.range(2, (int)Math.sqrt(n)+1).noneMatch(i->n%i==0);
	}
	public static void main(String[] args) {
	
		int nthprime=5;
		int c=0;
		int startingprimeno=2;
		while (nthprime>c) {
			if(checkNumber(startingprimeno)) {
				c++;
			
		
	if(nthprime==c) {
				System.out.println("nth prime number is "+startingprimeno);
			}
			}
			startingprimeno++;
			
		}
	
	}

}
