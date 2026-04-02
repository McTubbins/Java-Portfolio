import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

   // TODO: Write method to create and output all permutations of the list of names.
   public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
      int i;
      int size = nameList.size();

 

      if (size == 0) {
         for (i = 0; i < permList.size(); ++i) {
            if (i == permList.size() - 1) {
               System.out.print(permList.get(i));
            }
            else {
               System.out.print(permList.get(i) + ", ");
            }
         }
         System.out.println();
      }
      else {
         for (i = 0; i < nameList.size(); ++i) {

            ArrayList<String> newPerms = new ArrayList<String>(permList);
            newPerms.add(nameList.get(i));


            ArrayList<String> newNames = new ArrayList<String>(nameList);
            newNames.remove(i);


            printAllPermutations(newPerms, newNames);
         }
      }
      
   }

   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name;

      name = scnr.next();
      while (!name.equals("-1")) {
         nameList.add(name);
         name = scnr.next();
      }

      printAllPermutations(permList, nameList);
   }
}