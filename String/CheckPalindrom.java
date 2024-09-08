import java.util.Scanner;
public class CheckPalindrom{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String str=sc.nextLine();
            isPalindrom(str);
        }
    }
    static void isPalindrom(String str) {
            for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                    System.out.print("Not a ");
                    break;
                }
            }
            System.out.print("Palindrom");
        }
}
