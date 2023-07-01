import java.util.Arrays;

public class ArrayExample {
	public static double highestMarks(double[] marks) {
		double maxEle = (double)Integer.MIN_VALUE;
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] > maxEle) {
				maxEle = marks[i];
			}
		}
		return maxEle;
	}
	public static void main(String[] args) {
		double[] marks = {98, 93.5, 94.2, 97};
		System.out.println("Highest marks: ");
		//method 1: using for loop
		System.out.println("Using Loops: " + highestMarks(marks));
		// using sort method
		Arrays.sort(marks);
		double highestMarks = marks[marks.length - 1];
		System.out.println("Using sort method: " + highestMarks);
		
		System.out.println("\n\nDisplaying Using for-each Loop:");
		   for(double a : marks) {
		     System.out.println(a);
		   }

	}
}
