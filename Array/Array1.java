import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size=sc.nextInt();
            int[] arr=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}