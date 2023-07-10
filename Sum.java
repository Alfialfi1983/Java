package arithemetic;
interface add
{
void adding(int a,int b);
} 
public class Sum implements add
{
public void adding(int a,int b)
{
int c=a+b;
System.out.println("the sum is :"+c);
}
}
