class TC2 { 
public static void main ( String [ ] args ) { 
boolean TC2_b26 ; 
int main_C2_temp11 ; 
C2 main_C2_temp10 ; 
C2 c0 ; 
int y1 ; 
int TC2_one37 ; 
int TC2_x48 ; 
int TC2_y59 ; 
c0 = new C2 ( ) ; 
y1 = 10 ; 
TC2_x48 = y1;
main_C2_temp10 = c0 ; 
TC2_one37 = 1 ; 
TC2_b26 = TC2_x48 < TC2_one37 ; 
if ( TC2_b26 ) TC2_y59 = TC2_x48 ; 
else { 
TC2_x48 = TC2_x48 - TC2_one37 ; 
TC2_y59 = main_C2_temp10 . get ( TC2_x48 ) ; 
} 
main_C2_temp11 = TC2_y59 ; 
y1 = main_C2_temp11 ; 
} 
} 
class C2 { 
public int get ( int x4 ) { 
boolean b2 ; 
int one3 ; 
int y5 ; 
one3 = 1 ; 
b2 = x4 < one3 ; 
if ( b2 ) y5 = x4 ; 
else { 
x4 = x4 - one3 ; 
y5 = this . get ( x4 ) ; 
} 
return y5 ; 
} 
} 
 