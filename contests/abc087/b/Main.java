package abc087.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coins[] =  new int[3];
        int amount = 0;
        int count = 0;

        for (int i = 0; i < 3; i++) {
            coins[i] = sc.nextInt();
        }

        amount = sc.nextInt();

        for (int i = 0; i <= coins[0]; i++) {
            for (int j = 0; j <= coins[1]; j++) {
                for (int k = 0; k <= coins[2]; k++) {
                    int coinAmount = (i * 500) + (j * 100) + (k * 50);
                    if (amount - coinAmount == 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
