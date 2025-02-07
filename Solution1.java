import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {

    public static int[] quickSort(List<Integer> arr) {
        // Choosing the first element as the pivot
        int pivotElement = arr.get(0);

        // Lists to store the elements less than, equal to, and greater than the pivot
        List<Integer> leftNums = new ArrayList<>();
        List<Integer> equalNums = new ArrayList<>();
        List<Integer> rightNums = new ArrayList<>();

        // Partitioning the elements into the three lists
        for (int number : arr) {
            if (number < pivotElement) {
                leftNums.add(number);
            } else if (number > pivotElement) {
                rightNums.add(number);
            } else {
                equalNums.add(number);
            }
        }

        // Combining the lists to form the partitioned array
        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(leftNums);
        finalList.addAll(equalNums);
        finalList.addAll(rightNums);

        // Convert the final list to an array
        int[] finalArray = new int[finalList.size()];
        for (int i = 0; i < finalList.size(); i++) {
            finalArray[i] = finalList.get(i);
        }

        return finalArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        int[] result = quickSort(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
