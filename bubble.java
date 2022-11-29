import java.util.Scanner;
class bubble{

static void sort(int[] a)
{
int x=a.length;
int t;
for(int i=0;i<x-1;i++)
{
for(int j=0;j<x-1;j++)
{
if(a[j+1]>a[j])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("descending");
for(int i=0;i<x;i++)
{
System.out.print(a[i]+" ");                           // it will print all outputs in one line, instead of putting, like in C after identifier, we put +, and then comment statement in double quotes
}

for(int i=0;i<x-1;i++)
{
for(int j=0;j<x-1;j++)
{
if(a[j+1]<a[j])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println();
System.out.println("ascending");
for(int i=0;i<x;i++)
{
System.out.print(a[i]+" ");
}
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array length");
int n=sc.nextInt();           // read array length
int arr[]=new int[n];       // dynamic memory allocation
for(int i=0;i<n;i++)
{
System.out.println("enter the "+(i+1)+"th element");
arr[i]=sc.nextInt();

}
sort(arr);
}
}
