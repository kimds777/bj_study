package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10810 {
	public static void main(String[] args) throws IOException {
		new Basket().basket();
	}
}

class Basket {
	public void basket() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int x=0;x<m;x++) {
			st = new StringTokenizer(br.readLine()," ");
			int i = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;
			int k = Integer.parseInt(st.nextToken());
			while(i<=j) {
				arr[i] = k;
				i++;
			}
		}
		
		print(arr);
	}
	
	public void print(int[] arr) {
		for(int b : arr) {
			System.out.print(b+" ");
		}
	}
}
