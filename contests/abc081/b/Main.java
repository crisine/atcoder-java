package abc081.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numberList.add(sc.nextInt());
        }

        int count = findAnswer(numberList, 0);
        System.out.println(count);
    }

    static int findAnswer(List<Integer> numberList, int count) {
        for (int i = 0; i < numberList.size(); i++) {
            int num = numberList.get(i);

            if (num % 2 != 0) {
                return count;
            } else {
                numberList.set(i, num / 2);
            }
        }
        return findAnswer(numberList, count + 1);
    }
}
