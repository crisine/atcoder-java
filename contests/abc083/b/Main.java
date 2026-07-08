package abc083.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> numberList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                int num = str.charAt(j) - '0';
                sum += num;
            }
            if (sum >= a && sum <= b) {
                numberList.add(i);
            }
        }

        int answer = numberList.stream()
                        .mapToInt(Integer::intValue)
                                .sum();
        System.out.println(answer);
    }
}
