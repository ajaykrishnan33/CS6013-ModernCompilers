import syntaxtree.*;
import visitor.*;

public class TacoTester {
   public static void main(String [] args) {
      try {
         TACoJavaParser mjp = new TACoJavaParser(System.in);
         Node root = TACoJavaParser.Goal();
         System.out.println("Program parsed successfully");
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 


