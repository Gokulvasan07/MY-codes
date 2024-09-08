import java.util.Scanner;
public class ValidEmailString {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
                String str=sc.nextLine();
                if(vEmail(str))
                    System.out.println("Yes");
                else
                    System.out.println("No");
        }
    }
    static boolean vEmail(String str){
        return str.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }
}
