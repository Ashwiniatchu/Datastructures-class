package day2;

public class Swapping {
	    public static void main(String[] args) {
	        int[] numbers = {4, 2, 10, 7, 5, 3, 8};
	        for (int i = 0; i < numbers.length; i++) {
	            int maxIndex = i;
	            for (int j = i + 1; j < numbers.length; j++) {
	                if (numbers[j] > numbers[maxIndex]) {
	                    maxIndex = j;
	                }
	            }
	            int temp = numbers[maxIndex];
	            numbers[maxIndex] = numbers[i];
	            numbers[i] = temp;
	        }
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
	}
