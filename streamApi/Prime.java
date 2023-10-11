package streamApi;

import java.util.stream.IntStream;

public class Prime {
	private static boolean primeByStreamApi(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
			return false;
		}
		
		return n>1 && IntStream.range(2, (int)Math.sqrt(n)+1).noneMatch(i->n%i==0);
	}
	public static void main(String[] args) {
		
		int n=17;
		
		boolean isPrime=primeByStreamApi(n);
		if(isPrime) {
			System.out.println("prime  is "+n);
		}
		else {
			System.out.println("is not prime");
		}
		
	}

	

}
