package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MaxNum {
	public void maxNumFind() throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = 0;
		int index = 0;
		for(int i=0; i<9;i++) {
			int val = Integer.parseInt(br.readLine());
			if(val>max) {
				max = val;
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);

	}
}

public class b2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		MaxNum maxnum = new MaxNum();
		maxnum.maxNumFind();
	}
}
