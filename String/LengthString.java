import java.util.*;

public class LengthString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            System.out.println(getLength(s));
        }
    }

    private static int getLength(String s) {
        s.trim();
        String[] arr=s.split("");
        return arr[arr.length-1].length();
    }
}
