package various;

public class DebuggingExample {
	public static void main(String[] args) {
		int[] numsIn;
		int[] numsOut;
		// Convert command-line args to integer array
		numsIn = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			numsIn[i] = Integer.parseInt(args[i]);
		}
		// Create the second array
		int lengthNumsOut = numsIn.length / 2; // error
		numsOut = new int[lengthNumsOut];
		// Process the first array into the second
		for (int i = 0; i < lengthNumsOut; i++) {
			numsOut[i] = numsIn[i] + numsIn[numsIn.length -1 -i]; // error
		}
		// Print the result
		for (int i = 0; i < numsOut.length; i++){
			System.out.println(numsOut[i]); // error
		}
	}
}