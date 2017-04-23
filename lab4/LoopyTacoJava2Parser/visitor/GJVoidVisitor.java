//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ void visitors must implement this interface.
 */

public interface GJVoidVisitor<A> {

   //
   // GJ void Auto class visitors
   //

   public void visit(NodeList n, A argu);
   public void visit(NodeListOptional n, A argu);
   public void visit(NodeOptional n, A argu);
   public void visit(NodeSequence n, A argu);
   public void visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> MainClass()
    * f1 -> ( TypeDeclaration() )*
    * f2 -> <EOF>
    */
   public void visit(Goal n, A argu);

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> "public"
    * f4 -> "static"
    * f5 -> "void"
    * f6 -> "main"
    * f7 -> "("
    * f8 -> "String"
    * f9 -> "["
    * f10 -> "]"
    * f11 -> Identifier()
    * f12 -> ")"
    * f13 -> "{"
    * f14 -> ( VarDeclaration() )*
    * f15 -> ( Statement() )*
    * f16 -> "}"
    * f17 -> "}"
    */
   public void visit(MainClass n, A argu);

   /**
    * f0 -> ClassDeclaration()
    *       | ClassExtendsDeclaration()
    */
   public void visit(TypeDeclaration n, A argu);

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( VarDeclaration() )*
    * f4 -> ( MethodDeclaration() )*
    * f5 -> "}"
    */
   public void visit(ClassDeclaration n, A argu);

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "extends"
    * f3 -> Identifier()
    * f4 -> "{"
    * f5 -> ( VarDeclaration() )*
    * f6 -> ( MethodDeclaration() )*
    * f7 -> "}"
    */
   public void visit(ClassExtendsDeclaration n, A argu);

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public void visit(VarDeclaration n, A argu);

   /**
    * f0 -> "public"
    * f1 -> Type()
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( FormalParameterList() )?
    * f5 -> ")"
    * f6 -> "{"
    * f7 -> ( VarDeclaration() )*
    * f8 -> ( Statement() )*
    * f9 -> "return"
    * f10 -> Identifier()
    * f11 -> ";"
    * f12 -> "}"
    */
   public void visit(MethodDeclaration n, A argu);

   /**
    * f0 -> FormalParameter()
    * f1 -> ( FormalParameterRest() )*
    */
   public void visit(FormalParameterList n, A argu);

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    */
   public void visit(FormalParameter n, A argu);

   /**
    * f0 -> ","
    * f1 -> FormalParameter()
    */
   public void visit(FormalParameterRest n, A argu);

   /**
    * f0 -> ArrayType()
    *       | BooleanType()
    *       | IntegerType()
    *       | Identifier()
    */
   public void visit(Type n, A argu);

   /**
    * f0 -> "int"
    * f1 -> "["
    * f2 -> "]"
    */
   public void visit(ArrayType n, A argu);

   /**
    * f0 -> "boolean"
    */
   public void visit(BooleanType n, A argu);

   /**
    * f0 -> "int"
    */
   public void visit(IntegerType n, A argu);

   /**
    * f0 -> Block()
    *       | AssignmentStatements()
    *       | IfStatement()
    *       | WhileStatement()
    *       | ForStatement()
    *       | PrintStatement()
    */
   public void visit(Statement n, A argu);

   /**
    * f0 -> ( LICAnn() )?
    * f1 -> ( AssignmentStatement() | ArrayAssignmentStatement() | FieldAssignmentStatement() )
    */
   public void visit(AssignmentStatements n, A argu);

