import java.util.Scanner;
public class DublicateArr {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int[] arr=new int[n];
            boolean[] printed=new boolean[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j] && !printed[i]){
                        System.out.print(arr[i] +" ");
                        printed[i]=true;
                    }
                }
            }
        }
    }
}
