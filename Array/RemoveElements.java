import java.util.Scanner;
public class RemoveElements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int newLength = removeElement(arr, k);
            for (int i = 0; i < newLength; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
