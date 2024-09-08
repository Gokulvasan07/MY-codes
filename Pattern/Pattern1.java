import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            char ch = 'A';
            char[] s ={'A','B',' ','D','E'};
            for (int i = 0; i <n; i++) {
                for(int j = 0;j <s.length;j++ ){
                if(i==2)
                    System.out.print(ch++ + " ");
                else if(j==2)
                    System.out.print(s[i]++ +" ");
                else
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
