import syntaxtree.*;
import visitor.*;

public class P3 {
   public static void main(String [] args) {
      try {
         TACoJavaParser mjp = new TACoJavaParser(System.in);
         Node root = TACoJavaParser.Goal();
         // System.out.println("Program parsed successfully");

         BlockBuilder bb = new BlockBuilder<String, String>();
         root.accept(bb, null);

      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 


