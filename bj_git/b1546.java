package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int scoreCount = st.countTokens(); 
		int[] score = new int[scoreCount];
		
		for(int i = 0; i<scoreCount; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		double temp = 0.0;
		double totalScore = 0.0;
		for(int s : score) {
			totalScore += s;
			if(s>temp) {
				temp = s;
			}
		}
		
		double result = totalScore/temp*100.0/scoreCount;
		
		System.out.println(result);
	}
}
