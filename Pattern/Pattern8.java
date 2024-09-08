import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in) ){
            int n=sc.nextInt();
            for(int i=1;i<=n*2-1;i++){
                for(int j=1;j<=n*2-1;j++){
                    if ((i+j>=n+1 && j-i<=n-1) && (i-j<=n-1 && i+j<=2*n+(n-1))) {
                        System.out.print(i+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}