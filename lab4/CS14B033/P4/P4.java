import syntaxtree.*;
import visitor.*;
import java.util.*;

public class P4 {
    public static void main(String [] args) {
        try {
            LoopyTacoJava2Parser mjp = new LoopyTacoJava2Parser(System.in);
            Node root = LoopyTacoJava2Parser.Goal();
            LoopIndependentIters<String, String> lii = new LoopIndependentIters<String, String>();
            root.accept(lii, "");
            LoopInvariantCode<String, String> lic = new LoopInvariantCode<String, String>();
            root.accept(lic, "");
        } catch (ParseException e) {
            System.out.println(e.toString());
        }
    }
}


