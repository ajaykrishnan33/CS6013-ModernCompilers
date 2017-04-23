import syntaxtree.*;
import visitor.*;
import java.util.*;

public class P5 {
   public static void main(String [] args) {
      try {
         FunkyTacoJavaParser mjp = new FunkyTacoJavaParser(System.in);
         Node root = FunkyTacoJavaParser.Goal();
         FunctionInliner<String, String> fi = new FunctionInliner<String, String>();
         root.accept(fi, null);
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 


