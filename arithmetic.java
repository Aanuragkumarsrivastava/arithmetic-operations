//enter two number and do different arithmetic operations on the input numbers
import java.util.Scanner;

public class Main   //class main
{

	public static void main(String[] args) 
	{
    
		Scanner input = new Scanner(System.in);
   
		System.out.println("enter first number");
    
		int a = input.nextInt();
   // enter the first number 
		System.out.println("enter second number");
    
		int b = input.nextInt();
    //enter the second number
		int c = a*b;
     // product of two numbers are saved to variable c 
		int d = a+b;
    //sum of two numbers are saved to variable d
		int e = a-b;
     //second number will be substracted from first number and result will be saved to variable e
		int f = a/b;
     //division between first and second number
		System.out.println(c+"\n"+d+"\n"+e+"\n"+f); //print the output of result of various arithmetic operations
	
  } 

}
