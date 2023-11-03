package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class b9063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N>1) {
			List<Integer> x = new ArrayList<>();
			List<Integer> y = new ArrayList<>();
			
			StringTokenizer st; 
			for(int i = 0; i<N; i++) {
				st = new StringTokenizer(br.readLine()," ");				
				x.add(Integer.parseInt(st.nextToken()));
				y.add(Integer.parseInt(st.nextToken()));
			}
			
			br.close();
			
			Collections.sort(x);
			Collections.sort(y);
			
			int area = (x.get(N-1)-x.get(0))*(y.get(N-1)-y.get(0));
			System.out.println(area);
		}else {
			br.close();
			System.out.println(0);
		}
	}
}
