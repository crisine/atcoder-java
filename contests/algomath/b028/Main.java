package algomath.b028;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long prev = 1;
        long curr = 1;

        for (int i = 3; i <= n; i++) {
            long temp = prev;
            prev = curr;
            curr =  (temp + curr) % 1000000007;
        }

        System.out.println(curr);
    }
}
