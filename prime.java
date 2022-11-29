import java.util.*;
class prime
{
private static boolean isPrime(int n)
{
int c = 0;
for(int i = 2; i <= n/2; i++)
{
if(n%i == 0)
c++;
}
if(c>0)
return false;
return true;

}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter N: ");
int N = sc.nextInt();
int count = 0;
int i = 2;
while(count<N)
{
if(isPrime(i))
{
System.out.println(i);
count++;
}
i++;
}
}
}
