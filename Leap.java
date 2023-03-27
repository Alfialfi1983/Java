import java.util.*;
class Leap
{
public static void main(String args[])
{
int i;
int year1,year2;
System.out.println("enter the current year:");
Scanner sc=new Scanner(System.in);
year1=sc.nextInt();
System.out.println("enter the future year:");
year2=sc.nextInt();
for(i=year1;i<=year2;i++)
{
if((i%4==0)&&(i%100!=0)||(i%400==0))
{
System.out.println(i);
}
}
}
}

