import java.util.*;
class oddeven
  {
    public static void main(String args[])
      {
        System.out.println("Enter the number : ");
        Scanner n=new Scanner(System.in);
	int num=n.nextInt();
	if(num%2==0)
	  {
	    System.out.println("The number is Even");
	  }
	else
	  {
	    System.out.println("The number is odd");
	  }
      }
  }
