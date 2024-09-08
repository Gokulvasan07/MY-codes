import java.util.*;
import java.math.*;
public class BinaryAddition{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            System.out.print(isBinaryAdd(s1,s2));
        }
    }
    static String isBinaryAdd(String s1,String s2){
        BigInteger a=new BigInteger(s1,2);
        BigInteger b=new BigInteger(s2,2);
        BigInteger s=a.add(b);
        return s.toString(2);
    }

}