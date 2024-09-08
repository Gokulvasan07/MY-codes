import java.util.Scanner;
public class WhilePalindrom {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String str=sc.nextLine();
            if(isPal(str))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    static boolean isPal(String str){
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
