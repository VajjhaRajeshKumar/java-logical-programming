import java.util.Scanner;
     
class Product{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int pno;
String pname;
float pcost;
float pqty;

System.out.println("Enter product no is:");
pno=sc.nextInt();
System.out.println("Enter product name is:");
pname=sc.next();
System.out.println("Enter product cost is:");
pcost=sc.nextFloat();
System.out.println("Enter product quantity is:");
pqty=sc.nextFloat();
float bill=pcost*pqty;

System.out.println("The given product no is:"+pno);
System.out.println("The given product name is:"+pname);
System.out.println("The given product cost is:"+pcost);
System.out.println("The given product quantity is:"+pqty);
System.out.println("The bill is:"+bill);
}
}