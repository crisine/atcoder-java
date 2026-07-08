package abc085.b;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numberSet.add(sc.nextInt());
        }
        List<Integer> list = new ArrayList<Integer>(numberSet);
        list.sort(Collections.reverseOrder());

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i > 0 && list.get(i - 1) - list.get(i) >= 1) {
                count++;
            } else if (i == 0) {
                count++;
                continue;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
