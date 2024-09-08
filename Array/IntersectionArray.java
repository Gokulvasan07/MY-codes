import java.util.Scanner;
import java.util.ArrayList;

public class IntersectionArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int[] arr = new int[n1];
            int[] brr = new int[n2];
            for (int i = 0; i < n1; i++)
                arr[i] = sc.nextInt();
            for (int i = 0; i < n2; i++)
                brr[i] = sc.nextInt();
            int[] res = intersectionArray(arr, brr);
            for (int num : res)
                System.out.print(num + " ");
        }
    }
    private static int[] intersectionArray(int[] arr, int[] brr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    list.add(arr[i]);
                    // brr[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(k);
        }
        return res;
    }
}
