package visitor;
import syntaxtree.*;
import java.util.*;
import helper.*;

public class FunctionInliner<R, A> implements GJVisitor<R, A> {
    //
    // Auto class visitors--probably don't need to be overridden.
    //

    ClassSymTab currentClass;
    FuncSymTab currentFunc;
    Inline currentInline;

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

    public R visit(NodeToken n, A argu) { 
        if(argu.toString().equals("print") || argu.toString().equals("printinline")){
            System.out.print(n.tokenImage + " ");
            if(n.tokenImage.equals(";")||n.tokenImage.equals("{")||n.tokenImage.equals("}"))
                System.out.println();
        }
        return null; 
    }

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

        GlobalSymTab.renameAll();

        argu = (A)"inline";
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);

        GlobalSymTab.inlineAll();
        // GlobalSymTab.printDebug();

        argu = (A)"print";
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);        

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
     * f15 -> ( Statement() )*
     * f16 -> "}"
     * f17 -> "}"
     */
    public R visit(MainClass n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        String class_name = n.f1.accept(this, argu).toString();

        this.currentClass = GlobalSymTab.addClass(class_name);
        this.currentFunc = this.currentClass.addFunction("main", "void", null);

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
        n.f13.accept(this, argu);
        
        // n.f14.accept(this, argu);
        if(argu.toString().equals("print")){
            for(Map.Entry<String, String> entry: this.currentFunc.variables.entrySet()){
                System.out.println(entry.getValue() + " " + this.currentFunc.getLocalVariableName(entry.getKey()) + " ; ");
            }
            // declaring some temporary variables for future use
            GlobalSymTab.createTemporaries();
        }
        else
            n.f14.accept(this, argu);

        n.f15.accept(this, argu);
        n.f16.accept(this, argu);
        n.f17.accept(this, argu);

        this.currentFunc = null;
        this.currentClass = null;

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
        String class_name = n.f1.accept(this, argu).toString();
        n.f2.accept(this, argu);

        this.currentClass = GlobalSymTab.addClass(class_name);

        n.f3.accept(this, argu);
        n.f4.accept(this, argu);

        n.f5.accept(this, argu);

        this.currentClass = null;

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
        String class_name = n.f1.accept(this, argu).toString();
        n.f2.accept(this, argu);
        String parent_name = n.f3.accept(this, argu).toString();
        n.f4.accept(this, argu);

        this.currentClass = GlobalSymTab.addClass(class_name, parent_name);

        n.f5.accept(this, argu);
        n.f6.accept(this, argu);
        n.f7.accept(this, argu);

        this.currentClass = null;

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

        if(argu.toString().equals("build")){
            if(this.currentFunc!=null){
                this.currentFunc.addVariable(id, type);
            }
            else
            if(this.currentClass!=null){
                this.currentClass.addVariable(id, type);
            }
        }

        n.f2.accept(this, argu);
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
     * f8 -> ( Statement() )*
     * f9 -> "return"
     * f10 -> Identifier()
     * f11 -> ";"
     * f12 -> "}"
     */
    public R visit(MethodDeclaration n, A argu) {
        R _ret = null;

        if(!argu.toString().equals("printinline")){
            n.f0.accept(this, argu);
            String return_type = n.f1.accept(this, argu).toString();
            String func_name = n.f2.accept(this, argu).toString();

            this.currentFunc = this.currentClass.addFunction(func_name, return_type, n);

            n.f3.accept(this, argu);
            n.f4.accept(this, argu);
            n.f5.accept(this, argu);

            n.f6.accept(this, argu);

            if(argu.toString().equals("print")){
                for(Map.Entry<String, String> entry: this.currentFunc.variables.entrySet()){
                    if(!this.currentFunc.formal_params.contains(entry.getKey()))
                        System.out.println(entry.getValue() + " " + this.currentFunc.getLocalVariableName(entry.getKey()) + " ; ");
                }
                // declaring some temporary variables for future use
                GlobalSymTab.createTemporaries();
            }
            else
                n.f7.accept(this, argu);

            n.f8.accept(this, argu);
            n.f9.accept(this, argu);
            n.f10.accept(this, argu);
            n.f11.accept(this, argu);
            n.f12.accept(this, argu);

            this.currentFunc = null;
        }
        else
        {
            Inline temp = GlobalSymTab.inlining.pop();
            String rhs = GlobalSymTab.getVariableSource(this.currentFunc, this.currentInline.target);
            GlobalSymTab.inlining.push(temp);
            if(rhs==null){
                if(this.currentInline.target.equals("this"))
                    rhs = GlobalSymTab.resolveThis(this.currentFunc);
                else    
                    rhs = this.currentInline.target;
            }
            System.out.println(GlobalSymTab.getVariableSource(this.currentFunc, this.currentInline.classVar) + " = " + rhs + " ; ");
            n.f8.accept(this, argu);
            String ret_id = n.f10.accept(this, (A)"get").toString();
            System.out.println(GlobalSymTab.getVariableSource(this.currentFunc, this.currentInline.retVar) + " = " + ret_id + " ; ");

        }

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

        if(argu.toString().equals("build"))
            this.currentFunc.addFormalParameter(id, type);

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
        _ret = (R)"intarr";
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
     * f0 -> Block()
     *       | AssignmentStatement()
     *       | ArrayAssignmentStatement()
     *       | FieldAssignmentStatement()
     *       | IfStatement()
     *       | WhileStatement()
     *       | ForStatement()
     *       | PrintStatement()
     *       | MessageSendStatement()
     */
    public R visit(Statement n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "{"
     * f1 -> ( Statement() )*
     * f2 -> "}"
     */
    public R visit(Block n, A argu) {
        R _ret = null;
        // n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        // n.f2.accept(this, argu);
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
        if(argu.toString().equals("print")||argu.toString().equals("printinline")){
            String id = n.f0.accept(this, (A)"get").toString();

            int pos = id.indexOf('.');
            if(pos>=0){
                String type = this.currentFunc.getVariableType(id.substring(0, pos));
                String field_type;
                if(GlobalSymTab.classes.containsKey(type))
                    field_type = GlobalSymTab.classes.get(type).getVariableType(id.substring(pos+1));
                else
                    field_type = type;
                String temp = GlobalSymTab.getUnusedTemporary(id, field_type);
                String temp2 = n.f2.accept(this, argu).toString();
                System.out.println(temp + " = " + temp2 + "; \n" + id + " = " + temp +";");
                GlobalSymTab.freeTemporary(temp);
                GlobalSymTab.freeTemporary(temp2);
            }
            else{
                String temp = n.f2.accept(this, argu).toString();
                System.out.println(id + " = " + temp + ";");
                GlobalSymTab.freeTemporary(temp);
            }
            return _ret;
        }
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
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

        if(argu.toString().equals("print") || argu.toString().equals("printinline")){
            String id = n.f0.accept(this, (A)"get").toString();
            String temp1 = null;
            if(id.indexOf('.')>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "intarr");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            // index
            String index = n.f2.accept(this, (A)"get").toString();
            String temp2 = null;
            if(index.indexOf('.')>=0){
                temp2 = GlobalSymTab.getUnusedTemporary(index, "int");
                System.out.println(temp2 + " = " + index + ";");
                index = temp2;
            }

            // rhs
            String rhs = n.f5.accept(this, (A)"get").toString();
            String temp3 = null;
            if(rhs.indexOf('.')>=0){
                temp3 = GlobalSymTab.getUnusedTemporary(rhs, "int");
                System.out.println(temp3 + " = " + rhs + ";");
                rhs = temp3;
            }

            System.out.println(id + "[" + index + "] = " + rhs + ";");

            GlobalSymTab.freeTemporary(id);
            GlobalSymTab.freeTemporary(index);
            GlobalSymTab.freeTemporary(rhs);

            return _ret;
        }

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

        if(argu.toString().equals("print") || argu.toString().equals("printinline")){
            String id = n.f0.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                String type = this.currentFunc.getVariableType(id.substring(0, pos));
                String field_type;
                if(GlobalSymTab.classes.containsKey(type))
                    field_type = GlobalSymTab.classes.get(type).getVariableType(id.substring(pos+1));
                else
                    field_type = type;

                temp1 = GlobalSymTab.getUnusedTemporary(id, field_type);
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            // index
            String index = n.f2.accept(this, (A)"get").toString();
            String temp2 = null;
            pos = index.indexOf('.');
            if(pos>=0){
                String type = this.currentFunc.getVariableType(index.substring(0, pos));
                String field_type;
                if(GlobalSymTab.classes.containsKey(type))
                    field_type = GlobalSymTab.classes.get(type).getVariableType(index.substring(pos+1));
                else
                    field_type = type;

                temp2 = GlobalSymTab.getUnusedTemporary(index, field_type);
                System.out.println(temp2 + " = " + index + ";");
                index = temp2;
            }

            // rhs
            String rhs = n.f5.accept(this, (A)"get").toString();
            String temp3 = null;
            pos = rhs.indexOf('.'); 
            if(pos>=0){
                String type = this.currentFunc.getVariableType(index.substring(0, pos));
                String field_type;
                if(GlobalSymTab.classes.containsKey(type))
                    field_type = GlobalSymTab.classes.get(type).getVariableType(index.substring(pos+1));
                else
                    field_type = type;

                temp3 = GlobalSymTab.getUnusedTemporary(rhs, field_type);
                System.out.println(temp3 + " = " + rhs + ";");
                rhs = temp3;
            }

            System.out.println(id + "." + index + " = " + rhs + ";");

            GlobalSymTab.freeTemporary(id);
            GlobalSymTab.freeTemporary(index);
            GlobalSymTab.freeTemporary(rhs);

            return _ret;
        }

        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
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

        if(argu.toString().equals("print") || argu.toString().equals("printinline")){

            String id = n.f2.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "boolean");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }
            
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);

            System.out.print(id);
            GlobalSymTab.freeTemporary(id);

            n.f3.accept(this, argu);
            System.out.println("{");
            n.f4.accept(this, argu);
            System.out.println("}");
            n.f5.accept(this, argu);
            System.out.println("{");
            n.f6.accept(this, argu);
            System.out.println("}");            

            return _ret;
        }

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
     * f0 -> "while"
     * f1 -> "("
     * f2 -> Identifier()
     * f3 -> ")"
     * f4 -> Statement()
     */
    public R visit(WhileStatement n, A argu) {
        R _ret = null;

        if(argu.toString().equals("print") || argu.toString().equals("printinline")){

            String id = n.f2.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "boolean");
                System.out.println(temp1 + " = " + id + ";");
            }
            
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);

            if(pos>=0){
                System.out.print(temp1);
                GlobalSymTab.freeTemporary(temp1);
            }
            else{
                System.out.print(id);
            }

            n.f3.accept(this, argu);
            System.out.println("{");
            n.f4.accept(this, argu);
            
            if(pos>=0 && GlobalSymTab.getSpecificTemporary(temp1)){
                System.out.println(temp1 + " = " + id + ";");
                GlobalSymTab.freeTemporary(temp1);
            }

            System.out.println("}");   

            return _ret;
        }

        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
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

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){
            String id = n.f2.accept(this, (A)"get").toString();

            int pos = id.indexOf('.');
            if(pos>=0){
                String type = this.currentFunc.getVariableType(id.substring(0, pos));
                String field_type;
                if(GlobalSymTab.classes.containsKey(type))
                    field_type = GlobalSymTab.classes.get(type).getVariableType(id.substring(pos+1));
                else
                    field_type = type;
                String temp1 = GlobalSymTab.getUnusedTemporary(id, field_type);
                String temp2 = n.f4.accept(this, argu).toString();
                
                System.out.println(temp1 + " = " + temp2 + "; \n" + id + " = " + temp1 +";");
                GlobalSymTab.freeTemporary(temp1);
                GlobalSymTab.freeTemporary(temp2);

            }
            else{
                String temp = n.f4.accept(this, argu).toString();
                System.out.println(id + " = " + temp + ";");
                GlobalSymTab.freeTemporary(temp);
            }

            String temp3 = n.f6.accept(this, argu).toString();
            System.out.println("while("+temp3+") {");
            GlobalSymTab.freeTemporary(temp3);
            n.f12.accept(this, argu);

            String id2 = n.f8.accept(this, (A)"get").toString();
            pos = id2.indexOf(".");
            if(pos>=0){
                String type = this.currentFunc.getVariableType(id2.substring(0, pos));
                String field_type;
                if(GlobalSymTab.classes.containsKey(type))
                    field_type = GlobalSymTab.classes.get(type).getVariableType(id2.substring(pos+1));
                else
                    field_type = type;
                String temp1 = GlobalSymTab.getUnusedTemporary(id2, field_type);
                String temp2 = n.f10.accept(this, argu).toString();
                
                System.out.println(temp1 + " = " + temp2 + "; \n" + id + " = " + temp1 +";");
                GlobalSymTab.freeTemporary(temp1);
                GlobalSymTab.freeTemporary(temp2);
            }
            else{
                String temp = n.f10.accept(this, argu).toString();
                System.out.println(id + " = " + temp + ";");
                GlobalSymTab.freeTemporary(temp);
            }

            String temp4 = n.f6.accept(this, argu).toString();

            if(GlobalSymTab.getSpecificTemporary(temp3)){
                System.out.println(temp3 + " = " + temp4 + ";");
            }
            GlobalSymTab.freeTemporary(temp3);
            GlobalSymTab.freeTemporary(temp4);

            System.out.println("}");

            return _ret;
        }

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

        if(argu.toString().equals("print") || argu.toString().equals("printinline")){

            String id = n.f2.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                String type = this.currentFunc.getVariableType(id.substring(0, pos));
                String field_type;
                if(GlobalSymTab.classes.containsKey(type))
                    field_type = GlobalSymTab.classes.get(type).getVariableType(id.substring(pos+1));
                else
                    field_type = type;

                temp1 = GlobalSymTab.getUnusedTemporary(id, field_type);
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }
            
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);

            System.out.print(id);
            GlobalSymTab.freeTemporary(id);

            n.f3.accept(this, argu);
            n.f4.accept(this, argu);

            return _ret;
        }

        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> ( InlineAnn() )?
     * f1 -> ( VoidMessageSendStmt() | RetMessageSendStmt() )
     */
    public R visit(MessageSendStatement n, A argu) {
        R _ret = null;

        if(argu.toString().equals("inline")){
            if(n.f0.present())
                argu = (A)"true";
            else
                argu = (A)"false";   
        }

        if(argu.toString().equals("print") && n.f0.present()){
            argu = (A)"printinline";
        }

        // n.f0.accept(this, argu);
        n.f1.accept(this, argu);

        return _ret;
    }

    /**
     * f0 -> MessageSend()
     * f1 -> ";"
     */
    public R visit(VoidMessageSendStmt n, A argu) {
        R _ret = null;
        if(argu.toString().equals("printinline")){
            R val = n.f0.accept(this, (A)"printinline");
            if(val==null){ // not inlinable
                argu = (A)"print";
            }
            else{ // inlinable
                return _ret;
            }
        }

        n.f0.accept(this, argu);
        n.f1.accept(this, argu);

        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "="
     * f2 -> MessageSend()
     * f3 -> ";"
     */
    public R visit(RetMessageSendStmt n, A argu) {
        R _ret = null;
        if(argu.toString().equals("printinline")){
            R val = n.f2.accept(this, (A)"printinline");
            if(val==null){ // not inlinable
                argu = (A)"print";
            }
            else
            {
                String res = val.toString();
                String id = n.f0.accept(this, (A)"get").toString();

                String temp1 = null;
                int pos = id.indexOf('.');
                if(pos>=0){
                    String type = this.currentFunc.getVariableType(id.substring(0, pos));
                    String field_type;
                    if(GlobalSymTab.classes.containsKey(type))
                        field_type = GlobalSymTab.classes.get(type).getVariableType(id.substring(pos+1));
                    else
                        field_type = type;
                    temp1 = GlobalSymTab.getUnusedTemporary(id, field_type);
                    
                    System.out.println(temp1 + " = " + res + "; \n" + id + " = " + temp1 +";");
                    GlobalSymTab.freeTemporary(temp1);
                }
                else{
                    System.out.println(id + " = " + res + ";");
                }

                return _ret;
            }
        }

        if(argu.toString().equals("print")){
            String id = n.f0.accept(this, (A)"get").toString();

            int pos = id.indexOf('.');
            if(pos>=0){
                String type = this.currentFunc.getVariableType(id.substring(0, pos));
                String field_type;
                if(GlobalSymTab.classes.containsKey(type))
                    field_type = GlobalSymTab.classes.get(type).getVariableType(id.substring(pos+1));
                else
                    field_type = type;
                String temp1 = GlobalSymTab.getUnusedTemporary(id, field_type);
                String msg = n.f2.accept(this, argu).toString();
                System.out.print(temp1 + " = " + msg + ";");
                System.out.println(id + " = " + temp1 +";");
                GlobalSymTab.freeTemporary(temp1);
            }
            else{
                String msg = n.f2.accept(this, argu).toString();
                System.out.println(id + " = " + msg +";");
            }
            return _ret;
        }

        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);

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

        if(argu.toString().equals("print")){
            String prim = n.f0.accept(this, argu).toString();
            String name = n.f2.accept(this, (A)"get").toString();
            String class_type = prim.substring(0, prim.lastIndexOf("temp")-1);

            String ret_type = GlobalSymTab.classes.get(class_type).getFunction(name).return_type;

            String temp = GlobalSymTab.getUnusedTemporary(null, ret_type);
            System.out.print(temp + " = " + prim + "." + name + "(");
            n.f4.accept(this, argu);
            System.out.println(");");
            _ret = (R)temp;
            return _ret;
        }
        else
        if(argu.toString().equals("true")){
            String prim = n.f0.accept(this, argu).toString();
            String name = n.f2.accept(this, argu).toString();

            if(argu.toString().equals("true")){
                String type = "";
                if(prim.equals("this")){
                    type = this.currentClass.name;
                }
                else
                if(GlobalSymTab.classes.containsKey(prim)){
                    type = prim;
                    prim = "new "  + prim + "()";
                }
                else{
                    type = this.currentFunc.getVariableType(prim);
                }
                n.inline = this.currentFunc.addInline(type, name, prim);
            }

            _ret = (R)prim;

            return _ret;
        }
        else
        if(argu.toString().equals("printinline"))
        {
            Inline in = n.inline;

            if(in==null || !in.inlinable)
                return null;

            if(GlobalSymTab.inlining_funcs.contains(in.f))
                return null;

            ArrayList<String> args = null;
            if(n.f4.present())
                args = (ArrayList<String>)n.f4.accept(this, (A)"get");

            GlobalSymTab.inlining_funcs.push(in.f);
            GlobalSymTab.inlining.push(in);

            if(args!=null){
                int i;
                for(i=0;i<in.f.formal_params.size();i++){
                    String p = in.f.formal_params.get(i);
                    String x = GlobalSymTab.getVariableSource(this.currentFunc, p);
                    System.out.println(x+" = "+args.get(i)+";");
                }    
            }

            Inline temp = this.currentInline;
            this.currentInline = in;

            in.ref.accept(this, (A)"printinline");

            this.currentInline = temp;

            _ret = (R)GlobalSymTab.getVariableSource(this.currentFunc, in.retVar);

            GlobalSymTab.inlining.pop();
            GlobalSymTab.inlining_funcs.pop();

            return _ret;
        }

        return _ret;
    }

    /**
     * f0 -> <SCOMMENT1>
     * f1 -> <INLINE>
     * f2 -> <SCOMMENT2>
     */
    public R visit(InlineAnn n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
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
     *       | PrimaryExpression()
     */
    public R visit(Expression n, A argu) {
        R _ret = null;
        _ret = n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "&"
     * f2 -> Identifier()
     */
    public R visit(AndExpression n, A argu) {
        R _ret = null;

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){

            String temp = GlobalSymTab.getUnusedTemporary(null, "boolean");

            String id = n.f0.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "boolean");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            String id2 = n.f2.accept(this, (A)"get").toString();
            String temp2 = null;
            pos = id.indexOf('.');
            if(pos>=0){
                temp2 = GlobalSymTab.getUnusedTemporary(id2, "boolean");
                System.out.println(temp2 + " = " + id2 + ";");
                id2 = temp2;
            }

            System.out.println(temp + " = " + id + " & " + id2 + " ; ");

            _ret = (R)temp;

            GlobalSymTab.freeTemporary(id);
            GlobalSymTab.freeTemporary(id2);

            return _ret;
        }

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

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){

            String temp = GlobalSymTab.getUnusedTemporary(null, "boolean");

            String id = n.f0.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "int");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            String id2 = n.f2.accept(this, (A)"get").toString();
            String temp2 = null;
            pos = id.indexOf('.');
            if(pos>=0){
                temp2 = GlobalSymTab.getUnusedTemporary(id2, "int");
                System.out.println(temp2 + " = " + id2 + ";");
                id2 = temp2;
            }

            System.out.println(temp + " = " + id + " < " + id2 + " ; ");

            _ret = (R)temp;

            GlobalSymTab.freeTemporary(id);
            GlobalSymTab.freeTemporary(id2);

            return _ret;
        }

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

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){

            String temp = GlobalSymTab.getUnusedTemporary(null, "int");

            String id = n.f0.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "int");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            String id2 = n.f2.accept(this, (A)"get").toString();
            String temp2 = null;
            pos = id.indexOf('.');
            if(pos>=0){
                temp2 = GlobalSymTab.getUnusedTemporary(id2, "int");
                System.out.println(temp2 + " = " + id2 + ";");
                id2 = temp2;
            }

            System.out.println(temp + " = " + id + " + " + id2 + " ; ");

            _ret = (R)temp;

            GlobalSymTab.freeTemporary(id);
            GlobalSymTab.freeTemporary(id2);

            return _ret;
        }

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

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){

            String temp = GlobalSymTab.getUnusedTemporary(null, "int");

            String id = n.f0.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "int");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            String id2 = n.f2.accept(this, (A)"get").toString();
            String temp2 = null;
            pos = id.indexOf('.');
            if(pos>=0){
                temp2 = GlobalSymTab.getUnusedTemporary(id2, "int");
                System.out.println(temp2 + " = " + id2 + ";");
                id2 = temp2;
            }

            System.out.println(temp + " = " + id + " - " + id2 + " ; ");

            _ret = (R)temp;

            GlobalSymTab.freeTemporary(id);
            GlobalSymTab.freeTemporary(id2);

            return _ret;
        }

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

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){

            String temp = GlobalSymTab.getUnusedTemporary(null, "int");

            String id = n.f0.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "int");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            String id2 = n.f2.accept(this, (A)"get").toString();
            String temp2 = null;
            pos = id.indexOf('.');
            if(pos>=0){
                temp2 = GlobalSymTab.getUnusedTemporary(id2, "int");
                System.out.println(temp2 + " = " + id2 + ";");
                id2 = temp2;
            }

            System.out.println(temp + " = " + id + " * " + id2 + " ; ");

            _ret = (R)temp;

            GlobalSymTab.freeTemporary(id);
            GlobalSymTab.freeTemporary(id2);

            return _ret;
        }

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

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){

            String temp = GlobalSymTab.getUnusedTemporary(null, "int");

            String id = n.f0.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "intarr");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            String id2 = n.f2.accept(this, (A)"get").toString();
            String temp2 = null;
            pos = id.indexOf('.');
            if(pos>=0){
                temp2 = GlobalSymTab.getUnusedTemporary(id2, "int");
                System.out.println(temp2 + " = " + id2 + ";");
                id2 = temp2;
            }

            System.out.println(temp + " = " + id + " [" + id2 + "] ; ");

            _ret = (R)temp;

            GlobalSymTab.freeTemporary(id);
            GlobalSymTab.freeTemporary(id2);

            return _ret;
        }

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

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){

            String temp = GlobalSymTab.getUnusedTemporary(null, "int");

            String id = n.f0.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "intarr");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            System.out.println(temp + " = " + id + ".length;");

            _ret = (R)temp;
            GlobalSymTab.freeTemporary(id);

            return _ret;
        }

        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> ( ArgRest() )*
     */
    public R visit(ArgList n, A argu) {
        R _ret = null;

        if(argu.toString().equals("get")){
            String id1 = n.f0.accept(this, argu).toString();
            ArrayList<String> args = new ArrayList<String>();
            args.add(id1);
            if(n.f1.present())
            {   
                int i;
                for(i=0;i<n.f1.size();i++){
                    args.add(((ArgRest)n.f1.elementAt(i)).f1.accept(this, argu).toString());
                }
            }
            _ret = (R)args;
        }
        else{
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);
        }

        return _ret;
    }

    /**
     * f0 -> ","
     * f1 -> Identifier()
     */
    public R visit(ArgRest n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
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

        if(n.f0.which==3 && (argu.toString().equals("print") || argu.toString().equals("printinline"))){

            String id = n.f0.accept(this, (A)"get").toString();
            int pos = id.indexOf('.');
            String field_type;
            if(pos>=0){
                String type = this.currentFunc.getVariableType(id.substring(0, pos));
                if(GlobalSymTab.classes.containsKey(type))
                    field_type = GlobalSymTab.classes.get(type).getVariableType(id.substring(pos+1));
                else
                    field_type = type;
            }
            else
            {
                field_type = this.currentFunc.getVariableType(id);
            }
            String temp = GlobalSymTab.getUnusedTemporary(null, field_type);
            System.out.println(temp + " = " + id + ";");
            
            _ret = (R)temp;
            
            return _ret;
        }

        _ret = n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> <INTEGER_LITERAL>
     */
    public R visit(IntegerLiteral n, A argu) {
        R _ret = null;

        if(argu.toString().equals("print") || argu.toString().equals("printinline")){
            String temp = GlobalSymTab.getUnusedTemporary(null, "int");
            System.out.println(temp + " = " + n.f0.tokenImage + ";");
            _ret = (R)temp;
            return _ret;
        }

        n.f0.accept(this, argu);
        _ret = (R)n.f0.tokenImage;
        return _ret;
    }

    /**
     * f0 -> "true"
     */
    public R visit(TrueLiteral n, A argu) {
        R _ret = null;

        if(argu.toString().equals("print") || argu.toString().equals("printinline")){
            String temp = GlobalSymTab.getUnusedTemporary(null, "boolean");
            System.out.println(temp + " = " + n.f0.tokenImage + ";");
            _ret = (R)temp;
            return _ret;
        }

        n.f0.accept(this, argu);
        _ret = (R)"true";
        return _ret;
    }

    /**
     * f0 -> "false"
     */
    public R visit(FalseLiteral n, A argu) {
        R _ret = null;

        if(argu.toString().equals("print") || argu.toString().equals("printinline")){
            String temp = GlobalSymTab.getUnusedTemporary(null, "boolean");
            System.out.println(temp + " = " + n.f0.tokenImage + ";");
            _ret = (R)temp;
            return _ret;
        }

        n.f0.accept(this, argu);
        _ret = (R)"false";
        return _ret;
    }

    /**
     * f0 -> <IDENTIFIER>
     */
    public R visit(Identifier n, A argu) {
        R _ret = null;
        _ret = (R)n.f0.tokenImage;

        // go backwards into the stack and try to find out nearest source of an id

        if(argu.toString().equals("get") || argu.toString().equals("print") || argu.toString().equals("printinline")){
            String var = null;
            if(this.currentFunc!=null){
                var = GlobalSymTab.getVariableSource(this.currentFunc, n.f0.tokenImage);
            }
            else
            if(this.currentClass!=null){
                var = this.currentClass.getVariableName(n.f0.tokenImage);
            }

            if(var==null)
                var = n.f0.tokenImage;

            if(argu.toString().equals("print") || argu.toString().equals("printinline")){
                System.out.print(var + " ");
            }

            _ret = (R)var;
        }
        // n.f0.accept(this, argu);

        return _ret;
    }

    /**
     * f0 -> "this"
     */
    public R visit(ThisExpression n, A argu) {
        R _ret = null;
        // n.f0.accept(this, argu);
        // _ret = (R)this.currentClass.name;

        _ret = (R)"this";

        if(argu.toString().equals("get") || argu.toString().equals("print") || argu.toString().equals("printinline")){
            String var = "this";
            if(this.currentInline!=null){
                var = this.currentInline.classVar;
            }
            _ret = (R)var;

            if(argu.toString().equals("print") || argu.toString().equals("printinline")){
                String temp;
                if(this.currentInline!=null)
                    temp = GlobalSymTab.getUnusedTemporary(null, this.currentInline.class_name);
                else
                    temp = GlobalSymTab.getUnusedTemporary(null, this.currentClass.name);

                _ret = (R)temp;
                System.out.println(temp + " = " + var + ";");
            }
        }

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

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){

            String temp = GlobalSymTab.getUnusedTemporary(null, "intarr");

            String id = n.f3.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "int");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            System.out.println(temp + " = new int[" + id + "];");

            _ret = (R)temp;
            GlobalSymTab.freeTemporary(id);

            return _ret;
        }

        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        _ret = (R)"intarr";
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

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){            

            String class_name = n.f1.accept(this, (A)"get").toString();
            String temp = GlobalSymTab.getUnusedTemporary(null, class_name);

            System.out.println(temp + " = new "+ class_name+ "();");

            _ret = (R)temp;

            return _ret;
        }

        n.f0.accept(this, argu);
        String id = n.f1.accept(this, argu).toString();
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        _ret = (R)id;
        return _ret;
    }

    /**
     * f0 -> "!"
     * f1 -> Identifier()
     */
    public R visit(NotExpression n, A argu) {
        R _ret = null;

        if(argu.toString().equals("print")||argu.toString().equals("printinline")){

            String temp = GlobalSymTab.getUnusedTemporary(null, "boolean");

            String id = n.f1.accept(this, (A)"get").toString();
            String temp1 = null;
            int pos = id.indexOf('.');
            if(pos>=0){
                temp1 = GlobalSymTab.getUnusedTemporary(id, "boolean");
                System.out.println(temp1 + " = " + id + ";");
                id = temp1;
            }

            System.out.println(temp + " = !" + id + ";");

            _ret = (R)temp;
            GlobalSymTab.freeTemporary(id);

            return _ret;
        }

        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        _ret = (R)"boolean";
        return _ret;
    }

}
