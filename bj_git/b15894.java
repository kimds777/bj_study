package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b15894 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long answer = Long.parseLong(br.readLine());
		br.close();

		System.out.println(answer * 4);
	}
}
