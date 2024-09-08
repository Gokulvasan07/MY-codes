import java.util.*;
public class SingleLoopSorting{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int  n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            for(int i=0,j=0;i<n*(n-1)/2;i++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                j++;
                if(j>=n-1){
                    j=0;
                }
        }
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }
        }
    }
}