import syntaxtree.*;
import visitor.*;
import java.util.*;

public class P2 {
   public static void main(String [] args) {
      try {
         BuritoJavaParser mjp = new BuritoJavaParser(System.in);
         Node root = BuritoJavaParser.Goal();
         // System.out.println("Program parsed successfully");
         TypeAccumulator ta = new TypeAccumulator<String, String>();
         root.accept(ta, null);
         CodeConverter cc = new CodeConverter<ArrayList<String>, String>(TypeAccumulator.g);
         root.accept(cc, null);
         // TypeAccumulator.g.displayEverything();
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 


