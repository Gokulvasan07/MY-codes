import java.util.*;
public class StringArraySorting {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            for(int i = 0; i < n - 1;) {
                if(arr[i].compareTo(arr[i+1]) <= 0) {
                    i++;
                } else {
                    String temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    if(i > 0) {
                        i--;
                    }
                }
            }
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
