import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int length = removeDuplicates(nums);
            for (int i = 0; i < length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int unique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[unique - 1]) {
                nums[unique] = nums[i];
                unique++;
            }
        }
        return unique;
    }
}
