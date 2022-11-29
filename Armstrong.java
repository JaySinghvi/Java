import java.util.*;
import java.lang.Math;
class Armstrong
{ static boolean isArmstrong (int n)
{ int t, digits=0, last=0, sum=0;
t = n;
while(t > 0)
{t = t/10;
digits++;
last = t % 10;
sum += (Math.pow(last,digits));
t = t /10;
}
if (n == sum)
return false;
return true;
}
public static void main (String args[])
{ Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int n = sc.nextInt();
if(isArmstrong(n))
{ System.out.println("It is Armstrong");}
else
{System.out.println("It is not armstrong");
}
}
}