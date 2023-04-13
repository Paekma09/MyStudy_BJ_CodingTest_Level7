package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] A = new char[5][15];
		
		for (int i=0; i<5;i++) {
			String input = br.readLine();
			for(int j=0; j<input.length();j++) {
				A[i][j] = input.charAt(j);
			}
		}
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(A[j][j]==' ' || A[j][i]=='\0') {	// 공백이거나 null일 경우 계속 넘어가기
					continue;									// 이 문제의 키포인트
				}
				System.out.print(A[j][i]);
			}
		}
	}
}
