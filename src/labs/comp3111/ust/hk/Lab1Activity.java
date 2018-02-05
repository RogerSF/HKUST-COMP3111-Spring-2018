package labs.comp3111.ust.hk;

public class Lab1Activity {
	private static int maxValue(int[] chars) {
	    int max = chars[0];
	    for (int ktr = 0; ktr < chars.length; ktr++) {
	        if (chars[ktr] > max) {
	            max = chars[ktr];
	        }
	    }
	    return max;
	}
	private static int minValue(int[] chars) {
	    int min = chars[0];
	    for (int ktr = 0; ktr < chars.length; ktr++) {
	        if (chars[ktr] < min) {
	            min = chars[ktr];
	        }
	    }
	    return min;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		for (int i = 0; i<10; i++ ) {
			sum += arr[i];
		}
		
		int min = minValue(arr);
		int max = maxValue(arr);	
		System.out.println(String.format("Sum of the numbers is %d", sum));
		System.out.println(String.format("Min = %d; Max = %d", min, max));
		
		
		

	}
}

