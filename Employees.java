import java.util.*;
class Employees
{
int eno;
String ename;
double salary;
public void getdetails(){
        System.out.println("\nEnter the Employee details");
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee number : ");
        eno=sc.nextInt();
        System.out.println("Name : ");
        sc.nextLine();
        ename=sc.nextLine();
        System.out.println("Salary : ");
        salary=sc.nextDouble(); 
}
void display()
{
        System.out.println("Empolyee No :"+eno);
        System.out.println("Name :"+ename);
        System.out.println("Salary Amount"+salary+"\n");
}
public static void main(String[] args) 
{
System.out.println("\nEnter the number of Employees");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
Employees arr[]=new Employees[num];
for(int i =0;i<num;i++)
{
arr[i]=new Employees();
arr[i].getdetails();
}
boolean state = false;
System.out.println("\nEnter the Employee Number to search");
int num2= sc.nextInt();
for(int i=0;i<num;i++)
{
if(arr[i].eno==num2)
{
System.out.println("\nEmployee details");
arr[i].display();
}
else
{
System.out.println("the employee number not found");
}
}    
}
}
