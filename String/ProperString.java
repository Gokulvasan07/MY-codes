import java.util.*;
public class ProperString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            sc.nextLine();
            for (int t = 0; t < T; t++) {
                String S = sc.nextLine();
                if (isEasyToPronounce(S)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
    static boolean isEasyToPronounce(String S) {
        int consecutiveConsonants = 0;
        for (char c : S.toCharArray()) {
            if (isConsonant(c)) {
                consecutiveConsonants++;
                if (consecutiveConsonants >= 4) {
                    return false;
                }
            } else {
                consecutiveConsonants = 0;
            }
        }
        return true;
    }
    static boolean isConsonant(char c) {
        return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
