package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] A = new int[9][9];
		
		int max = A[0][0];
		int I =0, J = 0;
		for (int i=0; i<A.length;i++) {
			for(int j=0; j<A[i].length;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<A.length; i++) {
			for (int j=0; j<A[i].length;j++) {
				if(max <= A[i][j]) {
					max = A[i][j];
					I = i+1;
					J = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.print(I+" "+J);
	}
}
