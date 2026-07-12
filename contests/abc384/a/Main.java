package abc384.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        boolean isSpoiler = false;
        for (int i = 0; i < s.length(); i++) {
            if (!isSpoiler && s.charAt(i) == '|') {
                isSpoiler = true;
            } else if (isSpoiler && s.charAt(i) == '|') {
                isSpoiler = false;
                continue;
            }

            if (!isSpoiler) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
