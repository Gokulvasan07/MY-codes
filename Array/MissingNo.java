import java.util.Scanner;
public class MissingNo {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n= sc.nextInt();
            int[] arr=new int[n];
            for(int i : arr)
                arr[i]=sc.nextInt();
            int ans=missingNo(arr);
            System.out.print(ans);
        }
    }
    static int missingNo(int[] arr){
        int n=arr.length;
        int sum=n*(n-1)/2;
        int actualsum=0;
        for(int i:arr)
            actualsum=actualsum+i;
        return sum-actualsum;
    }
}
