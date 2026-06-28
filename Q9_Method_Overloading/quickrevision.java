public class quickrevision {
    /*
=================================================
JAVA NUMERIC DATA TYPES (PRIMITIVE TYPES)
=================================================

Type      Size      Example
------------------------------------------
byte      1 byte    byte a = 100;
short     2 bytes   short b = 30000;
int       4 bytes   int c = 100000;
long      8 bytes   long d = 10000000000L;

float     4 bytes   float e = 3.14f;
double    8 bytes   double f = 3.1415926535;

char      2 bytes   char g = 'A';
boolean   JVM Dep.  boolean h = true;

=================================================
INTEGER HIERARCHY (WIDENING)
=================================================

byte
  ↓
short
  ↓
int
  ↓
long
  ↓
float
  ↓
double

Examples:

int x = 10;
long y = x;      // int -> long

long a = 100;
float b = a;     // long -> float

float c = 10.5f;
double d = c;    // float -> double

=================================================
OVERLOADING RESOLUTION PRIORITY
=================================================

1. Exact Match
2. Widening Conversion
3. Autoboxing
4. Varargs

Example:

add(int,int)      ← chosen
add(long,long)

add(5,10);

Because exact match wins.

=================================================
AUTOBOXING
=================================================

Primitive     Wrapper Class
---------------------------
byte          Byte
short         Short
int           Integer
long          Long
float         Float
double        Double
char          Character
boolean       Boolean

Examples:

int x = 5;
Integer y = x;      // Autoboxing

Integer a = 10;
int b = a;          // Unboxing

=================================================
COMMON LITERALS
=================================================

5       -> int
5L      -> long
5.0     -> double
5.0f    -> float
'A'     -> char
true    -> boolean

=================================================
MEMORY TRICK
=================================================

Whole Numbers:
byte < short < int < long

Decimal Numbers:
float < double

Default Integer  -> int
Default Decimal  -> double
=================================================
*/
}
