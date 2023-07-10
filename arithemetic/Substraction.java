package arithemetic;
interface sub
{
void subtract(int a,int b);
} 
public class Substraction implements sub
{
public void subtract(int a,int b)
{
int c=a-b;
System.out.println("the difference is :"+c);
}
}
