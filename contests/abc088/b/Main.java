package abc088.b;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> cardsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            cardsList.add(num);
        }

        cardsList.sort(Collections.reverseOrder());

        int answer = 0;
        for (int j = 0; j < cardsList.size(); j++) {
            if (j % 2 == 0) {
                answer += cardsList.get(j);
            } else {
                answer -=  cardsList.get(j);
            }
        }
        System.out.println(answer);
    }
}
