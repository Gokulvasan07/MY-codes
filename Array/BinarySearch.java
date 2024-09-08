import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner (System.in)){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            int result=binarySearch(arr,target);
            if(result!=-1)
                System.out.print(result);
            else
                System.out.print("Not found");
        }
    }
    private static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length;
        for(int i=0;i<=right;i++){
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
}
