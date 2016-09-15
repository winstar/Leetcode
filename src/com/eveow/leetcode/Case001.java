package com.eveow.leetcode;

/**
 * Title: Two Sum<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2015    <br>
 * Create DateTime: 2015年08月17日 下午7:48 <br>
 *
 * @author Josh Wang
 */
public class Case001 {

	public static void main(String[] args) {
		new Case001().twoSum(new int[] { 3, 2, 4 }, 6);
	}

	public int[] twoSum(int[] nums, int target) {
		int i = 0, j = 0;
		for (i = 0; i < nums.length; i++) {
			for (j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i + 1, j + 1 };
				}
			}
		}
		return null;
	}
}
