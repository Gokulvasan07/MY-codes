import java.util.Scanner;
import java.util.LinkedList;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedList<Integer> list1 = new LinkedList<>();
            LinkedList<Integer> list2 = new LinkedList<>();
            int num;
            while ((num = sc.nextInt()) != -1) {
                list1.add(num);
            }
            System.out.println("Enter elements of the second sorted list (-1 to end):");
            while ((num = sc.nextInt()) != -1) {
                list2.add(num);
            }
            LinkedList<Integer> mergedList = mergeTwoLists(list1, list2);
            System.out.println("Merged Sorted List:");
            for (int val : mergedList) {
                System.out.print(val + " ");
            }
        }
    }

    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> mergedList = new LinkedList<>();
        int i = 0, j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                mergedList.add(l1.get(i));
                i++;
            } else {
                mergedList.add(l2.get(j));
                j++;
            }
        }

        // Add remaining elements from l1 or l2
        while (i < l1.size()) {
            mergedList.add(l1.get(i));
            i++;
        }

        while (j < l2.size()) {
            mergedList.add(l2.get(j));
            j++;
        }
        return mergedList;
    }
}
