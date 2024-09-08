import java.util.Scanner;
public class LinearSearchArr {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i]==target){
                    System.out.print(i);
                break;
                }
            }
        }
    }
}
