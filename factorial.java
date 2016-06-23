class factorial
{
public static void main(String args[])
{
int i,n,fact=1;
Scanner f=new Scanner(System.in);
System.out.println("enter the vaulue of n:");
n=f.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
System.out.println(fact);
}}
}
