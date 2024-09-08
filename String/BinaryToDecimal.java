import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String binary = sc.nextLine();
            System.out.println(deciMal(binary));
        }
    }
    public static int deciMal(String s) {
        int n = s.length();
        int decimal = 0;
        int base = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                decimal = decimal + base;
            }
            base = base * 2;
        }
        return decimal;
    }
}