package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> xMap = new HashMap<>();
		Map<String, Integer> yMap = new HashMap<>();

		StringTokenizer st;
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine()," ");
			String x = st.nextToken();
			String y = st.nextToken();
			
			if(!xMap.containsKey(x)) {
				xMap.put(x, 0);				
			}
			if(!yMap.containsKey(y)) {
				yMap.put(y, 0);				
			}
			
			xMap.put(x, xMap.get(x)+1);	
			yMap.put(y, yMap.get(y)+1);	
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(String key : xMap.keySet()) {
			if(xMap.get(key) == 1) {
				sb.append(key+" ");
			}
		}
		
		for(String key : yMap.keySet()) {
			if(yMap.get(key) == 1) {
				sb.append(key);
			}
		}
		
		System.out.println(sb);
	}
}
