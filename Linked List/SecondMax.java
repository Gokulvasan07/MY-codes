
import java.util.Scanner;
public class SecondMax {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            for(int i=0;i<n-1;i++){
                for(int j=n/2;j<n;j++){
                    System.out.print(arr[j]+" ");
                }
                break;
            }
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n/2;j++){
                    System.out.print(arr[j]+" ");
                }
                break;
            }
        }
    }
}

