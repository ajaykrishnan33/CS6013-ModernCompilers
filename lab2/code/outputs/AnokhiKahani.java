class AnokhiKahani {
public static void main(String[] args){
MeraBeta temp0;
int temp1;
temp0 = new MeraBeta();
temp1 = temp0.chalu();
System.out.println(temp1);

}
}
class MeraBeta {
ParentDoer merabaap;
public int chalu ( ){
int temp11;
MeraBeta temp12;
int temp13;
int temp14;
int temp10;
int i;
ParentDoer temp2;
ParentDoer temp3;
int p;
int temp6;
int temp7;
boolean temp4;
int temp5;
int temp8;
boolean temp9;
temp2 = new ParentDoer();
temp3 = temp2.chalu();
merabaap = temp3;
temp4 = merabaap.khush();
if(temp4){
temp5 = 420;
System.out.println(temp5);
}
else{
temp6 = 666;
System.out.println(temp6);
}
temp7 = 0;
i = temp7;
temp8 = merabaap.getKhushiLimit();
temp9 = i < temp8;
while(temp9){
temp12 = this;
temp13 = temp12.pranaam();
p = temp13;
temp10 = 1;
temp11 = i + temp10;
i = temp11;
temp8 = merabaap.getKhushiLimit();
temp9 = i < temp8;
}

temp14 = 9211;

return temp14;
}
public int pranaam ( ){
int temp22;
int temp23;
int mila;
boolean temp24;
boolean temp25;
int temp20;
int temp21;
boolean temp19;
int temp15;
boolean temp26;
int temp16;
int temp27;
int temp17;
boolean temp18;
int p;
int gaya;
boolean tohkya;
temp15 = 420;
mila = temp15;
temp16 = 0;
gaya = temp16;
temp17 = merabaap.pranaamReceive();
p = temp17;
temp18 = merabaap.khush();
tohkya = temp18;
temp19= !tohkya;
temp20 = 2;
temp21 = 3;
temp22 = temp20 + temp21;
temp23 = 10;
temp24 = temp22 < temp23;
temp25 = temp19 & temp24;
temp26= !temp25;
if(temp26){
System.out.println(mila);
}
else{
System.out.println(gaya);
}

temp27 = 420;

return temp27;
}
}
class ParentDoer {
int khushiLimit;
ParentDoer mai;
boolean aashirwaad;
int pranaamCount;
public ParentDoer chalu ( ){
int temp33;
ParentDoer temp34;
int temp35;
ParentDoer temp30;
boolean temp31;
ParentDoer temp32;
ParentDoer temp28;
ParentDoer temp29;
temp28 = this;
temp29 = this;
temp28.mai = temp29;
temp30 = this;
temp31 = false;
temp30.aashirwaad = temp31;
temp32 = this;
temp33 = 0;
temp32.pranaamCount = temp33;
temp34 = this;
temp35 = 50;
temp34.khushiLimit = temp35;


return mai;
}
public int pranaamReceive ( ){
boolean temp44;
int temp45;
ParentDoer temp46;
int temp36;
boolean temp47;
boolean temp40;
boolean temp41;
boolean temp42;
ParentDoer temp43;
int temp37;
int temp48;
boolean temp38;
boolean temp39;
temp36 = 1;
temp37 = pranaamCount + temp36;
pranaamCount = temp37;
temp38 = pranaamCount < khushiLimit;
temp39= !temp38;
temp40 = khushiLimit < pranaamCount;
temp41= !temp40;
temp42 = temp39 & temp41;
if(temp42){
temp43 = this;
temp44 = true;
temp43.aashirwaad = temp44;
temp45 = 0;
pranaamCount = temp45;
}
else{
temp46 = this;
temp47 = false;
temp46.aashirwaad = temp47;
}

temp48 = 15;

return temp48;
}
public boolean khush ( ){


return aashirwaad;
}
public int getKhushiLimit ( ){


return khushiLimit;
}
}
