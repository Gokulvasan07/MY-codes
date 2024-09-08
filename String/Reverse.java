import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            String str=sc.nextLine();
            String Rev="";
            for(int i=str.length()-1;i>=0;i--){
                Rev=Rev+str.charAt(i);
            }
            System.out.println(Rev);
        }
    }
}
