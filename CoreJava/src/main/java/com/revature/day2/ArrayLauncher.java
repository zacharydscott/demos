package com.revature.day2;

import java.util.Arrays;

public class ArrayLauncher {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 4;
		arr[4] = 20;
		arr[2] = 5;
		for (int element : arr) {
			System.out.println(element);
		}

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		int[][] matrix = new int[2][3];
		matrix[0][0] = 5;
		matrix[0][1] = 20;
		matrix[1][2] = 15;
		matrix[1][1] = 5;
		for (int[] row : matrix) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.print("\n");
		}
	}
}
