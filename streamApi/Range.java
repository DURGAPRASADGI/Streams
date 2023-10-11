package streamApi;

import java.util.stream.IntStream;

public class Range {
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		return n>1 && IntStream.range(2,(int)Math.sqrt(n)+1).noneMatch(i->n%i==0);
	}
public static void main(String[] args) {
	int a=2;
	int b=100;
	IntStream.rangeClosed(a, b).filter(Range::isPrime).forEach(System.out::println);
}
}
