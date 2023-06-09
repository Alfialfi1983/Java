import java.util.*;
class Shape
{

void area(int side)
{
double square=side*side;
System.out.println("the area of the sqare is:"+square);
}
void area(double r)
{
double circle=3.14*r*r;
System.out.println("the area of the circle is:"+circle);
}
void area(int l,int b)
{
int rect=l*b;
System.out.println("the area of the rctangle is:"+rect);
}
public static void main(String args[])
{
Shape obj = new Shape();
Scanner sc = new Scanner(System.in);
System.out.println(" Area of different shapes using overloaded functions ");
System.out.println("\nRECTANGLE");
System.out.println("Enter the length and breadth:");
int l = sc.nextInt();
int b = sc.nextInt();
obj.area(l,b);
System.out.println("\nSQUARE");
System.out.println("Enter the side:");
int s = sc.nextInt();
obj.area(s);
System.out.println("\nCIRCLE");
System.out.println("->Enter the radius:");
double r = sc.nextDouble();
obj.area(r);
sc.close();
}
}
