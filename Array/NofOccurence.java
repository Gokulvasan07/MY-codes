import java.util.Scanner;

public class NofOccurence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            printOccurrences(arr);
        }
    }
    private static void printOccurrences(int[] arr) {
        int n = arr.length;
        boolean[] printed = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!printed[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        printed[j] = true;
                    }
                }
                System.out.println(arr[i] + " -> " + count);
            }
        }
    }
}
