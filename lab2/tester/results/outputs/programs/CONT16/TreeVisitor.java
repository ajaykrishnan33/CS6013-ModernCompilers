class TreeVisitor {
public static void main(String[] a){
TV temp0;
int temp1;
temp0 = new TV();
temp1 = temp0.Start();
System.out.println(temp1);

}
}
class TV {
public int Start ( ){
int temp11;
int temp33;
boolean temp12;
int temp34;
int temp13;
int temp35;
boolean temp14;
int temp36;
int temp30;
int temp31;
boolean temp10;
int temp32;
int temp19;
Tree temp2;
int temp15;
int temp37;
int temp3;
boolean temp16;
boolean temp38;
int temp17;
boolean temp39;
boolean temp18;
Tree root;
boolean ntb;
int temp22;
MyVisitor temp23;
int nti;
int temp24;
int temp25;
int temp40;
int temp41;
boolean temp20;
int temp42;
boolean temp21;
int temp26;
int temp27;
int temp28;
int temp29;
int temp6;
int temp7;
boolean temp4;
boolean temp5;
MyVisitor v;
boolean temp8;
int temp9;
temp2 = new Tree();
root = temp2;
temp3 = 16;
temp4 = root.Init(temp3);
ntb = temp4;
temp5 = root.Print();
ntb = temp5;
temp6 = 100000000;
System.out.println(temp6);
temp7 = 8;
temp8 = root.Insert(temp7);
ntb = temp8;
temp9 = 24;
temp10 = root.Insert(temp9);
ntb = temp10;
temp11 = 4;
temp12 = root.Insert(temp11);
ntb = temp12;
temp13 = 12;
temp14 = root.Insert(temp13);
ntb = temp14;
temp15 = 20;
temp16 = root.Insert(temp15);
ntb = temp16;
temp17 = 28;
temp18 = root.Insert(temp17);
ntb = temp18;
temp19 = 14;
temp20 = root.Insert(temp19);
ntb = temp20;
temp21 = root.Print();
ntb = temp21;
temp22 = 100000000;
System.out.println(temp22);
temp23 = new MyVisitor();
v = temp23;
temp24 = 50000000;
System.out.println(temp24);
temp25 = root.accept(v);
nti = temp25;
temp26 = 100000000;
System.out.println(temp26);
temp27 = 24;
temp28 = root.Search(temp27);
System.out.println(temp28);
temp29 = 12;
temp30 = root.Search(temp29);
System.out.println(temp30);
temp31 = 16;
temp32 = root.Search(temp31);
System.out.println(temp32);
temp33 = 50;
temp34 = root.Search(temp33);
System.out.println(temp34);
temp35 = 12;
temp36 = root.Search(temp35);
System.out.println(temp36);
temp37 = 12;
temp38 = root.Delete(temp37);
ntb = temp38;
temp39 = root.Print();
ntb = temp39;
temp40 = 12;
temp41 = root.Search(temp40);
System.out.println(temp41);

temp42 = 0;

return temp42;
}
}
class Tree {
Tree left;
boolean has_right;
Tree my_null;
Tree right;
boolean has_left;
int key;
public boolean Init (int v_key ){
boolean temp44;
boolean temp45;
boolean temp43;
key = v_key;
temp43 = false;
has_left = temp43;
temp44 = false;
has_right = temp44;

temp45 = true;

return temp45;
}
public boolean SetRight (Tree rn ){
boolean temp46;
right = rn;

temp46 = true;

return temp46;
}
public boolean SetLeft (Tree ln ){
boolean temp47;
left = ln;

temp47 = true;

return temp47;
}
public Tree GetRight ( ){


return right;
}
public Tree GetLeft ( ){


return left;
}
public int GetKey ( ){


return key;
}
public boolean SetKey (int v_key ){
boolean temp48;
key = v_key;

temp48 = true;

return temp48;
}
public boolean GetHas_Right ( ){


return has_right;
}
public boolean GetHas_Left ( ){


return has_left;
}
public boolean SetHas_Left (boolean val ){
boolean temp49;
has_left = val;

temp49 = true;

return temp49;
}
public boolean SetHas_Right (boolean val ){
boolean temp50;
has_right = val;

temp50 = true;

return temp50;
}
public boolean Compare (int num1, int num2 ){
boolean temp55;
boolean temp56;
int nti;
boolean temp57;
boolean temp58;
boolean temp51;
int temp52;
int temp53;
boolean temp54;
boolean temp59;
boolean ntb;
temp51 = false;
ntb = temp51;
temp52 = 1;
temp53 = num2 + temp52;
nti = temp53;
temp54 = num1 < num2;
if(temp54){
temp55 = false;
ntb = temp55;
}
else{
temp56 = num1 < nti;
temp57= !temp56;
if(temp57){
temp58 = false;
ntb = temp58;
}
else{
temp59 = true;
ntb = temp59;
}
}


return ntb;
}
public boolean Insert (int v_key ){
boolean temp66;
boolean temp77;
Tree temp67;
boolean temp78;
boolean temp68;
Tree current_node;
boolean temp69;
Tree temp62;
Tree temp73;
boolean temp63;
boolean temp74;
int temp64;
boolean temp75;
boolean temp65;
boolean temp76;
int key_aux;
Tree new_node;
boolean temp70;
Tree temp60;
boolean temp71;
boolean temp61;
boolean temp72;
boolean cont;
boolean ntb;
temp60 = new Tree();
new_node = temp60;
temp61 = new_node.Init(v_key);
ntb = temp61;
temp62 = this;
current_node = temp62;
temp63 = true;
cont = temp63;
while(cont){
temp64 = current_node.GetKey();
key_aux = temp64;
temp65 = v_key < key_aux;
if(temp65){
temp66 = current_node.GetHas_Left();
if(temp66){
temp67 = current_node.GetLeft();
current_node = temp67;
}
else{
temp68 = false;
cont = temp68;
temp69 = true;
temp70 = current_node.SetHas_Left(temp69);
ntb = temp70;
temp71 = current_node.SetLeft(new_node);
ntb = temp71;
}
}
else{
temp72 = current_node.GetHas_Right();
if(temp72){
temp73 = current_node.GetRight();
current_node = temp73;
}
else{
temp74 = false;
cont = temp74;
temp75 = true;
temp76 = current_node.SetHas_Right(temp75);
ntb = temp76;
temp77 = current_node.SetRight(new_node);
ntb = temp77;
}
}
}

temp78 = true;

return temp78;
}
public boolean Delete (int v_key ){
Tree temp99;
boolean temp102;
Tree temp101;
Tree temp79;
boolean temp100;
Tree current_node;
boolean temp95;
boolean temp96;
boolean temp97;
boolean temp98;
boolean is_root;
int key_aux;
boolean found;
Tree temp91;
boolean temp92;
boolean temp93;
boolean temp94;
boolean cont;
boolean ntb;
boolean temp90;
boolean temp88;
boolean temp89;
int temp84;
boolean temp85;
boolean temp86;
Tree temp87;
Tree parent_node;
Tree temp80;
boolean temp81;
boolean temp82;
boolean temp83;
boolean temp105;
boolean temp104;
boolean temp103;
temp79 = this;
current_node = temp79;
temp80 = this;
parent_node = temp80;
temp81 = true;
cont = temp81;
temp82 = false;
found = temp82;
temp83 = true;
is_root = temp83;
while(cont){
temp84 = current_node.GetKey();
key_aux = temp84;
temp85 = v_key < key_aux;
if(temp85){
temp86 = current_node.GetHas_Left();
if(temp86){
parent_node = current_node;
temp87 = current_node.GetLeft();
current_node = temp87;
}
else{
temp88 = false;
cont = temp88;
}
}
else{
temp89 = key_aux < v_key;
if(temp89){
temp90 = current_node.GetHas_Right();
if(temp90){
parent_node = current_node;
temp91 = current_node.GetRight();
current_node = temp91;
}
else{
temp92 = false;
cont = temp92;
}
}
else{
if(is_root){
temp93 = current_node.GetHas_Right();
temp94= !temp93;
temp95 = current_node.GetHas_Left();
temp96= !temp95;
temp97 = temp94 & temp96;
if(temp97){
temp98 = true;
ntb = temp98;
}
else{
temp99 = this;
temp100 = temp99.Remove(parent_node,current_node );
ntb = temp100;
}
}
else{
temp101 = this;
temp102 = temp101.Remove(parent_node,current_node );
ntb = temp102;
}
temp103 = true;
found = temp103;
temp104 = false;
cont = temp104;
}
}
temp105 = false;
is_root = temp105;
}


return found;
}
public boolean Remove (Tree p_node, Tree c_node ){
Tree temp113;
int temp112;
boolean temp123;
boolean temp111;
boolean temp122;
Tree temp110;
boolean temp121;
boolean temp120;
int auxkey1;
int auxkey2;
boolean temp109;
boolean temp108;
boolean temp119;
Tree temp107;
boolean temp118;
boolean temp106;
boolean temp117;
boolean ntb;
boolean temp116;
Tree temp115;
int temp114;
temp106 = c_node.GetHas_Left();
if(temp106){
temp107 = this;
temp108 = temp107.RemoveLeft(p_node,c_node );
ntb = temp108;
}
else{
temp109 = c_node.GetHas_Right();
if(temp109){
temp110 = this;
temp111 = temp110.RemoveRight(p_node,c_node );
ntb = temp111;
}
else{
temp112 = c_node.GetKey();
auxkey1 = temp112;
temp113 = p_node.GetLeft();
temp114 = temp113.GetKey();
auxkey2 = temp114;
temp115 = this;
temp116 = temp115.Compare(auxkey1,auxkey2 );
if(temp116){
temp117 = p_node.SetLeft(my_null);
ntb = temp117;
temp118 = false;
temp119 = p_node.SetHas_Left(temp118);
ntb = temp119;
}
else{
temp120 = p_node.SetRight(my_null);
ntb = temp120;
temp121 = false;
temp122 = p_node.SetHas_Right(temp121);
ntb = temp122;
}
}
}

temp123 = true;

return temp123;
}
public boolean RemoveRight (Tree p_node, Tree c_node ){
boolean temp124;
boolean temp132;
boolean temp131;
boolean temp130;
boolean temp129;
Tree temp128;
boolean ntb;
boolean temp127;
int temp126;
Tree temp125;
temp124 = c_node.GetHas_Right();
while(temp124){
temp125 = c_node.GetRight();
temp126 = temp125.GetKey();
temp127 = c_node.SetKey(temp126);
ntb = temp127;
p_node = c_node;
temp128 = c_node.GetRight();
c_node = temp128;
temp124 = c_node.GetHas_Right();
}
temp129 = p_node.SetRight(my_null);
ntb = temp129;
temp130 = false;
temp131 = p_node.SetHas_Right(temp130);
ntb = temp131;

temp132 = true;

return temp132;
}
public boolean RemoveLeft (Tree p_node, Tree c_node ){
int temp135;
Tree temp134;
boolean temp133;
boolean temp141;
boolean temp140;
boolean temp139;
boolean ntb;
boolean temp138;
Tree temp137;
boolean temp136;
temp133 = c_node.GetHas_Left();
while(temp133){
temp134 = c_node.GetLeft();
temp135 = temp134.GetKey();
temp136 = c_node.SetKey(temp135);
ntb = temp136;
p_node = c_node;
temp137 = c_node.GetLeft();
c_node = temp137;
temp133 = c_node.GetHas_Left();
}
temp138 = p_node.SetLeft(my_null);
ntb = temp138;
temp139 = false;
temp140 = p_node.SetHas_Left(temp139);
ntb = temp140;

temp141 = true;

return temp141;
}
public int Search (int v_key ){
boolean temp146;
int temp145;
int temp144;
boolean temp155;
Tree current_node;
boolean temp143;
int temp154;
Tree temp142;
boolean temp153;
Tree temp152;
boolean temp151;
int ifound;
boolean temp150;
int key_aux;
boolean cont;
boolean temp149;
Tree temp148;
boolean temp147;
temp142 = this;
current_node = temp142;
temp143 = true;
cont = temp143;
temp144 = 0;
ifound = temp144;
while(cont){
temp145 = current_node.GetKey();
key_aux = temp145;
temp146 = v_key < key_aux;
if(temp146){
temp147 = current_node.GetHas_Left();
if(temp147){
temp148 = current_node.GetLeft();
current_node = temp148;
}
else{
temp149 = false;
cont = temp149;
}
}
else{
temp150 = key_aux < v_key;
if(temp150){
temp151 = current_node.GetHas_Right();
if(temp151){
temp152 = current_node.GetRight();
current_node = temp152;
}
else{
temp153 = false;
cont = temp153;
}
}
else{
temp154 = 1;
ifound = temp154;
temp155 = false;
cont = temp155;
}
}
}


return ifound;
}
public boolean Print ( ){
Tree temp157;
Tree temp156;
Tree current_node;
boolean ntb;
boolean temp159;
boolean temp158;
temp156 = this;
current_node = temp156;
temp157 = this;
temp158 = temp157.RecPrint(current_node);
ntb = temp158;

temp159 = true;

return temp159;
}
public boolean RecPrint (Tree node ){
Tree temp168;
Tree temp167;
boolean temp166;
int temp165;
boolean temp164;
boolean temp163;
Tree temp162;
Tree temp161;
boolean temp160;
boolean temp171;
boolean temp170;
boolean ntb;
boolean temp169;
temp160 = node.GetHas_Left();
if(temp160){
temp161 = this;
temp162 = node.GetLeft();
temp163 = temp161.RecPrint(temp162);
ntb = temp163;
}
else{
temp164 = true;
ntb = temp164;
}
temp165 = node.GetKey();
System.out.println(temp165);
temp166 = node.GetHas_Right();
if(temp166){
temp167 = this;
temp168 = node.GetRight();
temp169 = temp167.RecPrint(temp168);
ntb = temp169;
}
else{
temp170 = true;
ntb = temp170;
}

temp171 = true;

return temp171;
}
public int accept (Visitor v ){
int nti;
int temp175;
int temp174;
Tree temp173;
int temp172;
temp172 = 333;
System.out.println(temp172);
temp173 = this;
temp174 = v.visit(temp173);
nti = temp174;

temp175 = 0;

return temp175;
}
}
class Visitor {
Tree r;
Tree l;
public int visit (Tree n ){
int temp179;
Visitor temp178;
int nti;
Tree temp177;
boolean temp176;
int temp186;
int temp185;
int temp184;
Visitor temp183;
Tree temp182;
boolean temp181;
int temp180;
temp176 = n.GetHas_Right();
if(temp176){
temp177 = n.GetRight();
r = temp177;
temp178 = this;
temp179 = r.accept(temp178);
nti = temp179;
}
else{
temp180 = 0;
nti = temp180;
}
temp181 = n.GetHas_Left();
if(temp181){
temp182 = n.GetLeft();
l = temp182;
temp183 = this;
temp184 = l.accept(temp183);
nti = temp184;
}
else{
temp185 = 0;
nti = temp185;
}

temp186 = 0;

return temp186;
}
}
class MyVisitor extends Visitor {
public int visit (Tree n ){
MyVisitor temp189;
int nti;
Tree temp188;
boolean temp187;
int temp198;
int temp197;
int temp196;
MyVisitor temp195;
Tree temp194;
boolean temp193;
int temp192;
int temp191;
int temp190;
temp187 = n.GetHas_Right();
if(temp187){
temp188 = n.GetRight();
r = temp188;
temp189 = this;
temp190 = r.accept(temp189);
nti = temp190;
}
else{
temp191 = 0;
nti = temp191;
}
temp192 = n.GetKey();
System.out.println(temp192);
temp193 = n.GetHas_Left();
if(temp193){
temp194 = n.GetLeft();
l = temp194;
temp195 = this;
temp196 = l.accept(temp195);
nti = temp196;
}
else{
temp197 = 0;
nti = temp197;
}

temp198 = 0;

return temp198;
}
}
