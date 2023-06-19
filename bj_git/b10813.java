package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] baskets = new int[n];
		for(int i = 0; i<n; i++) {
			baskets[i] = i+1;
		}
		
		int temp;
		
		for(int j = 0; j<m; j++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			temp = baskets[a];
			baskets[a] = baskets[b];
			baskets[b] = temp;
		}
		
		for(int basket : baskets) {
			System.out.print(basket+" ");
		}
	}
}
