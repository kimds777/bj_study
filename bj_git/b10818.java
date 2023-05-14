package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine());
		int min = 1000001;
		int max = -1000001;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(num>max) max = num;
			if(num<min) min = num;
		}
		
		System.out.println(min+" "+max);
		

	}
}


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class b10818 {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		int min = 1000001;
//		int max = -1000001;
//
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int[] nNum = new int[n];
//		for (int i = 0; i < n; i++) {
//			nNum[i] = Integer.parseInt(st.nextToken());
//		}
//		
//		Arrays.sort(nNum);
//		
//		System.out.println(nNum[0]+" "+nNum[n-1]);
//
//	}
//}
