class LinkedList {
public static void main(String[] a){
LL temp0;
int temp1;
temp0 = new LL();
temp1 = temp0.Start();
System.out.println(temp1);

}
}
class Element {
int Salary;
boolean Married;
int Age;
public boolean Init (int v_Age, int v_Salary, boolean v_Married ){
boolean temp2;
Age = v_Age;
Salary = v_Salary;
Married = v_Married;

temp2 = true;

return temp2;
}
public int GetAge ( ){


return Age;
}
public int GetSalary ( ){


return Salary;
}
public boolean GetMarried ( ){


return Married;
}
public boolean Equal (Element other ){
boolean temp11;
boolean temp12;
boolean temp13;
boolean temp14;
int nt;
int temp20;
Element temp10;
int aux01;
boolean temp19;
int aux02;
boolean ret_val;
boolean temp15;
boolean temp3;
boolean temp16;
int temp17;
boolean temp18;
boolean temp6;
boolean temp7;
int temp4;
Element temp5;
boolean temp8;
int temp9;
temp3 = true;
ret_val = temp3;
temp4 = other.GetAge();
aux01 = temp4;
temp5 = this;
temp6 = temp5.Compare(aux01,Age );
temp7= !temp6;
if(temp7){
temp8 = false;
ret_val = temp8;
}
else{
temp9 = other.GetSalary();
aux02 = temp9;
temp10 = this;
temp11 = temp10.Compare(aux02,Salary );
temp12= !temp11;
if(temp12){
temp13 = false;
ret_val = temp13;
}
else{
if(Married){
temp14 = other.GetMarried();
temp15= !temp14;
if(temp15){
temp16 = false;
ret_val = temp16;
}
else{
temp17 = 0;
nt = temp17;
}
}
else{
temp18 = other.GetMarried();
if(temp18){
temp19 = false;
ret_val = temp19;
}
else{
temp20 = 0;
nt = temp20;
}
}
}
}


return ret_val;
}
public boolean Compare (int num1, int num2 ){
int temp22;
int temp23;
boolean temp24;
boolean temp25;
boolean temp21;
int aux02;
boolean temp26;
boolean temp27;
boolean retval;
boolean temp28;
boolean temp29;
temp21 = false;
retval = temp21;
temp22 = 1;
temp23 = num2 + temp22;
aux02 = temp23;
temp24 = num1 < num2;
if(temp24){
temp25 = false;
retval = temp25;
}
else{
temp26 = num1 < aux02;
temp27= !temp26;
if(temp27){
temp28 = false;
retval = temp28;
}
else{
temp29 = true;
retval = temp29;
}
}


return retval;
}
}
class List {
Element elem;
List next;
boolean end;
public boolean Init ( ){
boolean temp30;
boolean temp31;
temp30 = true;
end = temp30;

temp31 = true;

return temp31;
}
public boolean InitNew (Element v_elem, List v_next, boolean v_end ){
boolean temp32;
end = v_end;
elem = v_elem;
next = v_next;

temp32 = true;

return temp32;
}
public List Insert (Element new_elem ){
List temp33;
List temp34;
boolean temp35;
boolean temp36;
List aux03;
List aux02;
boolean ret_val;
temp33 = this;
aux03 = temp33;
temp34 = new List();
aux02 = temp34;
temp35 = false;
temp36 = aux02.InitNew(new_elem,aux03 ,temp35 );
ret_val = temp36;


return aux02;
}
public boolean SetNext (List v_next ){
boolean temp37;
next = v_next;

temp37 = true;

return temp37;
}
public List Delete (Element e ){
int temp55;
List temp56;
boolean temp57;
int temp58;
boolean aux05;
boolean temp51;
int aux04;
List temp52;
int nt;
int temp53;
List prev;
int temp54;
List aux01;
int temp59;
List temp38;
boolean temp39;
boolean var_end;
int temp50;
Element var_elem;
List temp44;
int temp66;
boolean temp45;
int temp67;
boolean temp46;
boolean temp47;
int temp40;
boolean temp62;
int temp41;
List temp63;
int temp42;
boolean temp64;
List temp43;
Element temp65;
boolean ret_val;
boolean temp48;
boolean temp49;
int temp60;
int temp61;
List my_head;
temp38 = this;
my_head = temp38;
temp39 = false;
ret_val = temp39;
temp40 = 0;
temp41 = 1;
temp42 = temp40 - temp41;
aux04 = temp42;
temp43 = this;
aux01 = temp43;
temp44 = this;
prev = temp44;
var_end = end;
var_elem = elem;
temp45= !var_end;
temp46= !ret_val;
temp47 = temp45 & temp46;
while(temp47){
temp48 = e.Equal(var_elem);
if(temp48){
temp49 = true;
ret_val = temp49;
temp50 = 0;
temp51 = aux04 < temp50;
if(temp51){
temp52 = aux01.GetNext();
my_head = temp52;
}
else{
temp53 = 0;
temp54 = 555;
temp55 = temp53 - temp54;
System.out.println(temp55);
temp56 = aux01.GetNext();
temp57 = prev.SetNext(temp56);
aux05 = temp57;
temp58 = 0;
temp59 = 555;
temp60 = temp58 - temp59;
System.out.println(temp60);
}
}
else{
temp61 = 0;
nt = temp61;
}
temp62= !ret_val;
if(temp62){
prev = aux01;
temp63 = aux01.GetNext();
aux01 = temp63;
temp64 = aux01.GetEnd();
var_end = temp64;
temp65 = aux01.GetElem();
var_elem = temp65;
temp66 = 1;
aux04 = temp66;
}
else{
temp67 = 0;
nt = temp67;
}
temp45= !var_end;
temp46= !ret_val;
temp47 = temp45 & temp46;
}


return my_head;
}
public int Search (Element e ){
int temp68;
List temp69;
int temp73;
List temp74;
int nt;
boolean temp75;
Element temp76;
List aux01;
int int_ret_val;
boolean temp70;
boolean temp71;
boolean var_end;
int temp72;
Element var_elem;
temp68 = 0;
int_ret_val = temp68;
temp69 = this;
aux01 = temp69;
var_end = end;
var_elem = elem;
temp70= !var_end;
while(temp70){
temp71 = e.Equal(var_elem);
if(temp71){
temp72 = 1;
int_ret_val = temp72;
}
else{
temp73 = 0;
nt = temp73;
}
temp74 = aux01.GetNext();
aux01 = temp74;
temp75 = aux01.GetEnd();
var_end = temp75;
temp76 = aux01.GetElem();
var_elem = temp76;
temp70= !var_end;
}


return int_ret_val;
}
public boolean GetEnd ( ){


return end;
}
public Element GetElem ( ){


return elem;
}
public List GetNext ( ){


return next;
}
public boolean Print ( ){
List temp77;
boolean temp78;
int temp79;
List aux01;
List temp80;
boolean temp81;
Element temp82;
boolean var_end;
boolean temp83;
Element var_elem;
temp77 = this;
aux01 = temp77;
var_end = end;
var_elem = elem;
temp78= !var_end;
while(temp78){
temp79 = var_elem.GetAge();
System.out.println(temp79);
temp80 = aux01.GetNext();
aux01 = temp80;
temp81 = aux01.GetEnd();
var_end = temp81;
temp82 = aux01.GetElem();
var_elem = temp82;
temp78= !var_end;
}

temp83 = true;

return temp83;
}
}
class LL {
public int Start ( ){
List temp124;
boolean temp123;
boolean temp122;
int temp121;
int temp120;
Element temp119;
int temp118;
int temp117;
int temp116;
boolean temp115;
boolean temp114;
int temp133;
int temp132;
boolean temp131;
List temp130;
int temp129;
boolean temp128;
List temp127;
int temp126;
boolean temp125;
boolean temp99;
boolean temp102;
List temp101;
boolean temp100;
int temp95;
Element el03;
Element temp96;
Element el02;
int temp97;
Element el01;
int temp98;
boolean aux01;
List head;
boolean temp91;
boolean temp92;
List temp93;
boolean temp94;
int temp90;
Element temp88;
int temp113;
List last_elem;
int temp89;
int temp112;
Element temp111;
boolean temp110;
List temp84;
boolean temp85;
boolean temp86;
boolean temp87;
List temp109;
boolean temp108;
boolean temp107;
int temp106;
int temp105;
Element temp104;
int temp103;
temp84 = new List();
last_elem = temp84;
temp85 = last_elem.Init();
aux01 = temp85;
head = last_elem;
temp86 = head.Init();
aux01 = temp86;
temp87 = head.Print();
aux01 = temp87;
temp88 = new Element();
el01 = temp88;
temp89 = 25;
temp90 = 37000;
temp91 = false;
temp92 = el01.Init(temp89,temp90 ,temp91 );
aux01 = temp92;
temp93 = head.Insert(el01);
head = temp93;
temp94 = head.Print();
aux01 = temp94;
temp95 = 10000000;
System.out.println(temp95);
temp96 = new Element();
el01 = temp96;
temp97 = 39;
temp98 = 42000;
temp99 = true;
temp100 = el01.Init(temp97,temp98 ,temp99 );
aux01 = temp100;
el02 = el01;
temp101 = head.Insert(el01);
head = temp101;
temp102 = head.Print();
aux01 = temp102;
temp103 = 10000000;
System.out.println(temp103);
temp104 = new Element();
el01 = temp104;
temp105 = 22;
temp106 = 34000;
temp107 = false;
temp108 = el01.Init(temp105,temp106 ,temp107 );
aux01 = temp108;
temp109 = head.Insert(el01);
head = temp109;
temp110 = head.Print();
aux01 = temp110;
temp111 = new Element();
el03 = temp111;
temp112 = 27;
temp113 = 34000;
temp114 = false;
temp115 = el03.Init(temp112,temp113 ,temp114 );
aux01 = temp115;
temp116 = head.Search(el02);
System.out.println(temp116);
temp117 = head.Search(el03);
System.out.println(temp117);
temp118 = 10000000;
System.out.println(temp118);
temp119 = new Element();
el01 = temp119;
temp120 = 28;
temp121 = 35000;
temp122 = false;
temp123 = el01.Init(temp120,temp121 ,temp122 );
aux01 = temp123;
temp124 = head.Insert(el01);
head = temp124;
temp125 = head.Print();
aux01 = temp125;
temp126 = 2220000;
System.out.println(temp126);
temp127 = head.Delete(el02);
head = temp127;
temp128 = head.Print();
aux01 = temp128;
temp129 = 33300000;
System.out.println(temp129);
temp130 = head.Delete(el01);
head = temp130;
temp131 = head.Print();
aux01 = temp131;
temp132 = 44440000;
System.out.println(temp132);

temp133 = 0;

return temp133;
}
}
