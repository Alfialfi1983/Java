package arithemetic;
interface sub
{
void subtract(int a,int b);
} 
public class Subtracting implements add
{
public void subtract(int a,int b)
{
int c=a+b;
System.out.println("the sum is :"+c);
}
}
