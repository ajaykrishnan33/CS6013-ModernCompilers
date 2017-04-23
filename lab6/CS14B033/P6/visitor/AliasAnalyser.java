package visitor;
import syntaxtree.*;
import helper.*;
import java.util.*;

public class AliasAnalyser<R, A> implements GJVisitor<R, A> {
    //
    // Auto class visitors--probably don't need to be overridden.
    //
    public R visit(NodeList n, A argu) {
        R _ret = null;
        int _count = 0;
        for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this, argu);
            _count++;
        }
        return _ret;
    }

    public R visit(NodeListOptional n, A argu) {
        if ( n.present() ) {
            R _ret = null;
            int _count = 0;
            for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
                e.nextElement().accept(this, argu);
                _count++;
            }
            return _ret;
        } else
            return null;
    }

    public R visit(NodeOptional n, A argu) {
        if ( n.present() )
            return n.node.accept(this, argu);
        else
            return null;
    }

    public R visit(NodeSequence n, A argu) {
        R _ret = null;
        int _count = 0;
        for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this, argu);
            _count++;
        }
        return _ret;
    }

    public R visit(NodeToken n, A argu) { return null; }

    //
    // User-generated visitor methods below
    //

    /**
     * f0 -> MainClass()
     * f1 -> ( TypeDeclaration() )*
     * f2 -> <EOF>
     */
    public R visit(Goal n, A argu) {
        R _ret = null;
        
        argu = (A)"build";
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);

        // now perform alias analysis
        GlobalSymTab.Analyse(this);

        return _ret;
    }

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
     * f15 -> ( QStatement() )*
     * f16 -> "}"
     * f17 -> "}"
     */
    public R visit(MainClass n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        String main_class = n.f1.accept(this, argu).toString();

        GlobalSymTab.currentClass = GlobalSymTab.addClass(main_class);

        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
        n.f6.accept(this, argu);

        GlobalSymTab.currentFunc = GlobalSymTab.currentClass.addFunction("main", null);

        n.f7.accept(this, argu);
        n.f8.accept(this, argu);
        n.f9.accept(this, argu);
        n.f10.accept(this, argu);
        n.f11.accept(this, argu);
        n.f12.accept(this, argu);
        n.f13.accept(this, argu);
        n.f14.accept(this, argu);
        n.f15.accept(this, argu);
        n.f16.accept(this, argu);
        
        GlobalSymTab.currentFunc = null;

        n.f17.accept(this, argu);

        GlobalSymTab.currentClass = null;

        return _ret;
    }

    /**
     * f0 -> ClassDeclaration()
     *       | ClassExtendsDeclaration()
     */
    public R visit(TypeDeclaration n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "class"
     * f1 -> Identifier()
     * f2 -> "{"
     * f3 -> ( VarDeclaration() )*
     * f4 -> ( MethodDeclaration() )*
     * f5 -> "}"
     */
    public R visit(ClassDeclaration n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        String name = n.f1.accept(this, argu).toString();
        n.f2.accept(this, argu);

        GlobalSymTab.currentClass = GlobalSymTab.addClass(name);

        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);

        GlobalSymTab.currentClass = null;
        return _ret;
    }

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
    public R visit(ClassExtendsDeclaration n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        String name = n.f1.accept(this, argu).toString();
        n.f2.accept(this, argu);
        String parent = n.f3.accept(this, argu).toString();
        n.f4.accept(this, argu);

        GlobalSymTab.currentClass = GlobalSymTab.addClass(name, parent);

        n.f5.accept(this, argu);
        n.f6.accept(this, argu);
        n.f7.accept(this, argu);

        GlobalSymTab.currentClass = null;

        return _ret;
    }

    /**
     * f0 -> Type()
     * f1 -> Identifier()
     * f2 -> ";"
     */
    public R visit(VarDeclaration n, A argu) {
        R _ret = null;
        String type = n.f0.accept(this, argu).toString();
        String id = n.f1.accept(this, argu).toString();
        n.f2.accept(this, argu);

        if(GlobalSymTab.currentFunc!=null){
            GlobalSymTab.currentFunc.addVariable(id, type);
        }
        else
        if(GlobalSymTab.currentClass!=null){
            GlobalSymTab.currentClass.addVariable(id, type);
        }

        return _ret;
    }

    /**
     * f0 -> "public"
     * f1 -> Type()
     * f2 -> Identifier()
     * f3 -> "("
     * f4 -> ( FormalParameterList() )?
     * f5 -> ")"
     * f6 -> "{"
     * f7 -> ( VarDeclaration() )*
     * f8 -> ( QStatement() )*
     * f9 -> "return"
     * f10 -> Identifier()
     * f11 -> ";"
     * f12 -> "}"
     */
    public R visit(MethodDeclaration n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        String return_type = n.f1.accept(this, argu).toString();
        String func_name = n.f2.accept(this, argu).toString();

        GlobalSymTab.currentFunc = GlobalSymTab.currentClass.addFunction(func_name, return_type);

        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
        n.f6.accept(this, argu);
        n.f7.accept(this, argu);
        n.f8.accept(this, argu);
        n.f9.accept(this, argu);
        n.f10.accept(this, argu);
        n.f11.accept(this, argu);
        n.f12.accept(this, argu);

        GlobalSymTab.currentFunc = null;

        return _ret;
    }

    /**
     * f0 -> FormalParameter()
     * f1 -> ( FormalParameterRest() )*
     */
    public R visit(FormalParameterList n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Type()
     * f1 -> Identifier()
     */
    public R visit(FormalParameter n, A argu) {
        R _ret = null;
        String type = n.f0.accept(this, argu).toString();
        String id = n.f1.accept(this, argu).toString();

        GlobalSymTab.currentFunc.addFormalParam(id, type);

        return _ret;
    }

    /**
     * f0 -> ","
     * f1 -> FormalParameter()
     */
    public R visit(FormalParameterRest n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> ArrayType()
     *       | BooleanType()
     *       | IntegerType()
     *       | Identifier()
     */
    public R visit(Type n, A argu) {
        R _ret = null;
        _ret = n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "int"
     * f1 -> "["
     * f2 -> "]"
     */
    public R visit(ArrayType n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        _ret = (R)"int[]";
        return _ret;
    }

    /**
     * f0 -> "boolean"
     */
    public R visit(BooleanType n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        _ret = (R)"boolean";
        return _ret;
    }

    /**
     * f0 -> "int"
     */
    public R visit(IntegerType n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        _ret = (R)"int";
        return _ret;
    }

    /**
     * f0 -> ( Query() )*
     * f1 -> Statement()
     */
    public R visit(QStatement n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> <SCOMMENT1>
     * f1 -> Identifier()
     * f2 -> "alias?"
     * f3 -> Identifier()
     * f4 -> <SCOMMENT2>
     */
    public R visit(Query n, A argu) {
        R _ret = null;

        n.f0.accept(this, argu);
        String x = n.f1.accept(this, argu).toString();
        n.f2.accept(this, argu);
        String y = n.f3.accept(this, argu).toString();
        n.f4.accept(this, argu);

        AliasQuery q = GlobalSymTab.currentFunc.addAliasQuery(x, y);
        n.query = q;

        return _ret;
    }

    /**
     * f0 -> Block()
     *       | AssignmentStatement()
     *       | ArrayAssignmentStatement()
     *       | FieldAssignmentStatement()
     *       | IfStatement()
     *       | WhileStatement()
     *       | ForStatement()
     *       | PrintStatement()
     */
    public R visit(Statement n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "{"
     * f1 -> ( QStatement() )*
     * f2 -> "}"
     */
    public R visit(Block n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "="
     * f2 -> Expression()
     * f3 -> ";"
     */
    public R visit(AssignmentStatement n, A argu) {
        R _ret = null;
        // n.f0.accept(this, argu);
        // n.f1.accept(this, argu);
        // n.f2.accept(this, argu);
        // n.f3.accept(this, argu);

        if(argu.toString().equals("build")){
            GlobalSymTab.currentFunc.addBlockLine(n);
            n.f2.accept(this, argu);
        }
        else
        if(argu.toString().equals("eval")){
            String id = n.f0.accept(this, argu).toString();
            R val = n.f2.accept(this, argu);
            if(val==null){
                return null;
            }
            else
            if(GlobalSymTab.userDefinedType(id) || ((ArrayList<Object>)val).get(0).toString().equals("2"))
            {
                ArrayList<Object> res = new ArrayList<Object>();

                if(GlobalSymTab.currentFunc.variables.containsKey(id)){
                    res.add("assgn");
                }
                else
                {
                    res.add("fieldassgn");
                    res.add("this");
                }
                res.add(id);
                res.add(val);
                _ret = (R)res;
            }
        }


        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "["
     * f2 -> Identifier()
     * f3 -> "]"
     * f4 -> "="
     * f5 -> Identifier()
     * f6 -> ";"
     */
    public R visit(ArrayAssignmentStatement n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
        n.f6.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "."
     * f2 -> Identifier()
     * f3 -> "="
     * f4 -> Identifier()
     * f5 -> ";"
     */
    public R visit(FieldAssignmentStatement n, A argu) {
        R _ret = null;

        if(argu.toString().equals("build")){
            GlobalSymTab.currentFunc.addBlockLine(n);
        }
        else
        if(argu.toString().equals("eval")){
            String id1 = n.f0.accept(this, argu).toString();
            String id2 = n.f2.accept(this, argu).toString();
            String id3 = n.f4.accept(this, argu).toString();

            String type3 = GlobalSymTab.currentFunc.getVariableType(id3);
            if(GlobalSymTab.userDefinedType(type3)){
                ArrayList<Object> res = new ArrayList<Object>();
                res.add("fieldassgn");
                res.add(id1);
                res.add(id2);
                ArrayList<Object> expr = new ArrayList<Object>();
                expr.add("0"); // type 0
                expr.add(id3);
                res.add(expr);
                _ret = (R)res;
            }

        }

        return _ret;
    }

    /**
     * f0 -> "if"
     * f1 -> "("
     * f2 -> Identifier()
     * f3 -> ")"
     * f4 -> Statement()
     * f5 -> "else"
     * f6 -> Statement()
     */
    public R visit(IfStatement n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        
        // BlockLine previous = GlobalSymTab.currentFunc.currentBlock;

        BlockLine entry = GlobalSymTab.currentFunc.addBlockLine(null);

        n.f4.accept(this, argu);
        BlockLine postif = GlobalSymTab.currentFunc.addBlockLine(null);

        n.f5.accept(this, argu);
        
        GlobalSymTab.currentFunc.currentBlock = entry;

        n.f6.accept(this, argu);
        BlockLine postelse = GlobalSymTab.currentFunc.addBlockLine(null);
        
        BlockLine poststmt = GlobalSymTab.currentFunc.addBlockLine(null);
        poststmt.predecessors.add(postif);
        postif.successors.add(poststmt);

        return _ret;
    }

    /**
     * f0 -> "while"
     * f1 -> "("
     * f2 -> Identifier()
     * f3 -> ")"
     * f4 -> Statement()
     */
    public R visit(WhileStatement n, A argu) {
        R _ret = null;

        // BlockLine previous = GlobalSymTab.currentFunc.currentBlock;

        BlockLine entry = GlobalSymTab.currentFunc.addBlockLine(null);
        
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);

        n.f4.accept(this, argu);
        BlockLine b = GlobalSymTab.currentFunc.addBlockLine(null);

        b.successors.add(entry);
        entry.predecessors.add(b);

        GlobalSymTab.currentFunc.currentBlock = entry;
        GlobalSymTab.currentFunc.addBlockLine(null);

        return _ret;
    }

    /**
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
    public R visit(ForStatement n, A argu) {
        R _ret = null;

        Node init = new AssignmentStatement(n.f2, n.f4);

        GlobalSymTab.currentFunc.addBlockLine(init);

        BlockLine entry = GlobalSymTab.currentFunc.addBlockLine(null);

        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
        n.f6.accept(this, argu);
        n.f7.accept(this, argu);
        n.f8.accept(this, argu);
        n.f9.accept(this, argu);
        n.f10.accept(this, argu);
        n.f11.accept(this, argu);
        n.f12.accept(this, argu);

        Node update = new AssignmentStatement(n.f8, n.f10);
        BlockLine upd = GlobalSymTab.currentFunc.addBlockLine(update);

        upd.successors.add(entry);
        entry.predecessors.add(upd);

        GlobalSymTab.currentFunc.currentBlock = entry;

        GlobalSymTab.currentFunc.addBlockLine(null); // exit


        return _ret;
    }

    /**
     * f0 -> "System.out.println"
     * f1 -> "("
     * f2 -> Identifier()
     * f3 -> ")"
     * f4 -> ";"
     */
    public R visit(PrintStatement n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> AndExpression()
     *       | CompareExpression()
     *       | PlusExpression()
     *       | MinusExpression()
     *       | TimesExpression()
     *       | ArrayLookup()
     *       | ArrayLength()
     *       | MessageSend()
     *       | FieldRead()
     *       | PrimaryExpression()
     */
    public R visit(Expression n, A argu) {
        R _ret = null;

        if(argu.toString().equals("eval")){
            if(n.f0.which==9){
                ArrayList<Object> res = new ArrayList<Object>();
                switch(((PrimaryExpression)n.f0.choice).f0.which){
                    case 3: // Identifier
                    res.add("0"); // type 0
                    res.add(((PrimaryExpression)n.f0.choice).f0.choice.accept(this, argu).toString());
                    _ret = (R)res;
                    break;
                    case 4: // This
                    res.add("3"); // type 3
                    _ret = (R)res;
                    break;
                    case 6: // Allocation
                    res.add("4"); // type 4
                    String x = ((PrimaryExpression)n.f0.choice).f0.choice.accept(this, argu).toString();
                    String ref = x.substring(0, x.indexOf('|'));
                    String type = x.substring(x.indexOf('|')+1);
                    res.add(ref);
                    res.add(type);
                    _ret = (R)res;
                    break;
                }
                return _ret;
            }

            _ret = n.f0.accept(this, argu);    
        }
        else
            n.f0.accept(this, argu);
        
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "&"
     * f2 -> Identifier()
     */
    public R visit(AndExpression n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "<"
     * f2 -> Identifier()
     */
    public R visit(CompareExpression n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "+"
     * f2 -> Identifier()
     */
    public R visit(PlusExpression n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "-"
     * f2 -> Identifier()
     */
    public R visit(MinusExpression n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "*"
     * f2 -> Identifier()
     */
    public R visit(TimesExpression n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "["
     * f2 -> Identifier()
     * f3 -> "]"
     */
    public R visit(ArrayLookup n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "."
     * f2 -> "length"
     */
    public R visit(ArrayLength n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "."
     * f2 -> Identifier()
     */
    public R visit(FieldRead n, A argu) {
        R _ret = null;
        if(argu.toString().equals("eval")){

            String id1 = n.f0.accept(this, argu).toString();
            String id2 = n.f2.accept(this, argu).toString();

            ArrayList<Object> res = new ArrayList<Object>();
            res.add("1"); // type 1
            res.add(id1);
            res.add(id2);

            _ret = (R)res;
        }        
        return _ret;
    }

    /**
     * f0 -> PrimaryExpression()
     * f1 -> "."
     * f2 -> Identifier()
     * f3 -> "("
     * f4 -> ( ArgList() )?
     * f5 -> ")"
     */
    public R visit(MessageSend n, A argu) {
        R _ret = null;
        if(argu.toString().equals("eval")){
            R val = n.f0.accept(this, argu);
            if(val==null){
                System.err.println("Error! Empty PrimaryExpression");
                System.exit(0);
            }
            String func = n.f2.accept(this, argu).toString();
            ArrayList<String> args = (ArrayList<String>)n.f4.accept(this, argu);
            ArrayList<Object> res =  new ArrayList<Object>();
            res.add("2"); //type 2
            res.add((ArrayList<String>)val);
            res.add(func);
            res.add(args);
            _ret = (R)res;
        }
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> ( ArgRest() )*
     */
    public R visit(ArgList n, A argu) {
        R _ret = null;
        ArrayList<String> res = new ArrayList<String>();
        String id = n.f0.accept(this, argu).toString();
        // n.f1.accept(this, argu);
        res.add(id);
        if(n.f1.present()){
            for(int i=0;i<n.f1.size();i++){
                res.add(n.f1.elementAt(i).toString());
            }
        }
        _ret = (R)res;
        return _ret;
    }

    /**
     * f0 -> ","
     * f1 -> Identifier()
     */
    public R visit(ArgRest n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        _ret = n.f1.accept(this, argu);
        return _ret;
    }

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
    public R visit(PrimaryExpression n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);

        if(argu.toString().equals("eval")){
            ArrayList<String> res = new ArrayList<String>();
            switch(n.f0.which){
                case 3:
                res.add("identifier");
                res.add(n.f0.choice.accept(this, argu).toString());
                break;
                case 4:
                res.add("this");
                // res.add(n.f0.choice.accept(this, argu).toString());
                break;
                case 6:
                res.add("allocation");
                String x = n.f0.choice.accept(this, argu).toString();
                String ref = x.substring(0, x.indexOf('|'));
                String type = x.substring(x.indexOf('|')+1);
                res.add(ref);
                res.add(type);
                break;
            }
            _ret = (R)res;    
        }
        
        return _ret;
    }

    /**
     * f0 -> <INTEGER_LITERAL>
     */
    public R visit(IntegerLiteral n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "true"
     */
    public R visit(TrueLiteral n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "false"
     */
    public R visit(FalseLiteral n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> <IDENTIFIER>
     */
    public R visit(Identifier n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        _ret = (R)n.f0.tokenImage;
        return _ret;
    }

    /**
     * f0 -> "this"
     */
    public R visit(ThisExpression n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        _ret = (R)"this";
        return _ret;
    }

    /**
     * f0 -> "new"
     * f1 -> "int"
     * f2 -> "["
     * f3 -> Identifier()
     * f4 -> "]"
     */
    public R visit(ArrayAllocationExpression n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "new"
     * f1 -> Identifier()
     * f2 -> "("
     * f3 -> ")"
     */
    public R visit(AllocationExpression n, A argu) {
        R _ret = null;

        // n.f0.accept(this, argu);
        // n.f1.accept(this, argu);
        // n.f2.accept(this, argu);
        // n.f3.accept(this, argu);

        if(argu.toString().equals("build")){
            n.reference = GlobalSymTab.nextReference();
        }
        else
        if(argu.toString().equals("eval")){
            // if(n.reference!=null)
            //     n.reference = GlobalSymTab.nextReference();
            String type = n.f1.accept(this, argu).toString();
            _ret = (R)(n.reference+"|"+type);
        }

        return _ret;
    }

    /**
     * f0 -> "!"
     * f1 -> Identifier()
     */
    public R visit(NotExpression n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
    }

}
