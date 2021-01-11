package one;

public class Solution {
	public int[] twoSum(int[] nums, int target) {

		int[] arr = new int[2];
		int flag = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] + nums[j] == target) {
					arr[0] = i;
					arr[1] = j;
					flag = 1;
				}
				if (flag == 1)
					break;
			}
			if (flag == 1)
				break;
		}
		return arr;

	}
}