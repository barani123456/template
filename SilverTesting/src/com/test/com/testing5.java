package com.test.com;

public class testing5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] arrayA = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 } };
		//System.out.println(arrayA);
		int[][] arrayB = arrayA.clone();
		int total = 0;
		for (int[] tmp : arrayB) {
			for (int val : tmp) {
				total += val;
	}
		}
		System.out.println(total);

	}

}
