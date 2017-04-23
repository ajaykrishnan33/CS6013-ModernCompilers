import syntaxtree.*;
import visitor.*;
import java.util.*;

public class P6 {
   public static void main(String [] args) {
      try {
         QTACoJavaParser mjp = new QTACoJavaParser(System.in);
         Node root = QTACoJavaParser.Goal();
         AliasAnalyser<String, String> aa = new AliasAnalyser<String, String>();
         root.accept(aa, null);
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 


