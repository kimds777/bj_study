package bj_git;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10811 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[n];
		
		for(int i = 0; i < n; i++) {
			basket[i] = i+1;
//			System.out.println("basket["+i+"] = "+(i+1));
		}
		
		for(int count = m; count > 0; count--) {
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;
			
//			System.out.println("int i = "+i+", int j = "+j);
//			System.out.println("---------------------------");
			
			if(i != j) {
				for(int c = i; c<j; c++) {
					int value = j--;
					
					int temp = basket[c];
//					System.out.println("int temp = "+temp);
					basket[c] = basket[value]; 					
					basket[value] = temp; 	
//					System.out.println("basket["+c+"] = "+basket[c]+", basket[value] = "+basket[value]);
				}				
			}			
		}
		
		for(int b : basket) {
			System.out.print(b+" ");
		}
		
		br.close();
		
	}
}
