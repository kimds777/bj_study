package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int leng = Integer.parseInt(br.readLine()); //배열 크기 지정
        int[] sort = new int[leng];

		for (int i = 0; i<leng; i++) {
			sort[i] = Integer.parseInt(br.readLine()); //배열에 입력값 저장
		}
		
        br.close();
        
		Arrays.sort(sort); //배열 오름차순으로 정렬
		
		StringBuilder sb = new StringBuilder();
		
		for(int s : sort) {
			sb.append(s+"\n"); //정렬된 순서대로 Stringbuilder에 저장
		}
		
		System.out.println(sb); //출력
	}
}
