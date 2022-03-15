package Basiccommands;
//Q 2 using ternary check if number eneterd by user is positive or negative .
//In case number is positive store "Positive number" else store negative number 
//to Result variable
import java.util.*;
public class Ternaryche {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		number =s.nextInt();
		String result= number <0 ? "number is negative" : "number is positive";
		System.out.println(result);			
       
		}

}
