import java.util.Scanner;

public class frequencyMain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter inputs (in format = 1 1 2 3 4 4...): ");
		String str = scan.nextLine();
		
		int[] numbers = makeArray(str);
		
		int max = findMax(numbers);

		int[] frequencies = new int[max + 1];

		for(int i = 0; i < frequencies.length; i++) {
			frequencies[i] = 0;
		}

		findFrequency(numbers, 0, numbers.length - 1, frequencies);

		System.out.println("Num-Freq");
		for(int i = 0; i < frequencies.length; i++) {

			if(frequencies[i] == 0) {
				continue;
			}
			 System.out.println(i + "   " + frequencies[i]);
			
		}
		
		scan.close();
	}
	
	public static void findFrequency(int[] numbers, int left_index, int right_index, int[] frequencies) {
		
		
		if(left_index == right_index) {
			
			int number = numbers[left_index];
			frequencies[number] += 1;
			
			return;
		}
		
		if(numbers[left_index] == numbers[right_index]) {
			
			int number = numbers[left_index];
			frequencies[number] += right_index - left_index + 1;
			return;
			
		}
		
		int mid = (left_index + right_index)/2; 
        
        findFrequency(numbers, left_index, mid, frequencies);
        findFrequency(numbers, mid + 1, right_index, frequencies);
        
	}

	private static int findMax(int[] numbers) {
		int max = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	private static int[] makeArray(String str) {

		String outStr = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				outStr += str.charAt(i);
			}	
		}

		int[] arr = new int[outStr.length()];
		for(int i = 0; i < outStr.length(); i++) {
			arr[i] = outStr.charAt(i) - 48;
		}
		
		return arr;
	}


}
