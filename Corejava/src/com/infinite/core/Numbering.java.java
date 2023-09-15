import java.util.*;


public class Numbering
 {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);


boolean condition = true;
int firstValue = 0;
int secondValue = 0;

while(condition)
{
try
 {
System.out.print("Enter first interger value:");
firstValue = sc.nextInt();
condition = false;
}
catch(Exception e){
System.out.println("input should be integer");
sc.nextLine();
} P
}
condition = true;
while(condition)
{
try 
{
System.out.print("Enter second interger value:");
secondValue = sc.nextInt();
condition = false;
}
catch(Exception e)
{
System.out.println("input should be integer");
sc.nextLine();
}
}
if(firstValue > 0 && firstValue < 10 && secondValue > 0 && secondValue < 10)
System.out.println("Single Digit Number");
System.out.println("Doesn't satisfied the condition");
}
}





