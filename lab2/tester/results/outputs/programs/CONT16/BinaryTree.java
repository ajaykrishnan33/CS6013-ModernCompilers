class BinaryTree {
public static void main(String[] a){
BT temp0;
int temp1;
temp0 = new BT();
temp1 = temp0.Start();
System.out.println(temp1);

}
}
class BT {
public int Start ( ){
boolean temp11;
int temp33;
int temp12;
boolean temp34;
boolean temp13;
boolean temp35;
int temp14;
int temp36;
int temp30;
int temp31;
int temp10;
int temp32;
boolean temp19;
Tree temp2;
boolean temp15;
int temp37;
int temp3;
int temp16;
int temp38;
boolean temp17;
int temp18;
Tree root;
boolean ntb;
boolean temp22;
int temp23;
int nti;
int temp24;
int temp25;
int temp20;
boolean temp21;
int temp26;
int temp27;
int temp28;
int temp29;
int temp6;
int temp7;
boolean temp4;
boolean temp5;
boolean temp8;
boolean temp9;
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
temp9 = root.Print();
ntb = temp9;
temp10 = 24;
temp11 = root.Insert(temp10);
ntb = temp11;
temp12 = 4;
temp13 = root.Insert(temp12);
ntb = temp13;
temp14 = 12;
temp15 = root.Insert(temp14);
ntb = temp15;
temp16 = 20;
temp17 = root.Insert(temp16);
ntb = temp17;
temp18 = 28;
temp19 = root.Insert(temp18);
ntb = temp19;
temp20 = 14;
temp21 = root.Insert(temp20);
ntb = temp21;
temp22 = root.Print();
ntb = temp22;
temp23 = 24;
temp24 = root.Search(temp23);
System.out.println(temp24);
temp25 = 12;
temp26 = root.Search(temp25);
System.out.println(temp26);
temp27 = 16;
temp28 = root.Search(temp27);
System.out.println(temp28);
temp29 = 50;
temp30 = root.Search(temp29);
System.out.println(temp30);
temp31 = 12;
temp32 = root.Search(temp31);
System.out.println(temp32);
temp33 = 12;
temp34 = root.Delete(temp33);
ntb = temp34;
temp35 = root.Print();
ntb = temp35;
temp36 = 12;
temp37 = root.Search(temp36);
System.out.println(temp37);

temp38 = 0;

return temp38;
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
boolean temp40;
boolean temp41;
boolean temp39;
key = v_key;
temp39 = false;
has_left = temp39;
temp40 = false;
has_right = temp40;

temp41 = true;

return temp41;
}
public boolean SetRight (Tree rn ){
boolean temp42;
right = rn;

temp42 = true;

return temp42;
}
public boolean SetLeft (Tree ln ){
boolean temp43;
left = ln;

temp43 = true;

return temp43;
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
boolean temp44;
key = v_key;

temp44 = true;

return temp44;
}
public boolean GetHas_Right ( ){


return has_right;
}
public boolean GetHas_Left ( ){


return has_left;
}
public boolean SetHas_Left (boolean val ){
boolean temp45;
has_left = val;

temp45 = true;

return temp45;
}
public boolean SetHas_Right (boolean val ){
boolean temp46;
has_right = val;

temp46 = true;

return temp46;
}
public boolean Compare (int num1, int num2 ){
boolean temp55;
int nti;
boolean temp47;
boolean temp51;
boolean temp52;
boolean temp53;
boolean temp54;
boolean temp50;
int temp48;
boolean ntb;
int temp49;
temp47 = false;
ntb = temp47;
temp48 = 1;
temp49 = num2 + temp48;
nti = temp49;
temp50 = num1 < num2;
if(temp50){
temp51 = false;
ntb = temp51;
}
else{
temp52 = num1 < nti;
temp53= !temp52;
if(temp53){
temp54 = false;
ntb = temp54;
}
else{
temp55 = true;
ntb = temp55;
}
}


return ntb;
}
public boolean Insert (int v_key ){
boolean temp66;
Tree temp56;
boolean temp67;
boolean temp57;
boolean temp68;
Tree current_node;
Tree temp58;
Tree temp69;
boolean temp62;
boolean temp73;
Tree temp63;
boolean temp74;
boolean temp64;
boolean temp65;
boolean temp59;
int key_aux;
Tree new_node;
boolean temp70;
int temp60;
boolean temp71;
boolean temp61;
boolean temp72;
boolean cont;
boolean ntb;
temp56 = new Tree();
new_node = temp56;
temp57 = new_node.Init(v_key);
ntb = temp57;
temp58 = this;
current_node = temp58;
temp59 = true;
cont = temp59;
while(cont){
temp60 = current_node.GetKey();
key_aux = temp60;
temp61 = v_key < key_aux;
if(temp61){
temp62 = current_node.GetHas_Left();
if(temp62){
temp63 = current_node.GetLeft();
current_node = temp63;
}
else{
temp64 = false;
cont = temp64;
temp65 = true;
temp66 = current_node.SetHas_Left(temp65);
ntb = temp66;
temp67 = current_node.SetLeft(new_node);
ntb = temp67;
}
}
else{
temp68 = current_node.GetHas_Right();
if(temp68){
temp69 = current_node.GetRight();
current_node = temp69;
}
else{
temp70 = false;
cont = temp70;
temp71 = true;
temp72 = current_node.SetHas_Right(temp71);
ntb = temp72;
temp73 = current_node.SetRight(new_node);
ntb = temp73;
}
}
}

temp74 = true;

return temp74;
}
public boolean Delete (int v_key ){
boolean temp77;
boolean temp99;
boolean temp78;
boolean temp101;
boolean temp79;
boolean temp100;
Tree current_node;
Tree temp95;
boolean temp96;
Tree temp75;
Tree temp97;
Tree temp76;
boolean temp98;
boolean is_root;
int key_aux;
boolean found;
boolean temp91;
boolean temp92;
boolean temp93;
boolean temp94;
boolean cont;
boolean ntb;
boolean temp90;
boolean temp88;
boolean temp89;
boolean temp84;
boolean temp85;
boolean temp86;
Tree temp87;
Tree parent_node;
int temp80;
boolean temp81;
boolean temp82;
Tree temp83;
temp75 = this;
current_node = temp75;
temp76 = this;
parent_node = temp76;
temp77 = true;
cont = temp77;
temp78 = false;
found = temp78;
temp79 = true;
is_root = temp79;
while(cont){
temp80 = current_node.GetKey();
key_aux = temp80;
temp81 = v_key < key_aux;
if(temp81){
temp82 = current_node.GetHas_Left();
if(temp82){
parent_node = current_node;
temp83 = current_node.GetLeft();
current_node = temp83;
}
else{
temp84 = false;
cont = temp84;
}
}
else{
temp85 = key_aux < v_key;
if(temp85){
temp86 = current_node.GetHas_Right();
if(temp86){
parent_node = current_node;
temp87 = current_node.GetRight();
current_node = temp87;
}
else{
temp88 = false;
cont = temp88;
}
}
else{
if(is_root){
temp89 = current_node.GetHas_Right();
temp90= !temp89;
temp91 = current_node.GetHas_Left();
temp92= !temp91;
temp93 = temp90 & temp92;
if(temp93){
temp94 = true;
ntb = temp94;
}
else{
temp95 = this;
temp96 = temp95.Remove(parent_node,current_node );
ntb = temp96;
}
}
else{
temp97 = this;
temp98 = temp97.Remove(parent_node,current_node );
ntb = temp98;
}
temp99 = true;
found = temp99;
temp100 = false;
cont = temp100;
}
}
temp101 = false;
is_root = temp101;
}


return found;
}
public boolean Remove (Tree p_node, Tree c_node ){
boolean temp102;
boolean temp113;
boolean temp112;
Tree temp111;
int temp110;
int auxkey1;
int auxkey2;
Tree temp109;
int temp108;
boolean temp119;
boolean temp107;
boolean temp118;
Tree temp106;
boolean temp117;
boolean ntb;
boolean temp105;
boolean temp116;
boolean temp104;
boolean temp115;
Tree temp103;
boolean temp114;
temp102 = c_node.GetHas_Left();
if(temp102){
temp103 = this;
temp104 = temp103.RemoveLeft(p_node,c_node );
ntb = temp104;
}
else{
temp105 = c_node.GetHas_Right();
if(temp105){
temp106 = this;
temp107 = temp106.RemoveRight(p_node,c_node );
ntb = temp107;
}
else{
temp108 = c_node.GetKey();
auxkey1 = temp108;
temp109 = p_node.GetLeft();
temp110 = temp109.GetKey();
auxkey2 = temp110;
temp111 = this;
temp112 = temp111.Compare(auxkey1,auxkey2 );
if(temp112){
temp113 = p_node.SetLeft(my_null);
ntb = temp113;
temp114 = false;
temp115 = p_node.SetHas_Left(temp114);
ntb = temp115;
}
else{
temp116 = p_node.SetRight(my_null);
ntb = temp116;
temp117 = false;
temp118 = p_node.SetHas_Right(temp117);
ntb = temp118;
}
}
}

temp119 = true;

return temp119;
}
public boolean RemoveRight (Tree p_node, Tree c_node ){
Tree temp124;
boolean temp123;
int temp122;
Tree temp121;
boolean temp120;
boolean temp128;
boolean ntb;
boolean temp127;
boolean temp126;
boolean temp125;
temp120 = c_node.GetHas_Right();
while(temp120){
temp121 = c_node.GetRight();
temp122 = temp121.GetKey();
temp123 = c_node.SetKey(temp122);
ntb = temp123;
p_node = c_node;
temp124 = c_node.GetRight();
c_node = temp124;
temp120 = c_node.GetHas_Right();
}
temp125 = p_node.SetRight(my_null);
ntb = temp125;
temp126 = false;
temp127 = p_node.SetHas_Right(temp126);
ntb = temp127;

temp128 = true;

return temp128;
}
public boolean RemoveLeft (Tree p_node, Tree c_node ){
boolean temp135;
boolean temp134;
Tree temp133;
boolean temp132;
int temp131;
Tree temp130;
boolean temp129;
boolean ntb;
boolean temp137;
boolean temp136;
temp129 = c_node.GetHas_Left();
while(temp129){
temp130 = c_node.GetLeft();
temp131 = temp130.GetKey();
temp132 = c_node.SetKey(temp131);
ntb = temp132;
p_node = c_node;
temp133 = c_node.GetLeft();
c_node = temp133;
temp129 = c_node.GetHas_Left();
}
temp134 = p_node.SetLeft(my_null);
ntb = temp134;
temp135 = false;
temp136 = p_node.SetHas_Left(temp135);
ntb = temp136;

temp137 = true;

return temp137;
}
public int Search (int v_key ){
boolean temp146;
boolean temp145;
Tree temp144;
Tree current_node;
boolean temp143;
boolean temp142;
int temp141;
int temp140;
boolean temp151;
int ifound;
int temp150;
int key_aux;
boolean cont;
boolean temp139;
Tree temp138;
boolean temp149;
Tree temp148;
boolean temp147;
temp138 = this;
current_node = temp138;
temp139 = true;
cont = temp139;
temp140 = 0;
ifound = temp140;
while(cont){
temp141 = current_node.GetKey();
key_aux = temp141;
temp142 = v_key < key_aux;
if(temp142){
temp143 = current_node.GetHas_Left();
if(temp143){
temp144 = current_node.GetLeft();
current_node = temp144;
}
else{
temp145 = false;
cont = temp145;
}
}
else{
temp146 = key_aux < v_key;
if(temp146){
temp147 = current_node.GetHas_Right();
if(temp147){
temp148 = current_node.GetRight();
current_node = temp148;
}
else{
temp149 = false;
cont = temp149;
}
}
else{
temp150 = 1;
ifound = temp150;
temp151 = false;
cont = temp151;
}
}
}


return ifound;
}
public boolean Print ( ){
boolean temp155;
Tree current_node;
boolean temp154;
Tree temp153;
Tree temp152;
boolean ntb;
temp152 = this;
current_node = temp152;
temp153 = this;
temp154 = temp153.RecPrint(current_node);
ntb = temp154;

temp155 = true;

return temp155;
}
public boolean RecPrint (Tree node ){
Tree temp157;
boolean temp156;
boolean temp167;
boolean temp166;
boolean temp165;
Tree temp164;
Tree temp163;
boolean temp162;
int temp161;
boolean temp160;
boolean ntb;
boolean temp159;
Tree temp158;
temp156 = node.GetHas_Left();
if(temp156){
temp157 = this;
temp158 = node.GetLeft();
temp159 = temp157.RecPrint(temp158);
ntb = temp159;
}
else{
temp160 = true;
ntb = temp160;
}
temp161 = node.GetKey();
System.out.println(temp161);
temp162 = node.GetHas_Right();
if(temp162){
temp163 = this;
temp164 = node.GetRight();
temp165 = temp163.RecPrint(temp164);
ntb = temp165;
}
else{
temp166 = true;
ntb = temp166;
}

temp167 = true;

return temp167;
}
}
