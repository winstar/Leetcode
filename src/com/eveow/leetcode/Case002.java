package com.eveow.leetcode;

/**
 * Title: Add Two Numbers<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2015    <br>
 * Create DateTime: 2015年08月17日 下午7:49 <br>
 *
 * @author Josh Wang
 */
public class Case002 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int last = 0;
		ListNode root = null;
		ListNode lastNode = null;
		while (l1 != null || l2 != null) {
			int val = last;
			if (l1 != null) {
				val += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				val += l2.val;
				l2 = l2.next;
			}
			last = val / 10;
			val = val % 10;
			ListNode n = new ListNode(val);
			if (lastNode == null) {
				root = n;
			} else {
				lastNode.next = n;
			}
			lastNode = n;
		}
		if (last > 0) {
			ListNode n = new ListNode(last);
			lastNode.next = n;
		}
		return root;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
