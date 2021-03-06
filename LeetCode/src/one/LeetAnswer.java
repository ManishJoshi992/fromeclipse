package one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetAnswer {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		LeetAnswer obj = new LeetAnswer();
		System.out.println(Arrays.toString(obj.twoSum(nums, target)));

	}
/*
	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}

		throw new IllegalArgumentException("No two sum solution");
	}
*/
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
