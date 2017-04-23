class Amstrong { 
public static void main ( String [ ] a13 ) { 
ANumber a13 ; 
int b14 ; 
int Amstrong_a6 ; 
int Amstrong_b7 ; 
int Amstrong_temp8 ; 
int Amstrong_c9 ; 
boolean Amstrong_x10 ; 
int x15 ; 
boolean Amstrong_y11 ; 
ANumber main_ANumber_temp16 ; 
int main_ANumber_temp17 ; 
int Amstrong_n12 ; 
a13 = new ANumber ( ) ; 
x15 = 153 ; 
Amstrong_n12 = x15;
main_ANumber_temp16 = a13 ; 
Amstrong_c9 = 0 ; 
Amstrong_x10 = Amstrong_c9 < Amstrong_n12 ; 
while ( Amstrong_x10 ) { 
Amstrong_b7 = main_ANumber_temp16 . DivByTen ( Amstrong_n12 ) ; 
Amstrong_a6 = Amstrong_n12 - Amstrong_b7 ; 
Amstrong_n12 = Amstrong_b7 ; 
Amstrong_b7 = Amstrong_a6 * Amstrong_a6 ; 
Amstrong_b7 = Amstrong_a6 * Amstrong_b7 ; 
Amstrong_c9 = Amstrong_c9 + Amstrong_b7 ; 
} 
Amstrong_b7 = Amstrong_n12 - Amstrong_c9 ; 
Amstrong_y11 = ! Amstrong_b7 ; 
if ( Amstrong_y11 ) Amstrong_a6 = 0 ; 
else Amstrong_a6 = 1 ; 
main_ANumber_temp17 = Amstrong_a6 ; 
b14 = main_ANumber_temp17 ; 
System.out.println ( b14 ) ; 
} 
} 
class ANumber { 
public int Compute ( int n12 ) { 
int a6 ; 
int b7 ; 
int temp8 ; 
int c9 ; 
boolean x10 ; 
boolean y11 ; 
c9 = 0 ; 
x10 = c9 < n12 ; 
while ( x10 ) { 
b7 = this . DivByTen ( n12 ) ; 
a6 = n12 - b7 ; 
n12 = b7 ; 
b7 = a6 * a6 ; 
b7 = a6 * b7 ; 
c9 = c9 + b7 ; 
} 
b7 = n12 - c9 ; 
y11 = ! b7 ; 
if ( y11 ) a6 = 0 ; 
else a6 = 1 ; 
return a6 ; 
} 
public int DivByTen ( int n5 ) { 
boolean a0 ; 
int one1 ; 
int x2 ; 
int y3 ; 
int ten4 ; 
y3 = 0 ; 
x2 = 10 ; 
one1 = 1 ; 
ten4 = 10 ; 
a0 = x2 < n5 ; 
while ( a0 ) { 
y3 = y3 + one1 ; 
x2 = x2 + ten4 ; 
} 
return y3 ; 
} 
} 
 