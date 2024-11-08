import java.util.Scanner;
     
class Student{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int sno,sub1,sub2,sub3;
String sname;
float savg;

System.out.println("Enter student no is:");
sno=sc.nextInt();
System.out.println("Enter sub1 is:");
sub1=sc.nextInt();
System.out.println("Enter sub2 no is:");
sub2=sc.nextInt();
System.out.println("Enter sub3 no is:");
sub3=sc.nextInt();
System.out.println("Enter student name is:");
sname=sc.next();
int total=(sub1+sub2+sub3);
int avg=(total/3);


System.out.println("The student no is:"+sno);
System.out.println("The sub1 is:"+sub1);
System.out.println("The sub2is:"+sub2);
System.out.println("The sub3 is:"+sub3);
System.out.println("The student name is:"+sname);
System.out.println("The average is:"+avg);
}
}