import java.util.*;
class product
  {
    String pcode;
    String pname;
    int price;
    product(String pcode_get,String pname_get,int price_get)
      {
        pcode=pcode_get;
	pname=pname_get;
	price=price_get;
      }

    public static void main(String[] args)
      {
        product p1 = new product("A","TV",10000);
        product p2 = new product("B","mobile",8000);
        product p3 = new product("C","Clock",5000);
        if(p1.price<p2.price && p1.price<p3.price)
          {
	    System.out.println("\nLowest price is "+p1.pname);
	  }
	if(p2.price<p1.price && p2.price<p3.price)
          {
	     System.out.println("\nLowest price is "+p2.pname);
	  }
	if(p3.price<p1.price && p3.price<p2.price)
          {
	     System.out.println("\nLowest price is "+p3.pname);
	  }
 
      }
  }
