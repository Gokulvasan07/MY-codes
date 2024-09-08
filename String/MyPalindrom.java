import java.util.Scanner;
public class MyPalindrom {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine().toUpperCase();
            if(isPalindrome(s))
                System.out.println("Palindrom");
            else
                System.out.println("No");
        }
    }
    static boolean isPalindrome(String s) {
        String temp = s;
        String Rev = "";
        for(int i = s.length() - 1; i >= 0; i--)
            Rev = Rev + s.charAt(i);
        return temp.equals(Rev);
    }
}
