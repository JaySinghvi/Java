import java.util.Scanner;
import java.util.GregorianCalendar;
import java.io.*;
class Person1{
private String name;
private GregorianCalendar DOB;
Person1(String name, int day, int month, int year)
{
this.name=name;
this.DOB=new GregorianCalendar(year,month,day);
}
public void display()
{
System.out.println("Name: "+this.name);
System.out.println("DOB : "+this.DOB.get(DOB.DATE)+"/"+this.DOB.get(DOB.MONTH)+"/"+this.DOB.get(DOB.YEAR));
}
public static void main(String[] args)
{
System.out.println("");
}
}
class collegeGraduate extends Person1{
private float gpa;
private int gradyr;
collegeGraduate(String name, int day, int month, int year, float gpa, int gradyr)
{
super(name,day,month,year);
this.gpa=gpa;
this.gradyr=gradyr;
}
public void display()
{
System.out.println("DETAILS: ");
super.display();
System.out.println("GPA: "+this.gpa);
System.out.println("Graduation year: "+gradyr);
System.out.println(" ");
}
}
class Person{
public static void main(String[] args)throws IOException
{
Scanner sc=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("What is the strength?");
int n=sc.nextInt();
collegeGraduate[] persons=new collegeGraduate[n];
for(int i=0;i<n;i++)
{
System.out.println("ENTER STUDENT "+(i+1)+"'s DETAILS");
System.out.println("ENTER NAME: ");
String nm=br.readLine();
System.out.println("ENTER BIRTH DATE: ");
int dy=sc.nextInt();
System.out.println("ENTER BIRTH MONTH: ");
int mon=sc.nextInt();
System.out.println("ENTER BIRTH YEAR: ");
int yr=sc.nextInt();
System.out.println("ENTER GRAD YEAR: ");
int gyr=sc.nextInt();
System.out.println("ENTER GPA ");
float gpa=sc.nextFloat();
persons[i]=new collegeGraduate(nm,dy,mon,yr,gpa,gyr);
}
for(int i=0;i<n;i++)
{
persons[i].display();
}
}
}