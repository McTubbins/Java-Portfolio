import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {
   static int comparisons;
   static int recursions;
   // Read and return an ArrayList of integers.
   private static ArrayList<Integer> readNums(Scanner scnr) {
      int size = scnr.nextInt();                // Read size of ArrayList
      ArrayList<Integer> nums = new ArrayList<Integer>();
      for (int i = 0; i < size; ++i) {          // Read the numbers
         nums.add(scnr.nextInt());
      }
      return nums;
   }

   static public int binarySearch(int target, ArrayList<Integer> integers,
                                    int lower, int upper) {
      int mid;
      
      while (upper >= lower) {
         recursions++;
         comparisons++;
         mid = (upper + lower) / 2;
         if (integers.get(mid) < target) {
            lower = mid + 1;
            comparisons++;
         }
         else if (integers.get(mid) > target) {
            upper = mid - 1;  
            comparisons++;
         }
         else {
            return mid;  
         }
      }
      comparisons--; 
      return -1;
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      // Input a list of integers
      ArrayList<Integer> integers = readNums(scnr);

      // Input a target value for the search
      int target = scnr.nextInt();

      int index = binarySearch(target, integers, 0, integers.size() - 1);

      System.out.printf("index: %d, recursions: %d, comparisons: %d\n",
                        index, recursions, comparisons);
   }
}
