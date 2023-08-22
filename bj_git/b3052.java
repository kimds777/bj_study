package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Remainder {

	public void res() throws IOException {

		boolean[] arr = new boolean[42];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		for (int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		
		for(boolean b : arr) {
			if(b) {
				count++;
			}
		}
	
		System.out.println(count);
	}

}

public class b3052 {
	public static void main(String[] args) throws IOException {
		Remainder rm = new Remainder();
		rm.res();

	}
}
