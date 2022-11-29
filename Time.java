class Time{
int hrs;
int min;
int sec;

public Time()
{hrs = 0;
 min = 0;
 sec = 0;
}

public Time(int hh, int mm, int ss)
{
this.hrs=hh;
this.min=mm;
this.sec=ss;
}
void display(){
System.out.println(hrs+":"+min+":"+sec);
}
Time add(Time t1, Time t2)
{
Time t3=new Time();
t3.hrs=t1.hrs+t2.hrs;
t3.min=t1.min+t2.min;
t3.sec=t1.sec+t2.sec;
if((t3.sec6%0)>0){
t3.min=t3.min+(t3.sec/60);
t3.sec=t3.sec%60;
}
if((t3.min)%60>0)
{
t3.hrs=t3.hrs+(t3.min/60);
t3.min=t3.min%60;
}
return t3;
}
Time sub(Time t1, Time t2)
{
Time t3=new Time();
int T1=t1.hrs*3600+t1.min*60+t1.sec;
int T2=t2.hrs*3600+t2.min*60+t2.sec;
int T3=0;
if(T2>T1)
T3=T2-T1;
else
T3=T1-T2;
t3.hrs=T3/3600;
T3=T3%3600;
t3.min=T3/60;
T3=T3%60;
t3.sec=T3;
return t3;
}

void compare(Time t1, Time t2)
{
Time t3=new Time();
int T1=t1.hrs*3600+t1.min*60+t1.sec;
int T2=t2.hrs*3600+t2.min*60+t2.sec;
int T3=t3.hrs*3600+t3.min*60+t3.sec;
if(T2>T1)
{
t2.display();
System.out.println("between the two, t2 is greater");
}
else if(T2<T1)
{
t1.display();
System.out.println("between the two, t1 is greater");
}
else
{
System.out.println("both objects are equal");
}
}

public static void main(String[] args)
{
Time t1=new Time(4,10,15);
Time t2=new Time(5,9,10);
Time t4=new Time();
System.out.println("t1: ");
t1.display();
System.out.println("t2: ");
t2.display();

t4.compare(t1,t2);
t4=t4.add(t1,t2);
System.out.println("after addition");
t4.display();
t4=t4.sub(t1,t2);
System.out.println("after subtraction");
t4.display();
}
}
