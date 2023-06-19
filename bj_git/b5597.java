package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5597 {
	public static void main(String[] args) throws IOException {
		int[] students = new int[30];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i<28; i++) {			
			int student = Integer.parseInt(br.readLine());
			students[student-1] = 1;
		}

		for(int j = 0; j<students.length; j++) {
			if(students[j] != 1) {
				System.out.println(j+1);
			}
		}
	}
}
