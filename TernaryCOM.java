package Basiccommands;
//ASSIGNMENT:-1 (QUE 1)
//wap to demonstrate ternary operator .define a variable marks ask its value from user and 
//using ternary operator check if marks > 40 store "Pass" in result variable else store "Fail"
import java.util.Scanner;
public class TernaryCOM {

	public static void main(String[] args) {
		int marks;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Marks");
		marks =s.nextInt();
		String result= marks >40 ? "pass" : "fail";
		System.out.println(result);
		
	}

}
