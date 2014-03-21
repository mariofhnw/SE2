package various;

public class Exercise1ProjectEuler {

	public static void main(String[] args) {
		int fib = 0;
		int evensum = 2;
		int first = 1;
		int second = 2;
		
		for(int i = fib; fib < 4000000; i++){
			fib = first + second;
			if((first+second)%2 == 0){
				evensum += fib;
			}
			first = second;
			second = fib;
		}
		System.out.println(evensum);
	}
}