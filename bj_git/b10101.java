package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class b10101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> triangle = new HashMap<>();

		for (int i = 0; i < 3; i++) {
			int angle = Integer.parseInt(br.readLine());
			if(!triangle.containsKey(angle)) {
				triangle.put(angle, 0);
			}
			
			triangle.put(angle, triangle.get(angle)+1);			
		}
		
		br.close();
		
		int sum = 0;
		for(int key : triangle.keySet()) {
			sum += key*triangle.get(key);
		}
		
		if(sum == 180) {
			int triangleSize = triangle.size();
			if(triangleSize == 1) {
				System.out.println("Equilateral");
			}else if(triangleSize == 2) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Scalene");
			}
		}else {
			System.out.println("Error");
		}
	}
}
