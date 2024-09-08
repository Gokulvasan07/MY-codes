import java.util.Scanner;
public class ContainsSubString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String s2= sc.nextLine();
            if (isSub(s,s2))
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }
    static boolean isSub(String main,String sub){
        return main.contains(sub);
    }
}