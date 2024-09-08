import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s= sc.nextLine();
            int n=s.length();
            for(int i=0 ;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==(n/2))
                        System.out.print(s.charAt(j) +" ");
                    else if(j==(n/2)+2)
                        System.out.print(s.charAt(i) +" ");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
