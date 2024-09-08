import java.util.Scanner;
public class LongestCommonSubString {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            System.out.print(longSub(s1,s2));
        }
    }
    static String longSub(String s1,String s2){
        int[][] str=new int[s1.length()+1][s2.length()+1];
        int maxl=0,end=0;
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    str[i][j]=str[i-1][j-1]+1;
                    if(str[i][j]>maxl){
                        maxl=str[i][j];
                        end=i;
                    }
                }
            }
        }
        return s1.substring(end-maxl,end);
    }
}
