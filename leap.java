import java.util.Scanner;
class leap 
{
public static void main(String[] args) 
{
int year;
Scanner s=new Scanner(System.in);
System.out.println("Enter the year");
year=s.nextInt();
if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
{
System.out.println("Year " + year + " is a leap year");
}
else
{
System.out.println("Year " + year + " is not a leap year");
}
}
}
 
