import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                if (isArmstrong(i))
                    System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n) {
        int count = count(n);
        int temp=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+(int)(Math.pow(rem,count));
            n=n/10;
        }
        return temp==sum;
    }
    static int count(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
}