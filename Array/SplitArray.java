import java.util.*;

public class SplitArray {
    public static void main(String[] Args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] brr = new int[n / 2];
            int[] crr = new int[n / 2];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.arraycopy(arr,0,brr,0,n/2);
            for (int i = n / 2; i < n; i++)
                crr[i - n / 2] = arr[i];
            Arrays.sort(brr);
            Arrays.sort(crr);
            for (int i = 0; i < n / 2; i++) {
                System.out.print(brr[i] + " ");
            }
            for (int i = 0; i < n / 2; i++) {
                System.out.print(crr[i] + " ");
            }
        }
    }
}
