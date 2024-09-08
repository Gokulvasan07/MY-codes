import java.util.Scanner;
public class AverageArr {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int sum=0;
            for(int i=0;i<n;i++){
                sum=sum+arr[i];
            }
            double avg=sum/n;
            System.out.print(avg);
        }
    }
}
