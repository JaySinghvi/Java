import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
class search
{ public static void main (String args[])
{ Scanner sc = new Scanner(System.in);
  System.out.println("Enter length:");
  int n = sc.nextInt();
  
  String arr[] = new String[n];
  System.out.println("Enter str:");
for(int i = 0; i < n; i++)
{
  arr[i] = sc.nextLine();
}
 
  System.out.println("Enter str to search:");
 String str = sc.nextLine();

for (String element: arr)  
    {  
      if (element.contains(str))     
      {  
         System.out.println(str+ " is present");  
          break;  
      }  
     else
{
      System.out.println(str+"not there");}
   }
  

   

}
}


  
  