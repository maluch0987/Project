package Project;

public class Array1 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		int[] num = { 2, 6, 113123, 3, 8, 35646, -24, 4578, 7, 5, -364578, 4 };
		int largest = 0;
		int secondlargest = 0;
		for (int i = 0; i < num.length; i++)
			if (num[i] > largest) {
				secondlargest = largest;
				largest = num[i];
			} else if (num[i] > secondlargest) {
				secondlargest = num[i];
			}
		System.out.println("The second largest number is: " + secondlargest);
	}
}
