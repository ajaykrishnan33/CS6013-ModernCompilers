class testcase3 {
public static void main(String[] args){
notExp temp0;
boolean temp1;
temp0 = new notExp();
temp1 = temp0.method1();
System.out.println(temp1);

}
}
class notExp {
public boolean method1 ( ){
boolean temp4;
boolean temp5;
int temp2;
int temp3;

temp2 = 1;
temp3 = 2;
temp4 = temp2 < temp3;
temp5= !temp4;

return temp5;
}
}
