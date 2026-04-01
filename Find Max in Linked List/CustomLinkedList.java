public class CustomLinkedList {
   
   //public static int max = -99;
   
   public static int findMax(IntNode headObj) {
      
      if (headObj == null) {
        throw new IllegalArgumentException("List is empty");
      }
      int max = headObj.getNodeData();
      
      while (headObj != null) {
         if (headObj.getNodeData() > max) { 
            max = headObj.getNodeData();
         }
         headObj = headObj.getNext();
      } 
      return max;
   }
   
   public static void main(String[] args) {
      IntNode headObj; 
      IntNode currObj;
      IntNode lastObj;
      int i; 
      int max;
      
      // Create head node
      headObj = new IntNode(-1); 
      lastObj = headObj;
      
      // Add nodes to the list
      for (i = 0; i < 20; ++i) { 
         currObj = new IntNode(i);         
         lastObj.insertAfter(currObj); 
         lastObj = currObj;
      }    
      
      max = findMax(headObj);
      
      System.out.println(max);
   }
}