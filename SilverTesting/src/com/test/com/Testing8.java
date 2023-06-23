package com.test.com;

public class Testing8 {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4 ,5};
		int total = 0;
		for (int i : array) {
			System.out.println(array);
			if (i % 2 == 0)
				continue;
			total += 1;
		}
	}
}
