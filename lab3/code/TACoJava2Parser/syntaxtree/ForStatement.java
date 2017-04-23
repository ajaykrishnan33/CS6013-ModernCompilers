//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> "for"
 * f1 -> "("
 * f2 -> Identifier()
 * f3 -> "="
 * f4 -> Expression()
 * f5 -> ";"
 * f6 -> Expression()
 * f7 -> ";"
 * f8 -> Identifier()
 * f9 -> "="
 * f10 -> Expression()
 * f11 -> ")"
 * f12 -> Statement()
 */
public class ForStatement implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public Identifier f2;
   public NodeToken f3;
   public Expression f4;
   public NodeToken f5;
   public Expression f6;
   public NodeToken f7;
   public Identifier f8;
   public NodeToken f9;
   public Expression f10;
   public NodeToken f11;
   public Statement f12;

   public ForStatement(NodeToken n0, NodeToken n1, Identifier n2, NodeToken n3, Expression n4, NodeToken n5, Expression n6, NodeToken n7, Identifier n8, NodeToken n9, Expression n10, NodeToken n11, Statement n12) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
      f7 = n7;
      f8 = n8;
      f9 = n9;
      f10 = n10;
      f11 = n11;
      f12 = n12;
   }

   public ForStatement(Identifier n0, Expression n1, Expression n2, Identifier n3, Expression n4, Statement n5) {
      f0 = new NodeToken("for");
      f1 = new NodeToken("(");
      f2 = n0;
      f3 = new NodeToken("=");
      f4 = n1;
      f5 = new NodeToken(";");
      f6 = n2;
      f7 = new NodeToken(";");
      f8 = n3;
      f9 = new NodeToken("=");
      f10 = n4;
      f11 = new NodeToken(")");
      f12 = n5;
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
