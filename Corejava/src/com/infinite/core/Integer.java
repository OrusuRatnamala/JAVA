import java.util.*;

public class Integer
 {    
    public static void main(String[] args) 
{        
        Scanner sc= new Scanner(System.in);        
        
        boolean condition=true;
        int firstValue=0;
        int secondValue=0;
        int thirdValue=0;
        while(condition)
{
            try
{
                System.out.print("Enter first integer value:"); 
                firstValue=sc.nextInt();  
                condition=false;
            }
            catch(Exception e)
{
                System.out.println("Input should be integer");
                sc.nextLine();
            }
        }
        condition=true;
        while(condition)
{
            try
{
                System.out.print("Enter Second integer value:"); 
                secondValue=sc.nextInt();  
                condition=false;
            }
            catch(Exception e){
                System.out.println("Input should be integer");
                sc.nextLine();
            }
        }
        condition=true;
        while(condition)
{
            try
{
                System.out.print("Enter third integer value:"); 
                thirdValue=sc.nextInt();  
                condition=false;
            }
            catch(Exception e){
                System.out.println("Input should be integer");
                sc.nextLine();
            }
        }
            
        String lowest= firstValue < secondValue ? (firstValue < thirdValue ? "firstValue" : "thirdValue"):(secondValue < thirdValue ? "secondValue" : "thirdValue");
        
        String highest=firstValue > secondValue ? (firstValue > thirdValue ? "firstValue" : "thirdValue"):(secondValue > thirdValue ? "secondValue" : "thirdValue");
        
        System.out.println("Lowest value variable name is:"+lowest);
        System.out.println("highest value variable name is:"+highest);
    }
    
}
