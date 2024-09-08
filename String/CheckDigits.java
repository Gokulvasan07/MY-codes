import java.util.Scanner;
public class CheckDigits {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String str=sc.nextLine();
            if(onlyDigit(str))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    static boolean onlyDigit(String str){
        return str.matches("\\d+");
    }
}
