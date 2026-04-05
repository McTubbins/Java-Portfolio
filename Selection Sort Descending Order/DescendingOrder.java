import java.util.Scanner;
import java.util.Arrays;

public class DescendingOrder {
   //       Write a void method selectionSortDescendTrace() that takes 
   //       an integer array and the number of elements in the array as arguments, 
   //       and sorts the array into descending order.
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
      int i;
      int j;
      int Smallest;
      int temp;
      int listPrint;
      for (i = 0; i < numElements - 1; i++) {
         Smallest = i;
         for (j = i + 1; j < numElements; j++) {
            if (numbers[j] > numbers[Smallest]) {
               Smallest = j;  
            }
         }
         temp = numbers[i];
         numbers[i] = numbers[Smallest];
         numbers[Smallest] = temp;
         
         for (listPrint = 0; listPrint < numElements; listPrint++) {
            System.out.print(numbers[listPrint] + " ");
         }
         System.out.println("");
      }
   }
   
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];

      //       Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.
      input = scnr.nextInt();
      while (input != -1) {
         numbers[i] = input;
         input = scnr.nextInt();
         i++;
      }
      numElements = i;
      selectionSortDescendTrace(numbers, numElements);
   }
}

