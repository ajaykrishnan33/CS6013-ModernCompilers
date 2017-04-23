class Simple {
public static void main(String[] abc){
int temp2;
cond temp0;
int temp1;
temp0 = new cond();
temp1 = 1;
temp2 = temp0.tx(temp1);
System.out.println(temp2);

}
}
class cond {
public int tx (int z ){
int temp6;
boolean temp4;
int temp5;
int g;
int temp3;
temp3 = 1;
temp4 = z < temp3;
if(temp4){
temp5 = 0;
g = temp5;
}
else{
temp6 = 1;
g = temp6;
}


return g;
}
}
