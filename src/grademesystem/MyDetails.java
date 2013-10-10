package grademesystem;

import java.util.Scanner;

public class MyDetails {

	public static void main(String[]args){
	String FirstName;
	String LastName;
	String CourseName;
	String RegNumber;
	int StudentNumber;
	String FirstCourseUnit,SecondCourseUnit,ThirdCourseUnit,ForthCourseUnit,FifthCourseUnit,SixCourseUnit;
	int creditUnits;
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your first name: ");
	FirstName=input.nextLine();
	
	System.out.println("Please enter your second name: ");
	LastName =input.nextLine();
	
	System.out.println("Please enter your course name: ");
	CourseName = input.nextLine();
	
	System.out.println("Please enter your Reg_Number: ");
	RegNumber =input.nextLine();
	
	System.out.println("Please enter your student number: ");
	StudentNumber = input.nextInt();
	
	System.out.println("Please enter your first CourseUnits");
	FirstCourseUnit=input.nextLine();
	System.out.println("Please enter your second CourseUnits");
	SecondCourseUnit=input.nextLine();
	System.out.println("Please enter your third CourseUnits");
	ThirdCourseUnit=input.nextLine();
	System.out.println("Please enter your fourth CourseUnits");
	ForthCourseUnit=input.nextLine();
	System.out.println("Please enter your fifth CourseUnits");
	FifthCourseUnit=input.nextLine();
	System.out.println("Please enter your six CourseUnits");
	SixCourseUnit=input.nextLine();
	
	
	System.out.printf("These are your details below:\n");
	
	
	System.out.println(FirstName);
	System.out.println(LastName);
	System.out.println(CourseName);
	System.out.println(RegNumber);
	System.out.println(StudentNumber);
	
	System.out.println("These are your Six Course Units:\n");
	System.out.println(FirstCourseUnit);
	System.out.println(SecondCourseUnit);
	System.out.println(ThirdCourseUnit);
	System.out.println(ForthCourseUnit);
	System.out.println(FifthCourseUnit);
	System.out.println(SixCourseUnit);
	
	
	
	
	}
	
	
	}

		
	
    
    

		
	