   /**
    * f0 -> <SCOMMENT1>
    * f1 -> <LIC>
    * f2 -> <SCOMMENT2>
    */
   public void visit(LICAnn n, A argu);

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public void visit(Block n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public void visit(AssignmentStatement n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "["
    * f2 -> Identifier()
    * f3 -> "]"
    * f4 -> "="
    * f5 -> ConstOrId()
    * f6 -> ";"
    */
   public void visit(ArrayAssignmentStatement n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "="
    * f4 -> Identifier()
    * f5 -> ";"
    */
   public void visit(FieldAssignmentStatement n, A argu);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> "else"
    * f6 -> Statement()
    */
   public void visit(IfStatement n, A argu);

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public void visit(WhileStatement n, A argu);

   /**
    * f0 -> ( LoopAnnotation() )?
    * f1 -> "for"
    * f2 -> "("
    * f3 -> Identifier()
    * f4 -> "="
    * f5 -> Expression()
    * f6 -> ";"
    * f7 -> Expression()
    * f8 -> ";"
    * f9 -> Identifier()
    * f10 -> "="
    * f11 -> Expression()
    * f12 -> ")"
    * f13 -> Statement()
    */
   public void visit(ForStatement n, A argu);

   /**
    * f0 -> IndependentIters()
    */
   public void visit(LoopAnnotation n, A argu);

   /**
    * f0 -> <SCOMMENT1>
    * f1 -> <INDEPENDENTITERS>
    * f2 -> <SCOMMENT2>
    */
   public void visit(IndependentIters n, A argu);

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> ";"
    */
   public void visit(PrintStatement n, A argu);

   /**
    * f0 -> AndExpression()
    *       | CompareExpression()
    *       | PlusExpression()
    *       | MinusExpression()
    *       | TimesExpression()
    *       | ArrayLookup()
    *       | ArrayLength()
    *       | MessageSend()
    *       | PrimaryExpression()
    */
   public void visit(Expression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "&"
    * f2 -> Identifier()
    */
   public void visit(AndExpression n, A argu);

   /**
    * f0 -> ConstOrId()
    * f1 -> "<"
    * f2 -> ConstOrId()
    */
   public void visit(CompareExpression n, A argu);

   /**
    * f0 -> ConstOrId()
    * f1 -> "+"
    * f2 -> ConstOrId()
    */
   public void visit(PlusExpression n, A argu);

   /**
    * f0 -> ConstOrId()
    * f1 -> "-"
    * f2 -> ConstOrId()
    */
   public void visit(MinusExpression n, A argu);

   /**
    * f0 -> ConstOrId()
    * f1 -> "*"
    * f2 -> ConstOrId()
    */
   public void visit(TimesExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "["
    * f2 -> Identifier()
    * f3 -> "]"
    */
   public void visit(ArrayLookup n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "length"
    */
   public void visit(ArrayLength n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( ArgList() )?
    * f5 -> ")"
    */
   public void visit(MessageSend n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ( ArgRest() )*
    */
   public void visit(ArgList n, A argu);

   /**
    * f0 -> ","
    * f1 -> Identifier()
    */
   public void visit(ArgRest n, A argu);

   /**
    * f0 -> IntegerLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | Identifier()
    *       | ThisExpression()
    *       | ArrayAllocationExpression()
    *       | AllocationExpression()
    *       | NotExpression()
    */
   public void visit(PrimaryExpression n, A argu);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n, A argu);

   /**
    * f0 -> "true"
    */
   public void visit(TrueLiteral n, A argu);

   /**
    * f0 -> "false"
    */
   public void visit(FalseLiteral n, A argu);

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n, A argu);

   /**
    * f0 -> Identifier()
    *       | IntegerLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    */
   public void visit(ConstOrId n, A argu);

   /**
    * f0 -> "this"
    */
   public void visit(ThisExpression n, A argu);

   /**
    * f0 -> "new"
    * f1 -> "int"
    * f2 -> "["
    * f3 -> Identifier()
    * f4 -> "]"
    */
   public void visit(ArrayAllocationExpression n, A argu);

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(AllocationExpression n, A argu);

   /**
    * f0 -> "!"
    * f1 -> Identifier()
    */
   public void visit(NotExpression n, A argu);

}

