package arithemetic;
interface mult
{
void multiplying(int a,int b);
} 
public class multiplication implements mult
{
public void multiplying(int a,int b)
{
int c=a*b;
System.out.println("the product is :"+c);
}
}
