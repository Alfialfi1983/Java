package arithemetic;
interface div
{
void dividing(int a,int b);
} 
public class division implements div
{
public void dividing(int a,int b)
{
int c=a/b;
System.out.println("the division is :"+c);
}
}
