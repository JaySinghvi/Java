import java.util.*;
class grades
{ public static void main(String args[])
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of subjects");
n = sc.nextInt();
String marks[] = new String[n];

Scanner s1 = new Scanner(System.in);
for(int i = 0; i < n; i++)
{ System.out.println("Enter marks for"+(i+1)+" sub: ");
  marks[i] = s1.nextLine();
}

Float GPA[] = new Float[n];
Float add = 0f;
Scanner s2 = new Scanner(System.in);
for(int i = 0; i < n; i++)
{ System.out.println("Enter GPA for"+(i+1)+" sub: ");
  GPA[i] = s2.nextFloat();
  add += GPA[i];
}

float CGPA = (add/n);

System.out.println("CGPA is: "+CGPA);

}
}

