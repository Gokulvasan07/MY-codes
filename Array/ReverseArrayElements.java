import java.util.*;

public class ReverseArrayElements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            for (int i=0;i<n;i++){
                    int sum=0;
                    int m=arr[i];
                    while(m!=0){
                        int rem=m%10;
                        sum=rem+sum*10;
                        m=m/10;
                    }
                System.out.print(sum+ " ");
            }
        }
    }
}
