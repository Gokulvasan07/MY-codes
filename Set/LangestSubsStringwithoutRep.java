import java.util.*;
import java.util.Set;
import java.util.HashSet;
public class LangestSubsStringwithoutRep{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String s=sc.nextLine();
            System.out.print(isLangestSubs(s));
        }
    }
    static int isLangestSubs(String s){
        Set <Character> Ch=new HashSet<>();
        int left=0,maxi=0;
        for(int i=0;i<s.length();i++){
            while(Ch.contains(s.charAt(i))){
                Ch.remove(s.charAt(left));
                left++;
            }
            Ch.add(s.charAt(i));
            maxi=Math.max(maxi, i-left+1);
        }
        return maxi;
    }
}
