class armstrong
{
public static void main(String args[])
{
int n=153;s=0;r;
int temp=n;
while(n>0)
{
r=n%10;
s=s+r*r*r;
n=n/10;
}
if(s==temp)
{
System.out.println("Given no is armstrong");
}
else
{
System.out.println("no is not armstrong");
}
}}
