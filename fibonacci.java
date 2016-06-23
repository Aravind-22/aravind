import java.util.Scanner;
public class fibonacci
{
public static void main(String args[])
{
int a=0,b=1,c,n,i;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of n:");
n=s.nextInt();
for(i=1;i<n;i++)
{
c=a+b;
a=b;
b=c;
}
System.out.println(c);
}}
