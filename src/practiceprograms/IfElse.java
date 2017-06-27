package practiceprograms;

import java.util.Scanner;

public class IfElse {
public static void main(String[] args){
	int marksObtained, passingScore ;
	
	passingScore=40;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Your marks");
	marksObtained= scan.nextInt();
	if (marksObtained >= passingScore){
		System.out.println("You have passed the Exam");
	}
		else {
			System.out.println("You have failed the Exam");
		}
		}
	}


