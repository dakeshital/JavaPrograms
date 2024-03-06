package arrayprograms;

public class FindMissingNumberInArray {
	public static int findMissingNumber(int[] nums, int n) {
		
		int totalSum = n * (n + 1) / 2;
		System.out.println("totalsum: "+totalSum);
		
		int actualSum = 0;
		for (int num : nums) {
			actualSum =actualSum+ num;
		}
		System.out.println("ActualSum: "+actualSum);
		int missingNum = totalSum - actualSum;
		return missingNum;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 6, 3, 7, 8 };
		int n = 8;
		int missingNumber = findMissingNumber(nums, n);
		System.out.println("Missing Number: " + missingNumber);
	}
}
