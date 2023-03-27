import java.util.*;
class rectangle
  {
    double breadth=13;
    double length=12.48;
    double area=length*breadth;
    public void setdata()
      {
        System.out.println("Area of a rectangle ");
        System.out.println("Length is "+length);
	System.out.println("Breadth is "+breadth); 
      }
    public double getarea()
      {
	System.out.println("Area is "+area);
	return area;
      }
    public static void main(String args[])
      {
        rectangle obj1=new rectangle();
	obj1.setdata();
	obj1.getarea();
      }
  }
