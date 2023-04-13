package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		
		int[][] result = new int[N][M];
		
		for (int i=0; i<A.length;i++) {
			for(int j=0; j<A[i].length;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<B.length;i++) {
			for(int j=0; j<B[i].length;j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				result[i][j] = A[i][j] + B[i][j];
				System.out.print(result[i][j] +" ");
			}
			System.out.println();
		}
	}
}
