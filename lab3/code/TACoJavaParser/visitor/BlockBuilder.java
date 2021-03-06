//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;
import helper.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class BlockBuilder<R, A> implements GJVisitor<R, A> {
    //
    // Auto class visitors--probably don't need to be overridden.
    //

    HashMap<Integer, BlockL> blockMap;
    int lineno = 0;
    ArrayList<ValType> variables;
    BlockL prev, curr;
    int for_count = 0;

    public void startBlocks(){
        this.blockMap = new HashMap<Integer, BlockL>();
        this.variables = new ArrayList<ValType>();
        BlockL b = new BlockL(this.lineno);
        this.blockMap.put(this.lineno, b);
        this.lineno++;
        this.prev = b;
    }

    public BlockL addBlock(){
        BlockL b;
        if(this.blockMap.containsKey(this.lineno)){
            b = this.blockMap.get(this.lineno);
        }
        else
            b = new BlockL(this.lineno);
        this.prev.addSuccessor(this.lineno);
        b.addPredecessor(this.prev.lineno);
        this.blockMap.put(this.lineno, b);
        this.lineno++;
        this.prev = b;
        return b;
    }

    void predecessorMeet(BlockL b){
        b.initializeValMap(this.variables);
        for(int i=0;i<b.predecessors.size();i++){
            BlockL p = this.blockMap.get(b.predecessors.get(i));
            for(Map.Entry<String, ValType> entry: p.outValMap.entrySet()){
                ValType oldVal = entry.getValue();
                ValType newVal = b.inValMap.get(entry.getKey());
                newVal.meet(oldVal);
            }
        }
    }

    public void compute(){
        Queue<BlockL> worklist = new LinkedList<BlockL>();

        for(Map.Entry<Integer, BlockL> entry:this.blockMap.entrySet()){
            BlockL bet = entry.getValue();
            bet.initializeValMap(this.variables);
        }

        // for(Map.Entry<Integer, BlockL> entry:this.blockMap.entrySet()){
        //     BlockL bet = entry.getValue();
        //     String x="";
        //     if(bet.id!=null)
        //         x = bet.id.accept(this, (A)"").toString();
        //     System.err.println(entry.getKey()+":"+x);
        //     System.err.println("\tPredecessors:");
        //     int j;
        //     for(j=0;j<bet.predecessors.size();j++){
        //         System.err.println("\t\t"+bet.predecessors.get(j));    
        //     }
        //     System.err.println("\tSuccessors:");
        //     for(j=0;j<bet.successors.size();j++){
        //         System.err.println("\t\t"+bet.successors.get(j));    
        //     }
        // }

        worklist.add(this.blockMap.get(0));

        boolean change;

        while(worklist.size()>0){
            BlockL b = worklist.remove();
            HashMap<String, ValType> old = b.copyValMap();
            this.predecessorMeet(b);
            if(b.var_name!=null && b.outValMap.containsKey(b.var_name)){

                b.copyInToOutValMap();
                this.curr = b;
                R val = b.exp.accept(this, (A)"compute");
                ValType v = b.outValMap.get(b.var_name);
                if(val==null){
                    v.status = 2;
                    // if(b.var_name.equals("largeforloopvar0"))
                    //     System.err.println("status:2");
                }
                else
                {
                    int x = Integer.parseInt(val.toString());
                    v.val = x;
                    v.status = 1;
                    // if(b.var_name.equals("largeforloopvar0"))
                    //     System.err.println("status:1, val:"+v.val);
                }
                this.curr = null;
            }
            else
            {
                b.copyInToOutValMap();
            }

            // if(b.lineno >= 1 && b.lineno <= 10){
                // System.err.println(b.lineno+":"+b.var_name);
                // System.err.println("\tIn:");
                // for(Map.Entry<String, ValType> var:b.inValMap.entrySet()){
                //     System.err.println("\t\t"+var.getKey()+":"+var.getValue().val+", status="+var.getValue().status+", type="+var.getValue().type);    
                // }
                // System.err.println("\tOut:");
                // for(Map.Entry<String, ValType> var:b.outValMap.entrySet()){
                //     System.err.println("\t\t"+var.getKey()+":"+var.getValue().val+", status="+var.getValue().status+", type="+var.getValue().type);    
                // }
            // }

            change = b.hasChanged(old);
            if(!change)
                continue;

            if(b.successors.size()==1){
                worklist.add(this.blockMap.get(b.successors.get(0)));
            }
            else
            if(b.successors.size()==2){
                this.curr = b;
                if(b.exp!=null){
                    R val = b.exp.accept(this, (A)"compute");
                    if(val==null){
                        worklist.add(this.blockMap.get(b.successors.get(0)));
                        worklist.add(this.blockMap.get(b.successors.get(1)));
                    }
                    else{
                        int x = Integer.parseInt(val.toString());
                        if(x==1)
                            worklist.add(this.blockMap.get(b.successors.get(0)));
                        else
                            worklist.add(this.blockMap.get(b.successors.get(1)));
                    }
                }
                else
                if(b.id!=null){
                    String var_name = b.id.accept(this, (A)"compute").toString();
                    ValType v = b.outValMap.get(var_name);
                    if(v!=null && v.status==1){
                        if(v.val==1)
                            worklist.add(this.blockMap.get(b.successors.get(0)));
                        else
                            worklist.add(this.blockMap.get(b.successors.get(1)));
                    }
                    else{
                        worklist.add(this.blockMap.get(b.successors.get(0)));
                        worklist.add(this.blockMap.get(b.successors.get(1)));   
                    }
                }
                this.curr = null;
            }
        }
        // for(Map.Entry<Integer, BlockL> entry:this.blockMap.entrySet()){
        //     System.out.println(entry.getKey()+":");
        //     BlockL bet = entry.getValue();
        //     System.out.println("\tIn:");
        //     for(Map.Entry<String, ValType> var:bet.inValMap.entrySet()){
        //         System.out.println("\t\t"+var.getKey()+":"+var.getValue().val+", status="+var.getValue().status);    
        //     }
        //     System.out.println("\tOut:");
        //     for(Map.Entry<String, ValType> var:bet.outValMap.entrySet()){
        //         System.out.println("\t\t"+var.getKey()+":"+var.getValue().val+", status="+var.getValue().status);    
        //     }
        // }
    }

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
        if(argu.toString().equals("generate")){
            System.out.print(n.tokenImage+" ");
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
        argu = (A)"generate";
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
        this.lineno = 0;
        // Generation
        argu = (A)"generate";
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

        // Build
        argu = (A)"build";
        this.startBlocks();

        n.f14.accept(this, argu);
        n.f15.accept(this, argu);

        this.addBlock();

        this.compute();

        this.lineno = 0;
        this.for_count = 0;
        // System.out.println("\nDone computation");

        // Generation
        argu = (A)"generate";

        this.lineno++;

        n.f13.accept(this, argu);
        n.f14.accept(this, argu);
        n.f15.accept(this, argu);
        
        n.f16.accept(this, argu);
        n.f17.accept(this, argu);

        this.lineno++;

        this.blockMap = null;
        this.variables = null;

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
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
        
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
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
        n.f6.accept(this, argu);
        n.f7.accept(this, argu);

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
        String name = n.f1.accept(this, argu).toString();
        n.f2.accept(this, argu);

        if(argu.toString().equals("build")){
            if(this.variables!=null){
                if(type.equals("boolean")||type.equals("int")){
                    ValType v = new ValType(name, type);
                    this.variables.add(v);
                }
            }
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
     * f8 -> ( Statement() )*
     * f9 -> "return"
     * f10 -> Identifier()
     * f11 -> ";"
     * f12 -> "}"
     */
    public R visit(MethodDeclaration n, A argu) {
        R _ret = null;
        this.lineno = 0;
        argu = (A)"generate";
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);

        argu = (A)"build";
        this.startBlocks();

        n.f4.accept(this, argu);
        n.f7.accept(this, argu);
        n.f8.accept(this, argu);

        this.addBlock();

        this.compute();

        this.lineno = 0;
        this.for_count = 0;

        argu = (A)"generate";

        this.lineno++;

        n.f6.accept(this, argu);
        n.f7.accept(this, argu);
        n.f8.accept(this, argu);
        n.f9.accept(this, argu);
        
        this.replaceConstantForId(n.f10);
        // n.f10.accept(this, argu);

        n.f11.accept(this, argu);

        this.lineno++;
        n.f12.accept(this, argu);

        this.blockMap = null;
        this.variables = null;

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
        String name = n.f1.accept(this, argu).toString();

        if(argu.toString().equals("build")){
            if(this.variables!=null){
                if(type.equals("boolean")||type.equals("int")){
                    ValType v = new ValType(name, type);
                    this.variables.add(v);
                }
            }
        }
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
     * f1 -> ( Statement() )*
     * f2 -> "}"
     */
    public R visit(Block n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    public void replaceRHS(String var_name, Node n){
        BlockL b = this.blockMap.get(this.lineno);
        if(b.outValMap.containsKey(var_name)){
            ValType v = b.outValMap.get(var_name);
            if(v.status==1){
                if(v.type.equals("boolean")){
                    if(v.val==0)
                        System.out.print("false ");
                    else
                        System.out.print("true ");
                }
                else
                if(v.type.equals("int")){
                    System.out.print(""+v.val+" ");;
                }
            }
            else
                n.accept(this, (A)"generate");
        }
        else
            n.accept(this, (A)"generate");
    }

    /**
     * f0 -> Identifier()
     * f1 -> "="
     * f2 -> Expression()
     * f3 -> ";"
     */
    public R visit(AssignmentStatement n, A argu) {
        R _ret = null;
        
        if(argu.toString().equals("build")){
            BlockL b = this.addBlock();
            String var_name = n.f0.accept(this, argu).toString();
            b.setExp(var_name, n.f2);
        }
        else
        {
            String var_name = n.f0.accept(this, argu).toString();
            n.f1.accept(this, argu);

            if(argu.toString().equals("generate"))
                this.replaceRHS(var_name, n.f2);

            n.f3.accept(this, argu);
            this.lineno++;
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
        if(argu.toString().equals("build")){
            this.addBlock();
        }
        else
        {
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            if(argu.toString().equals("generate"))
                this.replaceConstantForId(n.f2);
            n.f3.accept(this, argu);
            n.f4.accept(this, argu);
            if(argu.toString().equals("generate"))
                this.replaceConstantForId(n.f5);
            n.f6.accept(this, argu);
            this.lineno++;
        }
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
            this.addBlock();
        }
        else
        {
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            n.f2.accept(this, argu);
            n.f3.accept(this, argu);
            if(argu.toString().equals("generate"))
                this.replaceConstantForId(n.f4);
            n.f5.accept(this, argu);
            this.lineno++;
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

        if(argu.toString().equals("build")){
            BlockL b = this.addBlock();
            b.setId(n.f2);
            n.f4.accept(this, argu);
            BlockL p = this.addBlock();

            this.prev = b;
            n.f6.accept(this, argu);

            this.addBlock();

            BlockL x = this.addBlock();
            x.addPredecessor(p.lineno);
            p.addSuccessor(x.lineno);

            // BlockL x = new BlockL(this.lineno);
            // this.blockMap.put(this.lineno, x);
            // x.addPredecessor(p.lineno);
            // p.addSuccessor(x.lineno);

        }
        else{
            String x = this.getConstantForId(n.f2.accept(this, (A)"").toString());
            if(x!=null){
                boolean val = Boolean.parseBoolean(x);
                if(val){
                    this.lineno++;
                    n.f4.accept(this, argu);
                    this.lineno++;
                    n.f6.accept(this, (A)""); //move lineno forward
                    this.lineno+=2;
                }
                else{
                    this.lineno++;
                    n.f4.accept(this, (A)""); //move lineno forward
                    this.lineno++;
                    n.f6.accept(this, argu);
                    this.lineno+=2;
                }
            }
            else
            {
                n.f0.accept(this, argu);
                n.f1.accept(this, argu);
                n.f2.accept(this, argu);
                n.f3.accept(this, argu);
                this.lineno++;
                n.f4.accept(this, argu);
                this.lineno++;
                n.f5.accept(this, argu);
                n.f6.accept(this, argu);
                this.lineno+=2;
            }
        }

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

        if(argu.toString().equals("build")){
            BlockL b = this.addBlock();
            b.setId(n.f2);
            n.f4.accept(this, argu);
            BlockL x = this.addBlock();
            x.addSuccessor(b.lineno);
            b.addPredecessor(x.lineno);
            this.prev = b;
        }
        else
        {
            String x = this.getConstantForId(n.f2.accept(this, (A)"").toString());
            if(x!=null && x.equals("false")){
                this.lineno++;
                n.f4.accept(this, (A)"");
                this.lineno++;
            }

            if(x==null || x.equals("true")){
                n.f0.accept(this, argu);
                n.f1.accept(this, argu);
                n.f2.accept(this, argu);
                n.f3.accept(this, argu);
                this.lineno++;
                n.f4.accept(this, argu);
                this.lineno++;    
            }
            
        }
        
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

        if(argu.toString().equals("build")){
            BlockL b = this.addBlock();
            String var_name = n.f2.accept(this, argu).toString();
            b.setExp(var_name, n.f4);

            BlockL x = this.addBlock();
            this.variables.add(new ValType("largeforloopvar"+this.for_count, "boolean"));
            x.setExp("largeforloopvar"+this.for_count++, n.f6);

            n.f12.accept(this, argu);

            b = this.addBlock();
            var_name = n.f8.accept(this, argu).toString();
            
            b.setExp(var_name, n.f10);

            BlockL y = this.addBlock();
            y.addSuccessor(x.lineno);
            x.addPredecessor(y.lineno);
            this.prev = x;
        }
        else
        {
            this.lineno++;
            String x = null;
            ValType v = this.blockMap.get(this.lineno).outValMap.get("largeforloopvar"+this.for_count++);
            if(v!=null && v.status==1){
                if(v.val==0)
                    x="false";
                else
                    x="true";
            }
            this.lineno--;
            String var_name;
            if(x!=null && x.equals("false")){
                var_name = n.f2.accept(this, argu).toString();
                n.f3.accept(this, argu);

                if(argu.toString().equals("generate"))
                    this.replaceRHS(var_name, n.f4);
                
                n.f5.accept(this, argu);                

                this.lineno += 2;
                n.f12.accept(this, (A)"");
                this.lineno += 2;
            }
            else{
                n.f0.accept(this, argu);
                n.f1.accept(this, argu);

                var_name = n.f2.accept(this, argu).toString();
                n.f3.accept(this, argu);

                if(argu.toString().equals("generate"))
                    this.replaceRHS(var_name, n.f4);
                
                n.f5.accept(this, argu);

                this.lineno++;
                n.f6.accept(this, argu);
                n.f7.accept(this, argu);

                this.lineno++;
                int temp = this.lineno;
                n.f12.accept(this, (A)""); // lineno updated

                var_name = n.f8.accept(this, argu).toString();
                n.f9.accept(this, argu);

                if(argu.toString().equals("generate"))
                    this.replaceRHS(var_name, n.f10);

                this.lineno++;

                n.f11.accept(this, argu);

                int temp2 = this.lineno;
                this.lineno = temp;
                n.f12.accept(this, argu);

                this.lineno = temp2;
                this.lineno++;
            }
        }

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

        if(argu.toString().equals("build")){
            this.addBlock();
        }
        else
        {
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            if(argu.toString().equals("generate"))
                this.replaceConstantForId(n.f2);
            n.f3.accept(this, argu);
            n.f4.accept(this, argu);
            this.lineno++;
        }
        
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
     *       | PrimaryExpression()
     */
    public R visit(Expression n, A argu) {
        R _ret = null;
        if(argu.toString().equals("compute"))
            _ret = n.f0.accept(this, argu);
        else
        if(argu.toString().equals("generate"))
            n.f0.accept(this, argu);
        return _ret;
    }

    public String getConstantForId(String var_name){
        BlockL b = this.blockMap.get(this.lineno);
        // System.out.println("\n\tVal:"+b.getVal(var_name));
        return b.getVal(var_name);
    }

    public void replaceConstantForId(Node n){
        String x = this.getConstantForId(n.accept(this, (A)"").toString());
        if(x!=null)
            System.out.print(x+" ");
        else
            n.accept(this, (A)"generate");
    }

    public void replaceWithConstants(Node f0, Node f1, Node f2){
        A argu = (A)"";
        BlockL b = this.blockMap.get(this.lineno);

        this.replaceConstantForId(f0);

        f1.accept(this, (A)"generate");

        this.replaceConstantForId(f2);
    }

    /**
     * f0 -> Identifier()
     * f1 -> "&"
     * f2 -> Identifier()
     */
    public R visit(AndExpression n, A argu) {
        R _ret = null;

        if(argu.toString().equals("compute")){
            R id1 = n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            R id2 = n.f2.accept(this, argu);
            int flag=0;

            String x1 = this.curr.getVal(id1.toString());
            String x2 = this.curr.getVal(id2.toString());

            if(x1!=null){
                boolean val1 = Boolean.parseBoolean(x1);
                flag++;
                if(!val1){
                    flag++;
                    _ret = (R)"0";
                }
            }
            if(flag<2 && x2!=null){
                boolean val2 = Boolean.parseBoolean(x2);
                if(flag==0){
                    if(!val2)
                        _ret = (R)"0";
                }
                else
                {
                    if(val2)
                        _ret = (R)"1";
                    else
                        _ret = (R)"0";
                }
            }
        }
        else
        if(argu.toString().equals("generate")){
            this.replaceWithConstants(n.f0, n.f1, n.f2);
        }
        
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "<"
     * f2 -> Identifier()
     */
    public R visit(CompareExpression n, A argu) {
        R _ret = null;

        if(argu.toString().equals("compute")){
            R id1 = n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            R id2 = n.f2.accept(this, argu);
            
            String x1 = this.curr.getVal(id1.toString());
            String x2 = this.curr.getVal(id2.toString());
            if(x1!=null && x2!=null){
                int val1 = Integer.parseInt(x1);
                int val2 = Integer.parseInt(x2);
                if(val1<val2)
                    _ret = (R)"1";
                else
                    _ret = (R)"0";
            }
        }
        else
        if(argu.toString().equals("generate")){
            this.replaceWithConstants(n.f0, n.f1, n.f2);
        }

        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "+"
     * f2 -> Identifier()
     */
    public R visit(PlusExpression n, A argu) {
        R _ret = null;

        if(argu.toString().equals("compute")){
            R id1 = n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            R id2 = n.f2.accept(this, argu);
            
            String x1 = this.curr.getVal(id1.toString());
            String x2 = this.curr.getVal(id2.toString());
            if(x1!=null && x2!=null){
                int val1 = Integer.parseInt(x1);
                int val2 = Integer.parseInt(x2);
                _ret = (R)(""+(val1+val2));    
            }
        }
        else
        if(argu.toString().equals("generate")){
            this.replaceWithConstants(n.f0, n.f1, n.f2);
        }

        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "-"
     * f2 -> Identifier()
     */
    public R visit(MinusExpression n, A argu) {
        R _ret = null;

        if(argu.toString().equals("compute")){
            R id1 = n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            R id2 = n.f2.accept(this, argu);
            
            String x1 = this.curr.getVal(id1.toString());
            String x2 = this.curr.getVal(id2.toString());
            if(x1!=null && x2!=null){
                int val1 = Integer.parseInt(x1);
                int val2 = Integer.parseInt(x2);
                if(val1<val2)
                    return null;
                _ret = (R)(""+(val1-val2));    
            }
        }
        else
        if(argu.toString().equals("generate")){
            this.replaceWithConstants(n.f0, n.f1, n.f2);
        }

        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "*"
     * f2 -> Identifier()
     */
    public R visit(TimesExpression n, A argu) {
        R _ret = null;

        if(argu.toString().equals("compute")){
            R id1 = n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            R id2 = n.f2.accept(this, argu);
            
            String x1 = this.curr.getVal(id1.toString());
            String x2 = this.curr.getVal(id2.toString());
            if(x1!=null && x2!=null){
                int val1 = Integer.parseInt(x1);
                int val2 = Integer.parseInt(x2);
                _ret = (R)(""+(val1*val2));    
            }
        }
        else
        if(argu.toString().equals("generate")){
            this.replaceWithConstants(n.f0, n.f1, n.f2);
        }

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

        if(argu.toString().equals("generate")){
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            this.replaceConstantForId(n.f2);
            n.f3.accept(this, argu);
        }
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "."
     * f2 -> "length"
     */
    public R visit(ArrayLength n, A argu) {
        R _ret = null;
        if(argu.toString().equals("generate")){
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            n.f2.accept(this, argu);
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
        if(argu.toString().equals("generate")){
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            n.f2.accept(this, argu);
            n.f3.accept(this, argu);
            n.f4.accept(this, argu);
            n.f5.accept(this, argu);
        }
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> ( ArgRest() )*
     */
    public R visit(ArgList n, A argu) {
        R _ret = null;
        if(argu.toString().equals("generate")){
            this.replaceConstantForId(n.f0);
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
        if(argu.toString().equals("generate")){
            n.f0.accept(this, argu);
            this.replaceConstantForId(n.f1);
        }
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

        if(argu.toString().equals("compute")){
            if(n.f0.which==3){
                String var_name = n.f0.choice.accept(this, argu).toString();
                ValType v = this.curr.inValMap.get(var_name);
                if(v!=null && v.status==1){
                    _ret = (R)(v.val+"");
                }
            }
            else
                _ret = n.f0.choice.accept(this, argu);
            // if(_ret!=null)
            //     System.out.println("Ret:"+_ret.toString());
        }
        else
        if(argu.toString().equals("generate")){
            if(n.f0.which==3){
                this.replaceConstantForId(n.f0.choice);
            }
            else
                n.f0.choice.accept(this, argu);
        }

        return _ret;
    }

    /**
     * f0 -> <INTEGER_LITERAL>
     */
    public R visit(IntegerLiteral n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        _ret = (R)n.f0.toString();
        return _ret;
    }

    /**
     * f0 -> "true"
     */
    public R visit(TrueLiteral n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        _ret = (R)"1";
        return _ret;
    }

    /**
     * f0 -> "false"
     */
    public R visit(FalseLiteral n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        _ret = (R)"0";
        return _ret;
    }

    /**
     * f0 -> <IDENTIFIER>
     */
    public R visit(Identifier n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
        _ret = (R)n.f0.toString();
        return _ret;
    }

    /**
     * f0 -> "this"
     */
    public R visit(ThisExpression n, A argu) {
        R _ret = null;
        n.f0.accept(this, argu);
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
        if(argu.toString().equals("generate")){
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            n.f2.accept(this, argu);

            this.replaceConstantForId(n.f3);

            n.f4.accept(this, argu);
        }
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
        if(argu.toString().equals("generate")){
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);
            n.f2.accept(this, argu);
            n.f3.accept(this, argu);
        }
        return _ret;
    }

    /**
     * f0 -> "!"
     * f1 -> Identifier()
     */
    public R visit(NotExpression n, A argu) {
        R _ret = null;
        
        if(argu.toString().equals("compute")){
            n.f0.accept(this, argu);
            String var_name = n.f1.accept(this, argu).toString();
            ValType v = this.curr.inValMap.get(var_name);
            if(v==null)
                return null;
            if(!v.type.equals("boolean")){
                // System.err.println("Non-boolean type cannot be negated.");
                System.exit(0);
            }
            if(v.status==1){
                int x = 1 - v.val;
                if(x==1)
                    _ret = (R)"1";
                else
                    _ret = (R)"0";
            }
        }
        else
        {
            n.f0.accept(this, argu);
            n.f1.accept(this, argu);
        }
        return _ret;
    }

}
