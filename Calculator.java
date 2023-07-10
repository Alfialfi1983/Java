import arithemetic.*;
import java.util.Scanner;
public class Calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
Sum Sum=new Sum();
Sum.adding(a,b);
Substraction s=new Substraction();
s.subtract(a,b);
division d=new division();
d.dividing(a,b);
multiplication m=new multiplication();
m.multiplying(a,b);
}
}
