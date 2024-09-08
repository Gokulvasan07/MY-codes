import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int temp=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                temp=arr[0];
                if(arr[i]!=arr[0]){
                    System.out.print(arr[i]-- +" ");
                }
            }
            System.out.print(temp);
        }
    }
}
