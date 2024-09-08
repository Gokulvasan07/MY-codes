import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String s=sc.nextLine();
            int n=s.length();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i+j>=n+1)
                        System.out.print(s.charAt(i)+" ");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}