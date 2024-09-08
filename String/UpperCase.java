import java.util.*;
public class UpperCase{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            String s=sc.nextLine();
            System.out.print(isUpper(s));
        }
    }
    public static String isUpper(String s){
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c))
                res.append(Character.toLowerCase(c));
            else
                res.append(Character.toUpperCase(c));
        }
        return res.toString();
    }
}