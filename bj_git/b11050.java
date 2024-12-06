package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] KN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int K = Math.min(KN[0], KN[1]);
        int N = Math.max(KN[0], KN[1]);

        System.out.println(factorial(N, N - K) / factorial(K, 1));
    }

    public static int factorial(int number, int limit) {
        int fac = 1;
        while (number > limit) {
            fac *= number;
            number--;
        }
        return fac;
    }
}
