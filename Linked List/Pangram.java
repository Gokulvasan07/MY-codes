import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String str=sc.nextLine();
            if(verify(str)){
                System.out.print("Pangram");
            }
            else{
                System.out.print("Not");
            }
        }
    }
    static boolean verify(String str){
        return str.matches(".*a.*") && str.matches(".*b.*") &&
        str.matches(".*c.*") && str.matches(".*d.*") &&
        str.matches(".*f.*") && str.matches(".*e.*") &&
        str.matches(".*g.*") && str.matches(".*h.*") &&
        str.matches(".*i.*") && str.matches(".*j.*") &&
        str.matches(".*k.*") && str.matches(".*l.*") &&
        str.matches(".*m.*") && str.matches(".*n.*") &&
        str.matches(".*o.*") && str.matches(".*p.*") &&
        str.matches(".*q.*") && str.matches(".*r.*") &&
        str.matches(".*s.*") && str.matches(".*t.*") &&
        str.matches(".*u.*") && str.matches(".*v.*") &&
        str.matches(".*w.*") && str.matches(".*x.*") &&
        str.matches(".*y.*") && str.matches(".*z.*");
    }
}
